import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.hasNextInt();        while (newVariable_0) {
            int N = sc.nextInt();
            System.out.println(N - (N % 500));
        }
    }
}


