import java.util.*;
public class atcoder_ABC158_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = " Yes " if (" A " in s && " B " in s) else " No ";
        System.out.println(result);
    }
}