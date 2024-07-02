import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
System.out.println("[INST]6;r;in.nextInt();"+r);
        int s = in.nextInt();
System.out.println("[INST]7;s;in.nextInt();"+s);
        if (r >= 1 && r <= 20 && s >= 1 && s <= 20) {
            if (r >= 1 && r <= 9 && s >= 1 && s <= 9) {
                System.out.println(r * s);
            } else {
                System.out.println(-1);
            }

        }
    }
}
