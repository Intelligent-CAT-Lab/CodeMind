import java.util.*;

public class Main{
	public static void main(String[] args) {
     
      Scanner in =new Scanner(System.in);
      int k=in.nextInt();
System.out.println("[INST]6;k;in.nextInt();"+k);
      int A=in.nextInt();
System.out.println("[INST]7;A;in.nextInt();"+A);
      int B=in.nextInt();
System.out.println("[INST]8;B;in.nextInt();"+B);
      
      if  (B-A<=2) System.out.println(1+k);
      else{
        long kk=k-(A-1);
        long ans=kk/2*(B-A)+A;
        if (kk%2!=0)ans++;
        System.out.println(ans);
      }
      return;
    }
}
