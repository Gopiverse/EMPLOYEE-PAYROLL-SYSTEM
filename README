# Employee Payroll Management System

A simple **command-line Employee Payroll Management System** developed using **Java**, **JDBC**, and **MySQL**. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on employee records through a menu-driven interface.

---

## Features

* ➕ Add a new employee
* 📋 Display all employees
* 🔍 Search an employee by ID
* 💰 Update employee salary
* ❌ Delete an employee
* 💾 MySQL database integration using JDBC
* 🖥️ Menu-driven command-line interface

---

## Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL
* MySQL Connector/J

---

## Project Structure

```text
Employee-Payroll-System/
│
├── src/
│   ├── DBConnection.java
│   ├── Employee.java
│   ├── EmployeeCRUD.java
│   └── Main.java
│
├── README.md
└── .gitignore
```

> **Note:** The MySQL Connector/J JAR file is **not included** in this repository. Please download it separately.

---

## Database Setup

### 1. Create a MySQL database

```sql
CREATE DATABASE payroll;
```

### 2. Use the database

```sql
USE payroll;
```

### 3. Create the employees table

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL
);
```

---

## Configure Database Connection

Open **`DBConnection.java`** and update the following values:

```java
private static final String URL = "jdbc:mysql://localhost:3306/payroll";
private static final String USER = "YOUR_USERNAME";
private static final String PASSWORD = "YOUR_PASSWORD";
```

Replace:

* `YOUR_USERNAME` → your MySQL username (e.g., `root`)
* `YOUR_PASSWORD` → your MySQL password

---

## Download MySQL Connector/J

Download the latest MySQL Connector/J from:

https://dev.mysql.com/downloads/connector/j/

Extract the ZIP and place the JAR file inside a `lib` folder:

```text
lib/
└── mysql-connector-j-9.7.0.jar
```

---

## Compile

From the project root directory:

```bash
javac -cp "lib/mysql-connector-j-9.7.0.jar;src" src\*.java
```

---

## Run

```bash
java -cp "lib/mysql-connector-j-9.7.0.jar;src" Main
```

---

## Sample Output

```text
=================================Employee Payroll System=================================

1. Add Employee
2. Display Employees
3. Search Employee
4. Update Salary
5. Delete Employee
6. Exit

Enter Choice :
```

---

## Available Operations

### Add Employee

```
Enter Name
Enter Department
Enter Salary
Enter ID
```

### Display Employees

Displays all employee records stored in the database.

### Search Employee

Searches an employee using the Employee ID.

### Update Salary

Updates the salary of an existing employee.

### Delete Employee

Deletes an employee record using the Employee ID.

---

## Future Improvements

* Employee login authentication
* Department management
* Salary slip generation
* Attendance and leave management
* Input validation
* PreparedStatement for enhanced SQL security

---

## Author

**Gopika GS**
