import java.util.Scanner;

public class p03393 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'a');
                if (!s.contains(String.valueOf(c))) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = (int) 'a'; j <= (int) 'z'; j++) {
                    if (!s.substring(0, i).contains(String.valueOf((char) j))) {
                        System.out.println(s.substring(0, i) + (char) j);
                        return;
                    }
                }
            }
            System.out.println(-1);
        }
    }
}