import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
var newVariable_0 = s.length();        for (int i = 0 ; i < newVariable_0 ; i++) {
var newVariable_1 = s.substring(i, i + 1).equals("p");var newVariable_2 = s.substring(i, i + 1);            if (newVariable_2.equals("p")) {
                count++;
            }
        }
        System.out.println(s.length()/2 - count);

    }

}