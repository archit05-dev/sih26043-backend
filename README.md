# SIH 26043 Backend

Backend implementation for **Smart India Hackathon 2025** - **Problem Statement 26043**

## Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Lombok

---

# Project Setup

## 1. Clone the Repository

```bash
git clone <repository-url>
cd backend
```

---

## 2. Create the Database

Open MySQL and execute:

```sql
CREATE DATABASE sih26043;
```

---

## 3. Configure Environment

Copy the example configuration file:

```text
application-dev.properties.example
        ↓
application-dev.properties
```

Fill in your local database credentials.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sih26043
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

jwt.secret=YOUR_SECRET_KEY
jwt.expiration=86400000

ml.service.url=http://localhost:5000
```

> **Note:** `application-dev.properties` is ignored by Git and should never be committed.

---

## 4. Run the Application

Run:

```
BackendApplication.java
```

or

```bash
mvn spring-boot:run
```

On the first run Hibernate will automatically create all database tables.

---

# Branching Strategy

Never commit directly to `main`.

Create your own feature branch:

```bash
git checkout -b your-branch-name
```

Example:

```bash
git checkout -b archit-part-a
```

---

# Current Project Structure

```
src/main/java/com/sih26043/backend

├── admin
├── auth
├── challenge
├── comment
├── common
├── config
├── milestone
├── ml
├── notification
├── submission
├── team
├── university
└── user
```

---

# Implemented

- Project setup
- Package structure
- Database configuration
- BaseEntity
- Enums
- User entities
- Repository layer
- JPA configuration

---

# Tech Architecture

```
Frontend (React)

        │

        ▼

Spring Boot Backend

        │

        ├── MySQL

        └── Flask ML Service
```

---

# Team Workflow

1. Pull latest changes from `main`.
2. Create a feature branch.
3. Implement your module.
4. Commit changes.
5. Push your branch.
6. Create a Pull Request.
7. Merge only after testing.

---

# Notes

- Java 21
- MySQL database name: `sih26043`
- Spring Boot automatically creates tables.
- Flask ML service runs separately on port **5000** during development.