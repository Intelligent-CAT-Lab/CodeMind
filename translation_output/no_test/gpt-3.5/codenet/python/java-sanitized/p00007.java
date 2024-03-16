import java.util.Scanner;

public class p00007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 100000;
        int numIterations = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < numIterations; i++) {
            ans *=