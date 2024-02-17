public class Main{
     public static void main(String[] args){
          int i,j;
   
          int val = new java.util.Scanner(System.in).nextInt();
  
          int a=2;
          System.out.print(val + ":");
   
          while(val>=a*a){
                if(val%a==0){
                      System.out.print(" " + a);
                    val/=a;
                 }else{
                     a++;
                }
  
         }
          System.out.println(" " +  val);
     }
 }