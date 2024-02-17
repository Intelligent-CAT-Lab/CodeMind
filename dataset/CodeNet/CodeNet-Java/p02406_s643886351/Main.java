import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        StringBuilder count=new StringBuilder();
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for (int i=1;i<=n;i++){
	            int x=i;
	            if (x%3==0){
	                count.append(" "+i);
	                continue;}
	            do{
	                if(x%10==3){
	                    count.append(" "+i);
	                    break;}
	                x/=10;
	            }while(x!=0);
	        }
	        System.out.println(count);
	    }
	}

