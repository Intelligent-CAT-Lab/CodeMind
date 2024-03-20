import java.util.Scanner;

public class p03813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = (a < 1200)? "ABC" : "ARC";
        System.out.println(result);
    }
}