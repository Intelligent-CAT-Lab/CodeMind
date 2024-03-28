import java.util.*;
public class p03742 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(Math.abs(a-b)>1)
            System.out.println("Alice");
        else
            System.out.println("Brown");
    }
}