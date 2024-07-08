import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<n; i++){
			for(int j=i+1; j<=n; j++){
				for(int k=0; k<10; k++){
					if((i>>k & 1)!=(j>>k & 1)){
						System.out.println(k+1);
						break;
					}
				}
			}
		}
	}
}
