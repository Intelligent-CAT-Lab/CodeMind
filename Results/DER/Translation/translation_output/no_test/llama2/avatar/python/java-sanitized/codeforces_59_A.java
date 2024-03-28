Solution


import java.util.Scanner;

public class codeforces_59_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int small = 0;
        int cap = 0;
        for (char t : txt.toCharArray()) {
            if (Character.isLowerCase(t)) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (char t : txt.toCharArray()) {
                System.out.print(Character.toLowerCase(t));
            }
        } else {
            for (char t : txt.toCharArray()) {
                System.out.print(Character.toUpperCase(t));
            }
        }
    }
}