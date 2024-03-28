import java.util.Scanner;

public class p02835 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+b+c<22?"win":"bust");
    }
}