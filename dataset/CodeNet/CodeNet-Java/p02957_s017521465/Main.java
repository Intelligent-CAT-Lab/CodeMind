import java.util.*;
	public class Main {
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        if((a-b)%2==0){
         System.out.println((a+b)/2);
        }
        else{
          System.out.println("IMPOSSIBLE");
        }
	}
}