import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
System.out.println("[INST]4;n;sc.nextInt();"+n);
        int m = sc.nextInt();
System.out.println("[INST]5;m;sc.nextInt();"+m);
		int a = 1;
        int b = m;
        if(m%2==0){b++;}
        int c = b;
        for(int i=0;i<m;i++){if(a==b){a=c+1;b=2*m+1;}
                             System.out.println(a + " " + b);
                             a++;b--;                            
                            }                         		
	}
}                     