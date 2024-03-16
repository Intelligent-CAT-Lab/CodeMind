import java.util.*;
public class p02223 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1){
			System.out.println("1\n0");
		}
		else if(n==2){
			System.out.println("2\n0\n11");
		}
		else{
			System.out.println(n-1);
			for(int i=0;i<n-1;i++){
				System.out.println("1"+"0"*i+"1");
			}
		}
	}
}