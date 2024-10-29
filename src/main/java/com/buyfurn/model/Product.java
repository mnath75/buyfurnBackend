package com.buyfurn.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<ProductImages> productImages = new ArrayList<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Cart> carts = new ArrayList<>();
    
    
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetails> orderDetails = new ArrayList<>();
    
    private double price;
    private String warranty;
    private String category;
    private String color;
    
 
    private String material;
    
    private int seatingCapacity;
    private double weight;
    private String careAndMaintenance;
    private String stockStatus;

    
    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }
    
    public String getStockStatus() {
		return stockStatus;
	}

	public void setStockStatus(String stockStatus) {
		this.stockStatus = stockStatus;
	}

	public Product() {
        super();
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductImages> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<ProductImages> productImages) {
        this.productImages = productImages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCareAndMaintenance() {
        return careAndMaintenance;
    }

    public void setCareAndMaintenance(String careAndMaintenance) {
        this.careAndMaintenance = careAndMaintenance;
    }
}
