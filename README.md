<div align="center">

<img src="https://capsule-render.vercel.app/api?type=transparent&height=120&text=HOLOGRAM%20REST%20API&fontColor=00E5FF&fontSize=45&desc=User%20Management%20System&descAlignY=75&descAlign=50&animation=fadeIn" />

<br/>

![Java](https://img.shields.io/badge/Java-25-00E5FF?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.6-8A2BE2?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0-00E5FF?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Ready-8A2BE2?style=for-the-badge&logo=docker&logoColor=white)
![OpenAPI](https://img.shields.io/badge/OpenAPI-Swagger-00E5FF?style=for-the-badge&logo=swagger&logoColor=white)

</div>

---

## 🧊 1. Overview — Interfaccia Olografica

Questa API REST implementa un sistema di gestione utenti con:

- Architettura modulare
- DTO + Mapper
- Validazione input
- Exception handler globale
- Swagger / OpenAPI
- Dockerfile + docker-compose
- Risposte standardizzate in stile glass‑UI

---

## 🧩 2. Architettura del progetto

```
src/main/java/com/java/api/springbootrestapi
 ├── controller/        # REST endpoints
 ├── service/           # Business logic
 │    └── impl/
 ├── repository/        # JPA Repository
 ├── dto/               # Data Transfer Objects
 ├── model/             # JPA Entities
 ├── mapper/            # DTO ↔ Entity
 ├── exception/         # Global error handling
 ├── config/            # Swagger/OpenAPI
 └── util/              # ApiResponse wrapper
```

---

## 🛰️ 3. Endpoints REST

| Metodo | Endpoint | Descrizione |
|--------|----------|-------------|
| `POST` | `/api/v1/users` | Crea un utente |
| `GET` | `/api/v1/users/{id}` | Ottiene un utente per ID |
| `GET` | `/api/v1/users` | Lista tutti gli utenti |
| `PUT` | `/api/v1/users/{id}` | Aggiorna un utente |
| `DELETE` | `/api/v1/users/{id}` | Elimina un utente |

---

## 🧪 4. Esempio di richiesta

### ➕ Creazione utente

```http
POST /api/v1/users
Content-Type: application/json

{
  "firstName": "Hamid",
  "lastName": "Elharouachi",
  "email": "hamid@example.com"
}
```

### ✔️ Risposta

```json
{
  "success": true,
  "message": "User created",
  "data": {
    "id": 1,
    "firstName": "Hamid",
    "lastName": "Elharouachi",
    "email": "hamid@example.com"
  }
}
```

---

## 🐳 5. Avvio con Docker (Glass Mode)

### 🔧 Build del progetto

```bash
mvn clean package -DskipTests
```

### 🚀 Avvio con Docker Compose

```bash
docker-compose up --build
```

### 🌍 Servizi disponibili

| Servizio | URL |
|----------|-----|
| API | http://localhost:8080/api/v1/users |
| Swagger UI | http://localhost:8080/swagger-ui.html |
| MySQL | localhost:3307 |

---

## 📘 6. Configurazione `application.yml`

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3307/springboot_rest_api
    username: root
    password: ${DB_PASSWORD}

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        dialect: org.hibernate.dialect.MySQLDialect

server:
  port: 8080
```

> ⚠️ Non committare mai credenziali. Usa variabili d'ambiente o un file `.env`.

---

## 🧠 7. Tecnologie utilizzate

| Tecnologia | Versione |
|------------|----------|
| Java | 25 |
| Spring Boot | 4.0.6 |
| Spring Data JPA | — |
| MySQL | 8+ |
| Lombok | — |
| Springdoc OpenAPI | — |
| Docker & Docker Compose | — |

---

## 🛡️ 8. DevSecOps Ready

- ✅ Validazione input (`@Valid`, `@NotBlank`, `@Email`)
- ✅ Exception handler globale (`@ControllerAdvice`)
- ✅ Struttura pulita e scalabile
- ✅ Docker-ready
- ✅ OpenAPI documentato

---

## 🧬 9. Possibili estensioni olografiche

- [ ] Ruoli & permessi (Spring Security + JWT)
- [ ] Logging avanzato (ELK Stack)
- [ ] Test automatici (JUnit 5 + Mockito)
- [ ] Rate limiting
- [ ] Caching con Redis
- [ ] CI/CD con GitHub Actions

---

## 👨‍💻 10. Autore

**Hamid Elharouachi**  
https://www.linkedin.com/in/hamid-elharouachi/
Backend & DevSecOps Engineer  
🔗 [github.com/hamid2010](https://github.com/hamid2010)

---

<div align="center">

<img src="https://capsule-render.vercel.app/api?type=transparent&height=120&text=HOLOGRAM%20INTERFACE%20ONLINE&fontColor=8A2BE2&fontSize=40&animation=fadeIn" />

🧊✨ *"Smooth. Transparent. Futuristic."* ✨🧊

</div>
