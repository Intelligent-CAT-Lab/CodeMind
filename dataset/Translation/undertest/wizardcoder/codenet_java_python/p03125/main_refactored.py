class main:
    import java.util.*;
    import java.util.stream.*;
    import java.util.function.*;
    
    public class p03125 {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            
            System.out.println(b % a == 0? a + b : b - a);
        }
    }