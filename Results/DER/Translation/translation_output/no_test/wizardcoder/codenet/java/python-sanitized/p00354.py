import java.util.Scanner;

public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = "thu:fri:sat:sun:mon:tue:wed".split(":");
        System.out.println(days[sc.nextInt()%7]);
    }
}