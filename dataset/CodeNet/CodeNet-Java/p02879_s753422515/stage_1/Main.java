import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int s = in.nextInt();
        if (r >= 1 && r <= 20 && s >= 1 && s <= 20) {
            if (r >= 1 && r <= 9 && s >= 1 && s <= 9) {
                System.out.println(r * s);
            } else {
                System.out.println(-1);
            }

        }
    }
}
