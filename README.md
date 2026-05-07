# 🚀 Spring Boot REST API — User Management

A clean, production-ready RESTful API built with **Spring Boot 4.0** and **Java 25**, exposing full CRUD operations for user management backed by a MySQL database.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Framework | Spring Boot 4.0.6 |
| Language | Java 25 |
| Web | Spring MVC (`spring-boot-starter-webmvc`) |
| Persistence | Spring Data JPA + Hibernate |
| Database | MySQL 8+ |
| Utilities | Lombok |
| Dev Tools | Spring Boot DevTools |
| Testing | Spring Boot Test, Spring Data JPA Test |
| Build | Maven |

---

## 📁 Project Structure

```
src/
└── main/
    └── java/com/java/api/springbootrestapi/
        ├── controller/
        │   └── UserController.java      # REST endpoints
        ├── service/
        │   └── UserService.java         # Business logic
        ├── dto/
        │   └── UserDto.java             # Data Transfer Object
        ├── model/
        │   └── User.java                # JPA Entity
        └── repository/
            └── UserRepository.java      # Spring Data JPA repo
```

---

## 📡 API Endpoints

Base URL: `/api/v1/users`

| Method | Endpoint | Description | Request Body | Response |
|--------|----------|-------------|--------------|----------|
| `GET` | `/api/v1/users` | Get all users | — | `List<UserDto>` |
| `GET` | `/api/v1/users/{id}` | Get user by ID | — | `UserDto` |
| `POST` | `/api/v1/users` | Create a new user | `UserDto` | `UserDto` |
| `PUT` | `/api/v1/users` | Update an existing user | `UserDto` | `UserDto` |
| `DELETE` | `/api/v1/users/{id}` | Delete user by ID | — | `void` |

### Example — Create User

**Request:**
```http
POST /api/v1/users
Content-Type: application/json

{
  "name": "Hamid Elharouachi",
  "email": "hamid@example.com"
}
```

**Response `200 OK`:**
```json
{
  "id": 1,
  "name": "Hamid Elharouachi",
  "email": "hamid@example.com"
}
```

---

## ⚙️ Configuration

Create `src/main/resources/application.properties` (or `.yml`) and configure your MySQL connection:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

server.port=8080
```

> ⚠️ Never commit credentials to version control. Use environment variables or a `.env` file in production.

---

## 🚀 Getting Started

### Prerequisites

- Java 25+
- Maven 3.9+
- MySQL 8+

### Run locally

```bash
# 1. Clone the repository
git clone https://github.com/hamid2010/spring-boot-rest-api.git
cd spring-boot-rest-api

# 2. Create the MySQL database
mysql -u root -p -e "CREATE DATABASE spring_api_db;"

# 3. Configure application.properties (see above)

# 4. Build and run
mvn spring-boot:run
```

The API will be available at `http://localhost:8080/api/v1/users`.

---

## 🧪 Running Tests

```bash
mvn test
```

Tests use `spring-boot-starter-webmvc-test` and `spring-boot-starter-data-jpa-test` for slice testing of controllers and repositories.

---

## 🔮 Possible Improvements

- [ ] Add input validation (`@Valid`, `@NotNull`, `@Email`)
- [ ] Global exception handling (`@ControllerAdvice`)
- [ ] Spring Security + JWT authentication
- [ ] API documentation with Springdoc OpenAPI / Swagger UI
- [ ] Pagination and sorting for `GET /users`
- [ ] Docker + Docker Compose setup
- [ ] CI/CD pipeline with GitHub Actions

---

## 👤 Author

**Hamid** — Full Stack / Backend Developer  
📍 Milano, Italy  
https://www.linkedin.com/in/hamid-elharouachi/
🔗 [github.com/hamid2010](https://github.com/hamid2010)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
