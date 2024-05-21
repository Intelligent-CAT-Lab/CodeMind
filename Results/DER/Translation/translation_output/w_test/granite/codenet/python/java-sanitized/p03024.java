import java.util.*;

public class p03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                count++;
            }
        }
        if (count <= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}