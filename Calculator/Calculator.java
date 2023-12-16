import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Basic Calculator");
        System.out.println("Enter an Expression (e.g. 2 + 3): ");

        String expression = scanner.nextLine();
        String[] parts = expression.split(" ");

        if(parts.length != 3) {
            System.out.println("Invalid input format! Please enter an expression like '2+3' ");
        } 
        else {
            try {
                double num1 = Double.parseDouble(parts[0]);
                char operation = parts[1].charAt(0);
                double num2 = Double.parseDouble(parts[2]);

                double result = 0;
                boolean validOperation = true;

                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 + num2;
                        break;
                    case '*':
                        result = num1 + num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("can not didvide by zero!");
                            validOperation = false;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation selected");
                        validOperation = false;
                        break;
                }
                if (validOperation) {
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Please select valid operation.");
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid number format! please enter valid number.");
            }
        }
        scanner.close();
    }
}