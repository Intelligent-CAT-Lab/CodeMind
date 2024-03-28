import java.util.Scanner;

public class p01076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if (d == 1) {
            System.out.println((n*(n-1))/2);
        } else {
            System.out.println((n-1)+(n-d-1)*n-((n-d-1)*(n+d-2))/2);
        }
    }
}