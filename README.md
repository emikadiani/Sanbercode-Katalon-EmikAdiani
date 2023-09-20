# Sanbercode-Katalon-EmikAdiani

## Introduction
An automation testing practice using Katalon Studio for [Demoblaze](https://www.demoblaze.com) website. As a course assignment at Sanbercode batch 49, mentored by Mr. M Fariz Agati.
The test objectives are to verify the Functional of website demoblaze, the project focust on end-to-end transactional such as register account, login, add to cart as well as checkout order. 
This is to guarantee all these operation can work normally in real business environment.

## Project task 
The task that I am doing are:<br>
• Create the test specification <br>
• Perform Test Execution <br>

## Test Environment
• Google Chrome version 114.0.5735.198 (to avoid any failure or failed test execution, please execute this test using google chrome)<br>

---------------------

## Test Cases
This project consist of 3 Test Suites.
• Register scenario
• Login scenario
• Add to cart & checkout

It all has 11 test cases. 9 passed and 2 failed.

### Register Scenario
  TC-SU-001	user register using valid data
	TC-SU-002	user register using existing data
	TC-SU-003	user register by only input username field and leave the password field blank
	TC-SU-004	user register by only input password field and leave the username field blank
	TC-SU-005	user wants to register but leave all the field blank and only click loggin button
	TC-SU-006	user register using valid username but input only one character onto the password field

### Login Scenario
  TC-LI-001	user login with valid credential
  TC-LI-002	user login with wrong password

### Add to cart & checkout Scenario
  TC-ATC-001	user wants to add products to cart
  TC-CO-001	user wants to place order with a product on the cart
  TC-CO-002	user wants to place order without any product on the cart

Failed test cases: 
• TC-SU-006, user could register using one characters as their password.
• TC-CO-002, checkout order successfully while cart has no product in it.
