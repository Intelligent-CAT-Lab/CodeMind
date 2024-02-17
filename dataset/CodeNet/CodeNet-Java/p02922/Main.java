import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}