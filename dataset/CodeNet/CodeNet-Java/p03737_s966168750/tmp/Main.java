import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");
System.out.println("[INST]7;S;sc.nextLine().split(' ');"+S);
System.out.println("[INST]7;None;sc.nextLine();"+sc.nextLine());

        StringBuilder sb = new StringBuilder();
        for (String s : S) {
            String upperCase = s.substring(0, 1).toUpperCase();
System.out.println("[INST]11;upperCase;s.substring(0, 1).toUpperCase();"+upperCase);
System.out.println("[INST]11;None;s.substring(0, 1);"+s.substring(0, 1));
            sb.append(upperCase);
System.out.println("[INST]12;None;sb.append(upperCase);"+sb.append(upperCase));
        }

        System.out.println(sb.toString());
    }
}
