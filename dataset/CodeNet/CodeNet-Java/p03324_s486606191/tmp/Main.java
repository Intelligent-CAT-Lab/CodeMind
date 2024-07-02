import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int D = sc.nextInt();
System.out.println("[INST]9;D;sc.nextInt();"+D);
    	int N = sc.nextInt();
System.out.println("[INST]10;N;sc.nextInt();"+N);
    	sc.close();
    	int num = (int)Math.pow(100, D);
System.out.println("[INST]12;None;Math.pow(100, D);"+Math.pow(100, D));
    	if (N == 100) N++;
    	int ans = num * N;
    	if(D == 0) System.out.println(N);
    	else System.out.println(ans);
    }

}
