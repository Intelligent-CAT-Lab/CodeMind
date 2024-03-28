import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        String s = input.next();
        int B = input.nextInt();
        input.close();

        switch (s) {
            case "+":
                System.out.println(A + B);
                break;
            case "-":
                System.out.println(A - B);
                break;
            // Assuming you might want to handle other cases in the future
            // Since other operators are not specified in the original code
            // they are not implemented here.
            default:
                System.out.println("Unsupported operation");
                break;
        }
    }
}