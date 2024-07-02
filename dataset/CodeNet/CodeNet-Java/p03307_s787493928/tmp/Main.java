import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
System.out.println("[INST]5;n;sc.nextInt();"+n);
        if (n % 2 == 0)
            System.out.println(n);
        else
            System.out.println(n * 2);
    }
}
