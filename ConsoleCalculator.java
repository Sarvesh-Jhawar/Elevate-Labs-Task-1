import java.util.Scanner;

public class ConsoleCalculator{
    public static double add(double a,double b){
        return a+b;
    }
    public static double subtract(double a,double b){
        return a-b;
    }
    public static double multiply(double a,double b){
        return a*b;
    }
     public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
     public static double power(double a,double b){
        return Math.pow(a,b);
    }

    public static double squareRoot(double a){
        if(a<0){
            System.out.println("Error: Square root of negative number!");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean flag=true;
        while(flag){
            System.out.println("---Java Console Calculator---");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power (first number to the power of second number)");
            System.out.println("6. Square Root (of first number)");
            System.out.println("7. Exit");
            System.out.print("Enter the operation number: ");
            
            int choice = scanner.nextInt();
            
            if(choice==7){
                flag=false;
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            while(!scanner.hasNextDouble()){
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            double num1 = scanner.nextDouble();

            double num2 = 0;
            if(choice != 6){ // Square root needs only one number
                System.out.print("Enter second number: ");
                while(!scanner.hasNextDouble()){
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
                num2 = scanner.nextDouble();
            }

            double result=0;
            switch(choice){ 
                case 1:
                    result=add(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 2:         
                    result=subtract(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 3:
                    result=multiply(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 4:
                    result=divide(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 5:
                    result=power(num1,num2);
                    System.out.println("Result: "+result);
                    break;
                case 6:
                    result=squareRoot(num1);
                    System.out.println("Result: "+result);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}