import java.util.*;

public class p03481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int k = (Y/X).toString(2).length();
        System.out.println(k);
    }
}