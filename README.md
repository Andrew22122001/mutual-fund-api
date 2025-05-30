# Mutual Fund Order API

This is a Spring Boot REST API that allows users to create, view, and delete mutual fund orders. It uses an in-memory H2 database for quick testing and development.

## 🚀 Technologies Used
- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman (for API testing)

## 📦 Features
- `GET /api/orders` - List all orders
- `POST /api/orders` - Create a new order
- `DELETE /api/orders/{id}` - Delete order by ID
- Access H2 Console at `/h2-console`

## 🧪 How to Test
Use Postman to test the APIs:
1. Start the Spring Boot app
2. Test endpoints like:
   - `GET http://localhost:8080/api/orders`
   - `POST http://localhost:8080/api/orders`
   - `DELETE http://localhost:8080/api/orders/1`
3. Access H2 Console at:
   - `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`

## 🛠 Setup Instructions
```bash
git clone https://github.com/Andrew22122001/mutual-fund-api.git
cd mutual-fund-api
./mvnw spring-boot:run
