import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
System.out.println("[INST]4;a;sc.nextInt();"+a);
	int b = sc.nextInt();
System.out.println("[INST]5;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]6;c;sc.nextInt();"+c);
	int i = 0,cnt = 0; 
	while(cnt < c){
	    i++;
	    cnt += a;
	    if(i % 7 == 0){cnt += b;}
	    
	}
	System.out.println(i);
    }
}
