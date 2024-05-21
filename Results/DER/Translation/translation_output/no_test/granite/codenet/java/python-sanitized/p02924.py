import java.util.Scanner;

public class p02924 {

    public static void main(String args[]) {

        // å¥å
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // ä¸»å¦ç
        long result = 0;
        for i in range(n - 1, 0, -1):
            result += i;

        # åºå
        System.out.println(result);
        sc.close();
    }

}