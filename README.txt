# E-commerce Website - Automated Test Cases

## Overview
This project includes Selenium TestNG automation scripts for validating basic shopping functionality on an e-commerce platform. The scripts are written in Java using Page Object Model (POM) and include basic test cases like searching, adding to cart, and checking out.

## Manual Test Cases

| Test Case ID | Test Case Title         | Pre-Conditions         | Test Steps                                                                                       | Expected Result                                            | Status    |
|--------------|-------------------------|------------------------|--------------------------------------------------------------------------------------------------|------------------------------------------------------------|-----------|
| TC_001       | Search for a hoodie     | User is on homepage    | 1. Open homepage<br>2. Enter "hoodie" in search<br>3. Click search                               | Hoodie results appear                                      | passed    |
| TC_002       | Add a hoodie to cart    | Products are displayed | 1. Click on a hoodie<br>2. Click "Add to Cart"                                                   | Hoodie is added to cart                                    | passed    |
| TC_003       | Open cart page          | Product added to cart  | 1. Click cart icon<br>2. View cart                                                               | Cart page displays product                                 | passed    |
| TC_004       | Checkout process        | Cart has product       | 1. Click "Proceed to Checkout"<br>2. Fill billing info<br>3. Click "Place Order"                 | Order is placed successfully with confirmation message     | passed    |

## Technologies Used
- Selenium WebDriver
- TestNG
- Java
- Page Object Model (POM)
- Maven

## How to Run
1. Open the project in IntelliJ.
2. Right-click `testng.xml` and select **Run**.
3. Make sure ChromeDriver version matches your browser.
4. Test results appear in the IntelliJ console and report folder.

