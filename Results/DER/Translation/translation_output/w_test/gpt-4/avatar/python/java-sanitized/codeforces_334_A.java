import java.util.Scanner;

public class codeforces_334_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int i = 1, j = n * n;
        while (i < j) {
            System.out.print(i + " " + j + " ");
            i++;
            j--;
            if (i % n == 1) {
                System.out.println();
            }
        }
        
        scanner.close();
    }
}