import java.util.*;

public class Main {
    public void main(Scanner sc) {
        String str = sc.next();
        int abc[] = new int[3];
var newVariable_0 = str.length();        for (int i = 0; i < newVariable_0; i++) {
            for (int j = 0; j < 3; j++) {
var newVariable_1 = str.charAt(i);var newVariable_2 = "abc".charAt(j);                if (str.charAt(i) == newVariable_2) {
                    abc[j]++;
                }
            }
        }

        Arrays.sort(abc);

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
