class main:
    import java.util.*;
    
    public class p03636 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int leng = s.length();
            System.out.print(s.charAt(0));
            System.out.print(leng-2);
            System.out.println(s.charAt(leng-1));
        }
    
    }