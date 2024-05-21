import java.util.*;

public class p02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            }
            int count = 0;
            int temp = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R') {
                    temp++;
                    if (temp == 4) {
                        count++;
                        temp = 0;
                    }
                } else {
                    temp--;
                    if (temp == -4) {
                        temp = 0;
                    }
                }
            }
            System.out.println(count);
        }
    }
}