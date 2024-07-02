import java.util.*;

public class Main {
    public void main(Scanner sc) {
        String str = sc.next();
System.out.println("[INST]4;str;sc.next();"+str);
        int abc[] = new int[3];
        for (int i = 0; i < str.length(); i++) {
System.out.println("[INST]6;None;str.length();"+str.length());
            for (int j = 0; j < 3; j++) {
                if (str.charAt(i) == "abc".charAt(j)) {
System.out.println("[INST]8;None;str.charAt(i);"+str.charAt(i));
System.out.println("[INST]8;None;'abc'.charAt(j);"+"abc".charAt(j));
                    abc[j]++;
                }
            }
        }

        Arrays.sort(abc);
System.out.println("[INST]14;None;Arrays.sort(abc);"+Arrays.sort(abc));

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
