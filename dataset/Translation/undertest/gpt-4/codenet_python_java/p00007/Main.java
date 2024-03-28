import java.util.Scanner;

public class p00007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int periods = scanner.nextInt();
        double ans = 100000;

        for (int i = 0; i < periods; i++) {
            ans *=