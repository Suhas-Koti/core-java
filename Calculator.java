public class Calculator {
    public static void main(String args[]) {

        int a = 20;
        int b = 40;
        char operator = '+';
        if (operator == '+') {
            System.out.println("Addition is " + (a + b));
        } else if (operator == '-') {
            System.out.println("subtraction is " + (a - b));
        } else if (operator == '/') {
            System.out.println("Divison is " + (a / b));
        } else if (operator == '*') {
            System.out.println("Multiplication is " + (a * b));
        } else {

            System.out.println("Inavlid Array");
        }

    }
}
