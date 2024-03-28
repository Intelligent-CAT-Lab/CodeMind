import java.util.*;

public class p03404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<String> ar = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ar.add("#");
        }
        for (int i = 0; i < 100; i++) {
            ar.add(".");
        }
        for (int i = 0; i < 50; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                temp.add("#");
            }
            ar.add(temp);
            for (int j = 0; j < 100; j++) {
                temp.add(".");
            }
            ar.add(temp);
        }
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar.get(i).set(j, ".");
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar.get(i).set(j, ".");
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }
        for (int i = 99; i >= 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar.get(i).set(j, "#");
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar.get(i).set(j, "#");
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }
        for (List<String> row : ar) {
            System.out.println(row.stream().mapToObj(String::valueOf).reduce("", (a, b) -> a + b));
        }
    }
}