import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.nextLine();        String[] S = newVariable_0.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : S) {
var newVariable_1 = s.substring(0, 1);            String upperCase = newVariable_1.toUpperCase();
var newVariable_2 = sb.append(upperCase);        }

        System.out.println(sb.toString());
    }
}
