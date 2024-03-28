import java.util.*;
public class p02546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.endsWith("s"))
            System.out.println(s+"es");
        else
            System.out.println(s+"s");
    }
}