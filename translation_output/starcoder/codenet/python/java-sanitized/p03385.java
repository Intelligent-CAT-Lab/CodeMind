import java.util.*;
public class p03385 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.contains("a") && s.contains("b") && s.contains("c"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}