# UrbanCart – End-to-End Testing & QA Automation

## Project Overview
This repository contains a complete, simulated end-to-end Software Testing project for an e-commerce platform named "UrbanCart". The project is designed to demonstrate comprehensive QA and testing practices, encompassing manual testing, automation testing, and API testing, formatted according to industry standards.

## Objectives
- Demonstrate mastery of Manual Testing methodologies using realistic business scenarios.
- Showcase an Automation Testing Framework utilizing Selenium WebDriver and TestNG with the Page Object Model (POM) design pattern.
- Exhibit API Testing capabilities using Postman for both positive and negative test cases.
- Provide clear, professional Bug Reports, Test Cases, and Execution Reports.

## Testing Types Covered
1. **Manual Testing**: Comprehensive test case design for critical user flows.
2. **Functional Testing**: Validating core features against expected behavior.
3. **Regression Testing**: Assuring that new features do not break existing functionality.
4. **Automation Testing**: Executing scheduled scripts for repeatable test coverage.
5. **API Testing**: Validating backend services independently from the frontend.

## Tech Stack
- **Automation Tool**: Selenium WebDriver
- **Frameworking**: TestNG
- **Programming Language**: Java
- **API Testing**: Postman
- **Build Tool**: Maven

## Features Tested
- **User Authentication**: Login / Logout functionality.
- **Product Search**: Searching for items with various keywords and filters.
- **Cart Management**: Adding, removing, and updating quantities of products in the cart.
- **Checkout Process**: End-to-end order placement flow.

## Project Structure
```text
UrbanCart-Testing/
├── README.md                # Project documentation
├── test-cases/              # Manual Test Cases (CSV/Excel format)
├── bug-reports/             # Bug Reports (CSV/Excel format)
├── automation/              # Java + Selenium Automation Framework
│   ├── pom.xml              # Maven dependencies
│   ├── src/main/java/pages  # Page Object Model classes
│   └── src/test/java/tests  # TestNG Test classes
├── api-testing/             # Postman Collection JSON
├── reports/                 # Sample HTML Test execution reports
└── screenshots/             # Sample application screenshots
```

## Outcome and Learning
Through building this project, a deep understanding of standard QA workflows was established. It solidifies the ability to integrate manual UI testing with backend API verifications and scalable automation scripts using the POM structure in Java. It serves as a practical portfolio to showcase modern QA engineering skills.
