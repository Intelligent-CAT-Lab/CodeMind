import java.util.*; 
class Main {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
       int B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
       int c = 0;
     
      for(int i = 0;i<2;i++){
       if(A>=B){c += A;A = A -1;}
        else{c += B;B = B -1;}
      }
       
     
     
     System.out.print(c);


   }
}
