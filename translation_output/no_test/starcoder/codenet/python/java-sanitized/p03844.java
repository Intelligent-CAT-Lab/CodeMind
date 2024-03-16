import java.util.*;
public class p03844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        String s = sc.nextLine();
        if (s.equals("+")) {
            System.out.println(a + b);
        } else if (s.equals("-")) {
            System.out.println(a - b);
        }
    }
}