import java.util.Scanner;
class Main{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int A=sc.nextInt();
System.out.println("[INST]4;A;sc.nextInt();"+A);
      int B=sc.nextInt();
System.out.println("[INST]5;B;sc.nextInt();"+B);
      int K=sc.nextInt();
System.out.println("[INST]6;K;sc.nextInt();"+K);
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

