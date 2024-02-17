import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String ans = s.substring(0,s.length()-8);
        System.out.println(ans);
    }
}