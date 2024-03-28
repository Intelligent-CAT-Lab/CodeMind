class main:
    import java.util.*;
    
    public class p03481 {
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            long X = sc.nextLong();
            long Y = sc.nextLong();
    
            int i=0;
            while(X<=Y){
                i++;
                X*=2;
            }
    
            System.out.println(i);
        }
    }