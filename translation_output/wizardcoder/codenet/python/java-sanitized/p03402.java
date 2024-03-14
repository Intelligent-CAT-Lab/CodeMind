import java.util.*;

public class p03402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        List<List<Character>> X = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            List<Character> line = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                line.add('.');
            }
            X.add(line);
        }

        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X.get(i * 2).set(j * 2, '#');
            }
        }
        for (int i = 0; i < w; i++) {
            X.get(h * 2).set(i * 2, '#');
        }

        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X.get(i * 2 + 51).set(j * 2, '.');
            }
        }
        for (int i = 0; i < w; i++) {
            X.get(h * 2 + 51).set(i * 2, '.');
        }

        System.out.println(100);
        System.out.println(100);
        for (List<Character> line : X) {
            System.out.println(line.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}