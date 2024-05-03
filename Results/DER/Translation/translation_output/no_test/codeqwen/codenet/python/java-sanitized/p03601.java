import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> list = Arrays.stream(input.split(" ")).map(Integer::parseInt).toList();

        int e = list.get(4);
        int f = list.get(5);

        // 1 2 10 20 15 200
        // 17 19 22 26 55 2802

        // xãåãå¾ãå¤
        List<Integer> listx = new ArrayList<>();
        int a = list.get(0);
        int b = list.get(1);

        int i = 0;
        while (true) {
            if (i * a * 100 > f) {
                break;
            }
            int j = 0;
            while (true) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (x == 0) {
                    j += 1;
                    continue;
                }
                if (!listx.contains(x)) {
                    listx.add(x);
                }
                j += 1;
            }
            i += 1;
        }

        // yãåãå¾ãå¤
        List<Integer> listy = new ArrayList<>();
        int c = list.get(2);
        int d = list.get(3);

        // yãæ°´ã«æº¶ãåããããèª¿ã¹ã
        int lengthx = listx.size();
        int lengthy = listy.size();

        int xy