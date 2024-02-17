import java.util.*;

public class Main{
	public static void main(String[] args) {
     
      Scanner in =new Scanner(System.in);
      int k=in.nextInt();
      int A=in.nextInt();
      int B=in.nextInt();
      
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
