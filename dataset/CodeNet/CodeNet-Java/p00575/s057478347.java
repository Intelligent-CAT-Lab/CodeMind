import java.util.Scanner;
class Main{
    public static void main(String[] av){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
        int c = sc.nextInt();
	int i = 0,cnt = 0; 
	while(cnt < c){
	    i++;
	    cnt += a;
	    if(i % 7 == 0){cnt += b;}
	    
	}
	System.out.println(i);
    }
}
