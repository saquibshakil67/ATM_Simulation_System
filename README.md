# ATM Simulation System 🏧

A Java-based console application that simulates the core functionality of an automated teller machine. This project demonstrates strong Object-Oriented Programming (OOP) design by separating the user interface, business logic, and data models into distinct classes.

## 📂 Project Structure
* **`ATMSimulation.java`**: The entry point containing the main interaction loop, menu system, and user authentication flow.
* **`ATMService.java`**: Handles business logic for withdrawals, deposits, and balance checks.
* **`Account.java`**: A secure model class using encapsulation (private fields) to protect user data like PIN and Balance.

## 🚀 Features
* **Secure Authentication:** Users must log in with a valid User ID and PIN before accessing the menu.
* **Interactive Menu:** A `while` loop drives a continuous session allowing multiple transactions until the user chooses to exit.
* **Input Handling:** Uses `java.util.Scanner` to capture and process user inputs dynamically.
* **Validation:** Logic included to prevent unauthorized access and handle invalid transaction requests.

## 🛠️ Usage
**Default Test Credentials:**
* **User ID:** `saquib67`
* **PIN:** `1234`

## 💻 Tech Stack
* **Language:** Java (JDK 21)
* **IDE:** IntelliJ IDEA
* **Concepts:** OOP, Encapsulation, Control Flow (Switch/Loops), Java Collections.
