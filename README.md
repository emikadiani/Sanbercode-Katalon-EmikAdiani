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
This project consist of 3 Test Suites.<br>
• Register scenario<br>
• Login scenario<br>
• Add to cart & checkout<br>

It all has 11 test cases. 9 passed and 2 failed.

### Register Scenario
  TC-SU-001	user register using valid data<br>
	TC-SU-002	user register using existing data<br>
	TC-SU-003	user register by only input username field and leave the password field blank<br>
	TC-SU-004	user register by only input password field and leave the username field blank<br>
	TC-SU-005	user wants to register but leave all the field blank and only click loggin button<br>
	TC-SU-006	user register using valid username but input only one character onto the password field<br>

### Login Scenario
  TC-LI-001	user login with valid credential<br>
  TC-LI-002	user login with wrong password<br>

### Add to cart & checkout Scenario
  TC-ATC-001	user wants to add products to cart<br>
  TC-CO-001	user wants to place order with a product on the cart<br>
  TC-CO-002	user wants to place order without any product on the cart<br>

Failed test cases: <br>
• TC-SU-006, user could register using one characters as their password.<br>
• TC-CO-002, checkout order successfully while cart has no product in it.<br>
