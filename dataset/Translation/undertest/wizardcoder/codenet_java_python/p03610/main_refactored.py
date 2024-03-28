class main:
    import java.util.*;
    
    class p03610{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String[] array = s.split("");
    
            for i in range(0, s.length(), 2):
                System.out.print(array[i]);
        }
    }