import java.util.Scanner;

public class p02981 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = (n * a > b) ? b : n * a;

        System.out.println(ans);
    }
}


You can test this code with the following test input:


4 2 9


And it should output:


8