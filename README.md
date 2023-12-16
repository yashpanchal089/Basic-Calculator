# Basic-Calculator
This Java program represents a basic calculator that performs addition, subtraction, multiplication, and division operations based on user input.
Here's a description of the code:

The program starts by importing the Scanner class to enable user input.

The Calculator class is defined with a main method, which serves as the entry point for the program.

Inside the main method:

A Scanner object (scanner) is created to read user input.
A welcome message is displayed along with a prompt for the user to enter a mathematical expression.
User input is read as a string (expression), and it is then split into three parts using the space character as a delimiter. The three parts include the first number, the operator, and the second number.

The program checks if the input has the correct format for a basic mathematical expression. If not, an error message is displayed, and the program terminates.

If the input is in the correct format, the program attempts to perform the calculation:

The first and second numbers are parsed as doubles, and the operator is extracted.
Using a switch statement, the program determines the operation to be performed and calculates the result.
If the operation is division, a check is included to avoid division by zero.
If the operation is not recognized, an error message is displayed.
Depending on the validity of the operation, the program either prints the result or an error message.

The program also includes exception handling using a try-catch block to handle cases where the user enters invalid numbers.

The Scanner is closed to release system resources.

Note: There is a mistake in the code where addition (+), subtraction (-), and multiplication (*) operations all incorrectly use the addition operation (+). The respective correct operations should be used for each case.
