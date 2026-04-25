# Housing Society Management Platform - Phase 1

Phase 1 implementation includes:
- Spring Boot 3 + Java 21 setup
- PostgreSQL integration (JPA/Hibernate)
- Redis setup
- JWT auth (register/login)
- RBAC with ADMIN/USER
- Resident CRUD APIs
- Validation + global exception handling
- Swagger/OpenAPI
- Docker Compose for local dependencies

## Run locally

### 1) Start infrastructure
```bash
docker compose up -d postgres redis
```

### 2) Run application
```bash
mvn clean spring-boot:run
```

### 3) Open Swagger
- http://localhost:8080/swagger-ui/index.html

### 4) Health endpoint
```bash
curl http://localhost:8080/actuator/health
```

## Auth flow

### Register admin
```bash
curl -X POST http://localhost:8080/api/v1/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "name":"Admin User",
    "email":"admin@example.com",
    "password":"Admin@123",
    "role":"ADMIN"
  }'
```

### Login
```bash
curl -X POST http://localhost:8080/api/v1/auth/login \
  -H "Content-Type: application/json" \
  -d '{"email":"admin@example.com","password":"Admin@123"}'
```

Copy `accessToken` from the response and use:
`Authorization: Bearer <token>`

## Example resident create
```bash
curl -X POST http://localhost:8080/api/v1/residents \
  -H "Authorization: Bearer <token>" \
  -H "Content-Type: application/json" \
  -d '{
    "fullName":"John Doe",
    "phone":"9876543210",
    "email":"john.doe@example.com",
    "flatNumber":"A-101",
    "floorNumber":1,
    "residentType":"OWNER"
  }'
```
