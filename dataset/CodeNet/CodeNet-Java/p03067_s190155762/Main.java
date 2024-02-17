import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
      
       if((A < C && C < B)||(B < C && C < A)){
         System.out.println("Yes");
       }else{
         System.out.println("No");
       }
	}

}