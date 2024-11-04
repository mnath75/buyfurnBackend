package com.buyfurn.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.buyfurn.model.Product;
import com.buyfurn.service.ProductServices;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductServices productServices;

	@PostMapping(value = "/admin/addproduct", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public Product addProduct(@RequestPart("product") String productJson, @RequestPart("imgs") MultipartFile[] images)
			throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Product product = objectMapper.readValue(productJson, Product.class);
		return productServices.addProduct(product, images);
	}

	@GetMapping("/getallproducts")
	public List<Product> getAllProducts() {
		return productServices.getAllProducts();
	}

	@GetMapping("/getbyid/{id}")
	public Product getbyId(@PathVariable Long id) {
		return productServices.getById(id);
	}

	@PostMapping(value = "/admin/updateproduct", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public Product updateProduct(@RequestPart("product") String prod,
				@RequestPart(value = "img", required = false) MultipartFile[] image) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Product product = objectMapper.readValue(prod, Product.class);
		return productServices.updateProduct(product, image);
	}

	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/admin/deletebyid/{id}")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
		
			
		String response = productServices.deleteById(id);
		if ("Product Deleted !!".equals(response)) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}