import java.util.*;
public class p00401 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count / 2));
    }
}