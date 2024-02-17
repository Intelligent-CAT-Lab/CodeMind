import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if (s.substring(i, i + 1).equals("p")) {
                count++;
            }
        }
        System.out.println(s.length()/2 - count);

    }

}