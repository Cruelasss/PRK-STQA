# PRK-STQA (Software Testing and Quality Assurance Practicum)

This repository contains an automated testing project for the **Manganshare** web application. This project is built using **Katalon Studio** to ensure that the core functionalities, user interfaces, and main features work as expected (Quality Assurance).

## 🛠️ Technologies & Tools
*   **Katalon Studio** - The primary framework for creating and executing test scripts.
*   **Groovy/Java** - The underlying programming language used in Katalon.
*   **Git & GitHub** - Version Control System for repository management.

## 📁 Project Structure
This project follows the standard Katalon Studio directory structure:
*   `Test Cases/` - Contains individual test scenarios (e.g., Login, Dark/Light Mode Bug testing, creating a post).
*   `Object Repository/` - A collection of captured UI elements (buttons, input forms) from the Manganshare pages (Home Page, Profile, Report, Login) used within the Test Cases.
*   `Test Suites/` - A collection of multiple Test Cases that are executed sequentially.
*   `Reports/` - Execution reports (typically generated after running a Test Suite).

## 🧪 Main Test Scenarios
Some of the key testing scenarios covered in this repository include:
*   **Authentication:** User Login functionality.
*   **UI/UX:** Bug verification for display modes (Dark Mode / Light Mode).
*   **Core Manganshare Functionalities:**
    *   Accessing the Home Page
    *   Profile Interactions (Edit Profile, Liked Posts)
    *   Creating a Post (Create Post)
    *   Reporting (Report)

## 🚀 How to Run the Project (Local)

**Prerequisites:**
Ensure that **Katalon Studio** is installed on your computer.

**Steps:**
1. Open your terminal or Command Prompt.
2. Clone this repository to your local machine:
   ```bash
   git clone [https://github.com/Cruelasss/PRK-STQA.git](https://github.com/Cruelasss/PRK-STQA.git)
