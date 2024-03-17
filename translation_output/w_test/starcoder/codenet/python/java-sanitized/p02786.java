import java.util.*;

public class p02786 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        System.out.println(atack(H));
    }

    public static int atack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + atack(tairyoku / 2) * 2;
        }
    }
}