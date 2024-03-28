import java.util.Scanner;
import java.util.InputMismatchException;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Reading the first line of input and splitting it into two integers
            String[] input = scanner.nextLine().split("\\s+");
            int r1 = Integer.parseInt(input[0]);
            int r2 = Integer.parseInt(input[1]);

            double result =