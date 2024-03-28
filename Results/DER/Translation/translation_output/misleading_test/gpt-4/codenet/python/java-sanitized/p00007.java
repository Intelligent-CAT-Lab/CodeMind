import java.util.Scanner;

public class p00007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
       
        double ans = 100000;
        for (int i = 0; i < n; i++) {
            ans *=