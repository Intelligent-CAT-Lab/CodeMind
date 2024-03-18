import java.util.Scanner;

public class p03547 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String N = parts[0];
        String M = parts[1];

        // Convert hexadecimal alphabetic characters to their numeric values
        int intN = convertHexCharToDecimal(N.charAt(0));
        int intM = convertHexCharToDecimal(M.charAt(0));

        if (intN > intM) {
            System.out.println(">");
        } else if (intN == intM) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
        
        scanner.close();
    }

    private static int convertHexCharToDecimal(char hexChar) {
        switch(hexChar) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                // Assuming input will be valid ('A' to 'F'), else we'll treat as numeral character
                return Character.getNumericValue(hexChar);
        }
    }
}