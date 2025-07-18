# Ecommerce Project API Documentation

## Table of Contents

1.  [Introduction](#introduction)
2.  [Prerequisites](#prerequisites)
3.  [Installation](#installation)
4.  [Configuration](#configuration)
5.  [Usage](#usage)
6.  [API Documentation](#api-documentation)
    *   [Update Cart Item](#update-cart-item)
    *   [Delete Cart Item](#delete-cart-item)
    *   [Add Item to Cart](#add-item-to-cart)
7.  [Components](#components)
    *   [Schemas](#schemas)
8.  [Servers](#servers)
9.  [Contributing](#contributing)
10. [License](#license)
11. [Contact](#contact)

## Introduction

This Git repository contains the Java Spring Boot source code for an e-commerce backend system with a RESTful API for browsing products, adding to cart, placing orders, and checking out. Built with a modular MVC architecture and backed by MySQL, it includes unit tests and documentation.

## Prerequisites

Before you begin, ensure you have met the following requirements:

*   Java Development Kit (JDK) 11 or higher
*   Maven
*   MySQL
*   Git

## Installation

1.  Clone the repository:

    ```bash
    git clone https://github.com/rohit-004/ecommerce-server.git
    cd ecommerce-server
    ```
2.  Install the dependencies:

    ```bash
    mvn install
    ```

## Configuration

1.  Configure the database settings in `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    ```

## Usage

1.  Run the application:

    ```bash
    mvn spring-boot:run
    ```
2.  Access the API endpoints using tools like `curl` or Postman.

## API Documentation

Welcome to the documentation for the Ecommerce Project API! This API provides a set of endpoints and functionalities to interact with our e-commerce platform programmatically. With this API, you can build applications, integrations, and automate various tasks related to our online store.

### Authentication

All protected endpoints require the `Authorization` header with a valid token.

### Endpoints

#### Update Cart Item

*   **URL**: `/api/cart_items/{cartItemId}`
*   **Method**: `PUT`
*   **Tags**: `cart-item-controller`
*   **Request Parameters**:
    *   `cartItemId` (integer, int64, required)
*   **Request Headers**:
    *   `Authorization` (string, required)
*   **Request Body**:

    ```json
    {
      "$ref": "#/components/schemas/CartItem"
    }
    ```
*   **Responses**:
    *   200 OK

        ```json
        {
          "$ref": "#/components/schemas/CartItem"
        }
        ```

#### Delete Cart Item

*   **URL**: `/api/cart_items/{cartItemId}`
*   **Method**: `DELETE`
*   **Tags**: `cart-item-controller`
*   **Request Parameters**:
    *   `cartItemId` (integer, int64, required)
*   **Request Headers**:
    *   `Authorization` (string, required)
*   **Responses**:
    *   200 OK

        ```json
        {
          "$ref": "#/components/schemas/ApiResponse"
        }
        ```

#### Add Item to Cart

*   **URL**: `/api/cart/add`
*   **Method**: `PUT`
*   **Tags**: `cart-controller`
*   **Request Headers**:
    *   `Authorization` (string, required)
*   **Request Body**:

    ```json
    {
      "$ref": "#/components/schemas/AddItemRequest"
    }
    ```
*   **Responses**:
    *   200 OK

        ```json
        {
          "$ref": "#/components/schemas/ApiResponse"
        }
        ```

## Components

### Schemas

*   CartItem
*   ApiResponse
*   AddItemRequest
*   Product
*   Order
*   User
*   AuthResponse
*   ReviewRequest
*   Review
*   RatingRequest
*   Rating
*   PaymentLinkResponse
*   Address
*   CreateProductRequest
*   PageProduct

## Servers

*   Server 1:
    *   URL: `http://localhost:5454`
    *   Description: Generated server URL

## Contributing

We welcome contributions to the Ecommerce Project API! If you'd like to contribute, please follow these guidelines:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and ensure they are well-tested.
4.  Submit a pull request with a clear description of your changes.

## License

This API is licensed under the [MIT License](LICENSE).

## Contact

For any queries or issues, please contact **Rohit Kandari** at [rohitkandari1977@gmail.com](mailto:rohitkandari1977@gmail.com).
