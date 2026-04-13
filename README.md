# GTM Transaction Service


A Spring Boot microservice for logging gas transmission transactions.

Tech Stack: Java 17, Spring Boot, JPA, H2, JUnit 5, Swagger UI.


## System Architecture

<img width="921" height="81" alt="GTM Transaction Service drawio" src="https://github.com/user-attachments/assets/e28bf1b1-7d60-4ed9-8afd-0f28fb720abd" />

## Project Structure

```text
.
├── src/main/java/com/enbridge/gtm/
│   ├── controller/      # REST API Endpoints (TransactionController)
│   ├── model/           # Data Entities (Transaction Entity)
│   ├── repository/      # JPA Data Access Layer (TransactionRepository)
│   ├── service/         # Business Logic & Custom Exceptions
│   └── GtmTransactionServiceApplication.java # App Entry Point
├── src/main/resources/
│   ├── application.properties  # App Configuration
│   └── data.sql                # Automated Database Seeding
└── src/test/java/              # Unit & Integration Tests
