import java.util.Scanner;

public class p00007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine()); // Assuming that the input is a valid integer
        double ans = 100000;

        for (int i = 0; i < iterations; i++) {
            ans *=