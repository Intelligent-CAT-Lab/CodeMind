import java.util.*;

public class Main {
    public void main(Scanner sc) {
        String str = sc.next();
        int abc[] = new int[3];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if (str.charAt(i) == "abc".charAt(j)) {
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
