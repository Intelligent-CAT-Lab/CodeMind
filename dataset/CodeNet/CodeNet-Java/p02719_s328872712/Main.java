import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long n = sc.nextLong();
            long k = sc.nextLong();

            if(n == 0){
                System.out.println(0);
                System.exit(0);
            }else if(n >= k){
                if((n % k) == 0){
                    System.out.println(0);
                    System.exit(0);
                }else{
                    if((n % k) < Math.abs((n % k) - k)){
                        System.out.println(n % k);
                        System.exit(0);
                    }else{
                        System.out.println(Math.abs((n % k) - k));
                        System.exit(0);
                    }
                }
            }else{
                if((k/2) <= n){
                    System.out.println(Math.abs(n-k));
                    System.exit(0);
                }else{
                    System.out.println(n);
                    System.exit(0);
                }
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}