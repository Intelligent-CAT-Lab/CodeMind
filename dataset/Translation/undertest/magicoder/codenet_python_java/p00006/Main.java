import java.util.Scanner;

public class p00006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}


You can test this code with the following test input:


w32nimda


And it will output:


admin23w