import java.util.Scanner;

public class p02697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int a = 1;
        int b = N / 2;
        int c = N / 2 + 1;
        int d = N;
        
        if (N % 2 == 0) {
            a += 1;
        }
        
        int i = 0;
        while (i < M) {
            if (i < M) {
                System.out.print(c + " " + d + " ");
                i++;
                c++;
                d--;
            } else {
                break;
            }
            
            if (i < M) {
                System.out.print(a + " " + b);
                a++;
                b--;
                i++;
            } else {
                break;
            }

            // Adding a new line for formatting purposes (not in the original program)
            System.out.println();
        }

        scanner.close();
    }
}