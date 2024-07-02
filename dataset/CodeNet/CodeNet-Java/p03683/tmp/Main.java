
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
System.out.println("[INST]7;line;scanner.nextLine().split(' ');"+line);
System.out.println("[INST]7;None;scanner.nextLine();"+scanner.nextLine());
        int n = Integer.parseInt(line[0]);
System.out.println("[INST]8;n;Integer.parseInt(line[0]);"+n);
        int m = Integer.parseInt(line[1]);
System.out.println("[INST]9;m;Integer.parseInt(line[1]);"+m);

        long result = 0;

        if(Math.abs(n-m) > 1){
System.out.println("[INST]13;None;Math.abs(n-m);"+Math.abs(n-m));
            result = 0;
        } else if(Math.abs(n-m) == 1){
System.out.println("[INST]15;None;Math.abs(n-m);"+Math.abs(n-m));
            result = factorialsModBillion(n, m);
        } else {
            result = factorialsModBillion(n, m);
            result = (result * 2) % 1000000007L;
        }

        System.out.println(result);
    }

    private static long factorialsModBillion(int n, int m){
        long result = 1;
        for(long i = 1; i <= n; i++) {
            result = (result * i) % 1000000007L;
        }
        for(long i = 1; i <= m; i++) {
            result = (result * i) % 1000000007L;
        }
        return result;
    }
}
