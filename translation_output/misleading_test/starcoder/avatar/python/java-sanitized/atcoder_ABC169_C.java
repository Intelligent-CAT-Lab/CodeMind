import java.util.*;
public class atcoder_ABC169_C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String b = input[1];
        b = b.substring(0,1) + b.substring(2);
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(b);
        System.out.println(a*b/100);
    }
}