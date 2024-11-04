
# BuyFurn Backend

This is the backend for the BuyFurn e-commerce platform, built using Spring Boot. It provides REST APIs for product management, user authentication, order processing, and admin functions.

## Tech Stack
- **Java 11**
- **Spring Boot**
- **MySQL** for database
- **Swagger** for API documentation

## Getting Started

### Prerequisites
- **Java 11**
- **MySQL**
- **Gradle**

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mnath75/buyfurnBackend.git
   ```
2. Configure the MySQL database in `application.properties`.
3. Build and run the project:
   ```bash
   gradle build
   gradle bootRun
   ```

## API Documentation
The API documentation is available at `/swagger-ui/index.html`.

### Controllers and API Endpoints

#### User Controller
Handles user-related actions.

- **POST /api/user/register** - Register a new user.
- **POST /api/user/login** - Authenticate user login.
- **GET /api/user/profile** - Get user profile details.
- **PUT /api/user/profile** - Update user profile.

#### Product Controller
Manages product information.

- **GET /api/products** - Get a list of all products.
- **GET /api/products/{id}** - Retrieve product details by ID.
- **GET /api/products/category/{category}** - Get products by category.
- **POST /api/products** - Add a new product (admin).
- **PUT /api/products/{id}** - Update product details (admin).
- **DELETE /api/products/{id}** - Delete a product (admin).

#### Order Controller
Handles order processing and tracking.

- **POST /api/orders** - Place a new order.
- **GET /api/orders/{id}** - Get order details by ID.
- **GET /api/orders/user/{userId}** - List all orders for a user.

#### Admin Controller
Admin functionalities for managing users and products.

- **GET /api/admin/products** - Admin access to product management.
- **GET /api/admin/users** - List and manage users.

## Security
This backend uses Spring Security with roles for `USER` and `ADMIN` access control. The `BCryptPasswordEncoder` is used for password encryption.

## Contributing
1. Fork the project.
2. Create a new branch (`feature/YourFeature`).
3. Commit your changes.
4. Push to the branch and open a pull request.

## License
This project is licensed under the MIT License.
