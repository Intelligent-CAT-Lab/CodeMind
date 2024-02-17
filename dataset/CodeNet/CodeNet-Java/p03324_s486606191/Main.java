import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int D = sc.nextInt();
    	int N = sc.nextInt();
    	sc.close();
    	int num = (int)Math.pow(100, D);
    	if (N == 100) N++;
    	int ans = num * N;
    	if(D == 0) System.out.println(N);
    	else System.out.println(ans);
    }

}
