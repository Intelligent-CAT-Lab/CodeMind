import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h = sc.nextInt();
        
        int result = ((h - 2) / (t - 1)) + 1;
        System.out.println(result);
    }
}