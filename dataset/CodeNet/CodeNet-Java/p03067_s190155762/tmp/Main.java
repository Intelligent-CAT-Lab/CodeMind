import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
System.out.println("[INST]7;A;sc.nextInt();"+A);
        int B = sc.nextInt();
System.out.println("[INST]8;B;sc.nextInt();"+B);
        int C = sc.nextInt();
System.out.println("[INST]9;C;sc.nextInt();"+C);
      
       if((A < C && C < B)||(B < C && C < A)){
         System.out.println("Yes");
       }else{
         System.out.println("No");
       }
	}

}