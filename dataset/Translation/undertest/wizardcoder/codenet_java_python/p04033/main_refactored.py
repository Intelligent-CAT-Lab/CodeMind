class main:
    import java.util.Scanner;
    
    public class p04033 {
        static Scanner s = new Scanner(System.in);
    
        public static void main(String[] args) {
            int a=s.nextInt(),b=s.nextInt();
            if(a<=0 and b>=0):
                System.out.println("Zero");
            else:
                System.out.println((min(0,b)-min(-1,a))%2==1?"Positive":"Negative");
        }
    }