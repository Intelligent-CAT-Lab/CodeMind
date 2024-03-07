import java.util.Scanner;

public class p02004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rr = new int[1000000];

        for (int i = 0; i < 1000000; i++) {
            String n = sc.nextLine();
            int r = 0;
            int t = 0;
            for (int j = 0; j < n.length(); j++) {
                if (n.charAt(j) == 'R') {
                    t++;
                    if (t == 4) {
                        r++;
                        t = 0;
                    }
                } else {
                    t--;
                    if (t == -4) {
                        t = 0;
                    }
                }
            }
            rr[i] = r;
        }

        for (int i = 0; i < 1000000; i++) {
            System.out.println(rr[i]);
        }
    }
}