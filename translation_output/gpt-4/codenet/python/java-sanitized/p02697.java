import java.util.Scanner;

public class p02697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int a = 1;
        int b = N / 2;
        int c = (N / 2) + 1;
        int d = N;
        if (N % 2 == 0) {
            a++;
        }

        int i = 0;
        while(i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i++;
                c++;
                d--;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + " " + b);
                a++;
                b--;
                i++;
            } else {
                break;
            }
        }

        scanner.close();
    }
}