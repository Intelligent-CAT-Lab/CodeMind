import java.util.*;
public class p03385 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        if(S.contains("a") && S.contains("b") && S.contains("c"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}