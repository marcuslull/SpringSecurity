# Project: Spring Security Deep Dive

## 1. Introduction
This document outlines the requirements for a project designed to explore and demonstrate various aspects of Spring Security. The project will focus on core Spring Security features, excluding OAuth and LDAP, to provide a deep understanding of authentication and authorization mechanisms.  The project will cover role-based access control (RBAC) for web applications, JWT-based security for REST APIs, and method-level security.

## 2. Goals
- Implement role-based access control for a simple web application.
- Secure a RESTful API using JWT.
- Implement method-level security to restrict access to specific methods.
- Utilize an H2 database for persistence.
- Use Spring Web for web and REST endpoints.

## 3. Functional Requirements

### 3.1 Web Application (RBAC)
- User Registration: Users should be able to register with a username and password.
- Roles: Users will be assigned roles (e.g., ADMIN, USER).
- Access Control: Different web pages will be accessible based on the user's role. For example:
  - /home: Accessible to all authenticated users.
  - /admin: Accessible only to users with the ADMIN role.
  - /user: Accessible only to users with the USER role.
- Login/Logout: Standard login and logout functionality.

### 3.2 REST API (JWT)
- Authentication: Users can authenticate via a POST request to /auth/login with username and password and receive a JWT upon successful authentication.
- Authorization: API endpoints will be protected and require a valid JWT in the Authorization header.
- Role-Based Access: API endpoints will enforce role-based access control. For example:
  - /api/admin: Accessible only to users with the ADMIN role.
  - /api/user: Accessible only to users with the USER role.
- Endpoints: At least two secured API endpoints should be implemented (one for ADMIN and one for USER role access).

### 3.3 Method-Level Security
- Service/Controller Methods: Implement method-level security using annotations like @PreAuthorize, @PostAuthorize, or @Secured.
- Access Control: Access to specific methods within services or controllers will be restricted based on roles or permissions.
- Example: A service method to delete a user should only be accessible to users with the ADMIN role.

## 4. Non-Functional Requirements
- Security: Passwords should be securely stored using a strong password encoder (e.g., BCryptPasswordEncoder). JWTs should be properly signed and validated.
- Performance: The application should be reasonably performant.
- Maintainability: The code should be well-structured, readable, and easy to maintain.

## 5. Technical Requirements
- Java: Use the latest stable version of Java.
- Spring Boot: Use Spring Boot to simplify dependency management and auto-configuration.
- Spring Security: Use Spring Security for authentication and authorization.
- Spring Web: Use Spring Web for creating REST controllers and serving web content
- H2 Database: Use H2 as an embedded database for persistence.
- JWT Library: Use a suitable library for generating and parsing JWTs (e.g., JJWT).
- Build Tool: Maven

## 6. Deliverables
- Source code for the project.
- This requirements document.

## 7. Development Process
- Iterative development with frequent commits.
- Use of a version control system (e.g., Git).