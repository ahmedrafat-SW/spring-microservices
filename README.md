# Spring Microservices

![144061535-7a42e85b-59d6-4f7f-9c35-18a48b49e6de](https://github.com/ahmedrafat-SW/spring-microservices/assets/129176607/daeda45e-f9c1-48b2-81da-771c394666cf)

## About

This repository demonstrates the implementation of a microservices architecture using the Spring framework.

## Structure

The repository contains the following main components:

### 1. Services
- **Customer Service**: Located in the `customer` directory.
- **Fraud Service**: Located in the `fraud` directory.
- **Eureka Server**: Located in the `eureka-server` directory.

### 2. Configuration Files
- **Docker Compose**: `docker-compose.yml` for container orchestration.
- **Maven Build File**: `pom.xml` for managing dependencies.

## Features

- **Service Discovery**: Using Eureka Server for registering and discovering microservices.
- **Docker**: Containerization of services.
- **Kubernetes**: Deployment configurations for managing containerized applications.
- **RabbitMQ**: Messaging between services.
- **PostgreSQL**: Database for storing service data.
- **Spring Security**: Securing the microservices.
- **Spring Boot**: Framework for creating production-ready applications.
- **Zipkin**: Distributed tracing system for monitoring and troubleshooting.
- **Spring Cloud**: Tools for building cloud-native applications.
- **Kafka**: Messaging system for building real-time data pipelines and streaming apps.
- **Spring Data JPA**: Data access abstraction.

## API Documentation

### Customer Service API

#### `POST /api/v1/customers`
Creates a new customer.

- **Request Body**: `CustomerRequest`
- **Response**: `201 Created` with `CustomerResponse`

#### `GET /api/v1/customers/{id}`
Retrieves customer details by ID.

- **Path Variable**: `id` (long)
- **Response**: `200 OK` with `CustomerResponse`

### Fraud Service API

#### `GET /api/v1/fraud-check/{customerId}`
Checks if a customer is fraudulent.

- **Path Variable**: `customerId` (long)
- **Response**: `200 OK` with `FraudCheckResponse`

### Eureka Server

The Eureka Server does not expose REST APIs for client interaction. It is used for service discovery within the microservices architecture.

## How to Use

1. **Clone the repository**:
   ```sh
   git clone https://github.com/ahmedrafat-SW/spring-microservices.git
