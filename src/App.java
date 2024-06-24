import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Calculator calc;
    public static void main(String[] args) throws Exception {
        System.out.println("Initiating app...");
        boolean cont = true;
        int a, b;
        Scanner scanner = new Scanner(System.in);
        calc = new Calculator();

        do{
            a = b = 0;
            try{
                System.out.print("First operand: ");
                a = scanner.nextInt();
                System.out.print("Second operand: ");
                b = scanner.nextInt();
            } catch (InputMismatchException ime){
                System.out.println("Invalid input value.");
                cont = false;
                continue;
            }

            System.out.print("Which operation: (A)dd; (S)ubtract; (M)ultiply; (D)ivide; s(Q)rt (E to exit): ");
            char rep = Character.toUpperCase(scanner.next().trim().charAt(0));
    
            switch (rep) {
                case 'A':
                    System.out.println("Result (of add): " + calc.add(a, b));
                    break;
                case 'S':
                    System.out.println("Result (of add): " + calc.sub(a, b));
                    break;
                case 'M':
                    System.out.println("Result (of add): " + calc.mul(a, b));
                    break;
                case 'D':
                    try{
                        System.out.println("Result (of add): " + calc.div(a, b));
                    } catch (ArithmeticException ae){
                        System.out.println("Division by zero.");
                        cont = false;
                    }
                    break;
                case 'Q':
                    try{
                        System.out.println("Result (of square root):" + calc.sqrt(a));
                    } catch (NegativeNumberException re){
                        System.out.println("Square root of negative number");
                        cont = false;
                    }
                default:
                    break;
            }
        } while (cont == true);

        scanner.close();

    }
}
