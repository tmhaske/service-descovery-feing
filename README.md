🎮 Games Microservices Architecture with Eureka, OpenFeign & Docker
```
This repository showcases a microservices-based architecture for a gaming application ecosystem. The project demonstrates the integration of Spring Cloud Eureka for service discovery, OpenFeign for inter-service communication (instead of RestTemplate), and Docker for containerization and orchestration using Docker Compose.
```

🧱 Microservices Overview
```
The system is composed of the following microservices:

Eureka Server: Central registry where all microservices register themselves.
Games Library Service: Exposes APIs to fetch available games.
Games Genre Service: Provides genre-specific data for games.
Games Publisher Service: Handles publisher-related data for games.
Games Aggregator Service: Aggregates data from all services above using OpenFeign clients.
All microservices are:

Spring Boot applications
Registered with Eureka
Dockerized
Interconnected using Docker Compose
```

⚙️ Tech Stack
```
Java 17
Spring Boot
Spring Cloud Eureka (Service Discovery)
OpenFeign (Declarative REST Client)
MySQL (with dummy data)
Docker & Docker Compose
```

🐳 Docker Setup
```
Each microservice has its own Dockerfile and is configured to work in a Docker network.
```

✅ To run all services:
```
docker compose up --build
```
This command:
Builds Docker images for all services
Starts MySQL with dummy video_games data
Launches Eureka server
Brings up all microservices and registers them with Eureka

🗂 Directory Structure
```
├── docker-compose.yml
├── mysql-init/                  # SQL dump or init scripts for video_games DB
├── server-registry/            # Eureka server
├── games-library/              # Game library microservice
├── game-genre/                 # Genre microservice
├── game-publisher/             # Publisher microservice
├── game-aggregator-service/    # Aggregator using OpenFeign
```
🧪 Features Service Discovery using Eureka
```
Declarative REST clients using OpenFeign
Dockerized microservices for seamless deployment
Centralized DB using MySQL
Fully managed using Docker Compose
```
🛠️ Prerequisites
```
Ensure the following are installed on your system:
Docker
Docker Compose
Java 17 (for development outside containers)
```
🌐 Accessing Services
```
Once Docker Compose is up:
Eureka Dashboard: http://localhost:8761
Games Aggregator Service: http://localhost:8085
You can use Postman or curl to test APIs.
```
📌 Note
```
Inter-service communication is done via OpenFeign instead of RestTemplate.
Each service has its own application.yml configured with Docker-specific environment variables.
```
