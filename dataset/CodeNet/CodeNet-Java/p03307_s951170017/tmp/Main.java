import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]4;n;sc.nextLong();"+n);
        if (n % 2 != 0) n *= 2;
        System.out.println(n); 
    }
}