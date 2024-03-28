import java.util.*;

public class p02149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] S = input.split(" ");
        int max = Integer.parseInt(S[0]);
        for (int i = 1; i < S.length; i++) {
            if (Integer.parseInt(S[i]) > max) {
                max = Integer.parseInt(S[i]);
            }
        }
        if (S.indexOf(max) == 0) {
            System.out.println("A");
        } else if (S.indexOf(max) == 1) {
            System.out.println("B");
        } else if (S.indexOf(max) == 2) {
            System.out.println("C");
        }
    }
}