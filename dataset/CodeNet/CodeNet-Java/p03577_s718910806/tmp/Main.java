import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
System.out.println("[INST]4;s;input.next();"+s);
        String ans = s.substring(0,s.length()-8);
System.out.println("[INST]5;ans;s.substring(0,s.length()-8);"+ans);
System.out.println("[INST]5;None;s.length();"+s.length());
        System.out.println(ans);
    }
}