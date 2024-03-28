class main:
    import java.util.Scanner;
    
    public class p03705 {
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if(a>b||(n==1 and a!=b)):
                print(0)
                return
            
            if(a==b):
                print(1)
                return
            
            print((n-2)*(b-a)+1)
            
        }
        
    }