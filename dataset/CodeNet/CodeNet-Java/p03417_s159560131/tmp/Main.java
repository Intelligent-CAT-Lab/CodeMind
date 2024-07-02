import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]5;n;sc.nextLong();"+n);
        long m = sc.nextLong();
System.out.println("[INST]6;m;sc.nextLong();"+m);
        sc.close();

        System.out.println(Math.abs((n-2) * (m-2)));
    }
}
