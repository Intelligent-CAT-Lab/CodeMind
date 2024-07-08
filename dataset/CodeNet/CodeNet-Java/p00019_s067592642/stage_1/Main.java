
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
           long n = scan.nextLong();
           long i ;
           long d = 1;
           
           for(i = 1; i<=n;i++){
               d = d * i;
           }
           System.out.println(d);
        }

    }


