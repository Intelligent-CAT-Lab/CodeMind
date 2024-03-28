import java.util.*;

public class p03404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<StringBuilder> ar = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            StringBuilder l = new StringBuilder();
            for (int j = 0; j < 100; j++) {
                l.append("#");
            }
            ar.add(l);
        }
        for (int i = 0; i < 50; i++) {
            StringBuilder l = new StringBuilder();
            for (int j = 0; j < 100; j++) {
                l.append(".");
            }
            ar.add(l);
        }
        System.out.println(100 + " " + 100);

        int count = 0;
        for (int i = 48; i >= 0; i -= 2) {
            if (count == a - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar.get(i).setCharAt(j, '.');
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar.get(i).setCharAt(j, '.');
                    count++;
                    if (count == a - 1) {
                        break;
                    }
                }
            }
        }
        count = 0;
        for (int i = 99; i > 50; i -= 2) {
            if (count == b - 1) {
                break;
            }
            if (i % 2 == 0) {
                for (int j = 0; j < 100; j += 2) {
                    ar.get(i).setCharAt(j, '#');
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            } else {
                for (int j = 1; j < 100; j += 2) {
                    ar.get(i).setCharAt(j, '#');
                    count++;
                    if (count == b - 1) {
                        break;
                    }
                }
            }
        }
        for (StringBuilder r : ar) {
            System.out.println(r.toString());
        }
    }
}