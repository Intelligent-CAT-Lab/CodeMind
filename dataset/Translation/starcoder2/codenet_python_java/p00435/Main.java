import java.util.Scanner;
public class p00435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String list = "";
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'C') {
                list += 'Z';
            } else if (w.charAt(i) == 'B') {
                list += 'Y';
            } else if (w.charAt(i) == 'A') {
                list += 'X';
            } else {
                list += (char) (w.charAt(i) - 3);
            }
        }
        System.out.println(list);
    }
}