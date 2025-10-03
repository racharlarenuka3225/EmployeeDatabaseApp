Employee Database App (Java JDBC)
Description

A simple Java application that connects to a MySQL/PostgreSQL database and performs CRUD (Create, Read, Update, Delete) operations on an employee table. This project demonstrates basic JDBC usage and database connectivity in Java.

Tools & Technologies

Java (JDK 8 or above)

MySQL / PostgreSQL

JDBC Driver

VS Code / IDE of your choice

Features

Add new employees

View all employees

Update employee details

Delete employees

Database Setup
CREATE DATABASE company;

USE company;

CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

How to Run

Clone the repository:

git clone <repo-url>


Import the project into your IDE.

Add JDBC driver to the project classpath.

Update database connection credentials in DBConnection.java.

Run the main class and perform CRUD operations.

Code Structure

DBConnection.java – Handles database connection

EmployeeDAO.java – Contains CRUD operations

Employee.java – Employee model class

Main.java – Entry point to test operations

Author

Racharla Renuka
