import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            long n = sc.nextLong();
System.out.println("[INST]7;n;sc.nextLong();"+n);
            long k = sc.nextLong();
System.out.println("[INST]8;k;sc.nextLong();"+k);

            if(n == 0){
                System.out.println(0);
                System.exit(0);
System.out.println("[INST]12;None;System.exit(0);"+System.exit(0));
            }else if(n >= k){
                if((n % k) == 0){
                    System.out.println(0);
                    System.exit(0);
System.out.println("[INST]16;None;System.exit(0);"+System.exit(0));
                }else{
                    if((n % k) < Math.abs((n % k) - k)){
System.out.println("[INST]18;None;Math.abs((n % k) - k);"+Math.abs((n % k) - k));
                        System.out.println(n % k);
                        System.exit(0);
System.out.println("[INST]20;None;System.exit(0);"+System.exit(0));
                    }else{
                        System.out.println(Math.abs((n % k) - k));
                        System.exit(0);
System.out.println("[INST]23;None;System.exit(0);"+System.exit(0));
                    }
                }
            }else{
                if((k/2) <= n){
                    System.out.println(Math.abs(n-k));
                    System.exit(0);
System.out.println("[INST]29;None;System.exit(0);"+System.exit(0));
                }else{
                    System.out.println(n);
                    System.exit(0);
System.out.println("[INST]32;None;System.exit(0);"+System.exit(0));
                }
            }
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}