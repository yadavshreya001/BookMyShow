# 🎬 BookMyShow - Low-Level Design

## 📖 Introduction

BookMyShow is a platform that enables users to book movie tickets, browse theatres, select seats, and make payments. This project focuses on the low-level design (LLD) of the BookMyShow system, emphasizing modularity, scalability, and maintainability.

## ✨ Features

### 👤 User Management

- User registration and login.

- Manage user profiles.

### 🎥 Movie and Theatre Listings

- Browse movies and associated theatres.
  
- Search for movies by city.

### 🎫 Booking Management

- Select shows, seats, and make bookings.
  
- View booking history and details.
  
### 💺 Seat Management

- Show seat availability in real-time.
  
- Different seat types (e.g., Regular, VIP).
  
### 💳 Payment Integration

- Support for multiple payment modes (Credit Card, Debit Card, UPI, etc.).
  
- Handle payment statuses (Success, Failed, Pending).
  
### 🛠️ Admin Functionalities

- Manage theatres, screens, and movies.
  
- Manage seat layouts and pricing.

## 🛠️ Tech Stack

- ☕ Programming Language: Java

- 🌐 Framework: Spring Boot

- 🗄️ Database: MySQL

- 🔧 Build Tool: Maven

- 🔀 Version Control: Git

## 🗂️ Modules and Responsibilities

### 1. 📡 Controllers

- BookingController: Handles APIs for booking management.
  
- UserController: Manages user-related actions like login and registration.
  
### 2. 📦 DTOs (Data Transfer Objects)

- CreateBookingRequestDto
  
- CreateBookingResponseDto
  
- SignUpRequestDto

- SignUpResponseDto
  
- LoginRequestDto
  
- ResponseStatus
  
### 3. 🗃️ Models

- Booking: Stores booking details.
  
- Movie: Represents movie details.
  
- Theatre: Represents theatres and their screens.
  
- Show: Stores show details (movie, screen, timing).
  
- Seat: Represents individual seat details and types.
  
- Payment: Handles payment details and statuses.
  
- User: Represents user details.
  
### 4. 💾 Repositories

- BookingRepository: Database operations for bookings.

- UserRepository: Database operations for users.

- ShowRepository: Database operations for shows.

- ShowSeatRepository: Database operations for show seats.

### 5. 🔧 Services
   
- BookingService: Handles core booking logic.

- PriceCalculationService: Calculates booking prices.

- UserService: Manages user-related business logic.

## 🏗️ Key Design Patterns

- 🔒 Singleton: Used for services to ensure a single instance per application context.

- 🏭 Factory: To create different types of payment modes.

- 📚 Repository: To abstract database operations.

- 📨 DTO: For clean API design and decoupling models from external layers.

## 🌟 Future Enhancements

- Integration with a CDN for better content delivery.
  
- Implementation of a loyalty rewards program.
  
- Addition of recommendation systems for personalized movie suggestions.



