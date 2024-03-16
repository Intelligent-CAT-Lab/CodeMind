import java.util.*;
public class p03085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("A"))
            System.out.println("T");
        else if(s.equals("C"))
            System.out.println("G");
        else if(s.equals("G"))
            System.out.println("C");
        else
            System.out.println("A");
    }
}