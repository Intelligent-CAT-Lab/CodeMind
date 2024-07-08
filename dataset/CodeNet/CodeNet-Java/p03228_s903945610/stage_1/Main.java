import java.util.Scanner;
class Main{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int A=sc.nextInt();
      int B=sc.nextInt();
      int K=sc.nextInt();
      for(int i=1;i<=K/2;i++){
         A=A/2;
         B=(A+B)/2;
         A=A+B;
     }if(K%2==1){
         A=A/2;
         B=A+B;
     }System.out.println(A+" "+B);
  }
}    

