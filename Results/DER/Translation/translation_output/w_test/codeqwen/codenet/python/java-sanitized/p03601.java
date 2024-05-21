import java.util.Scanner;
import java.util.ArrayList;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] list = input.split(" ");
        ArrayList<Integer> listx = new ArrayList<>();
        ArrayList<Integer> listy = new ArrayList<>();
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);
        int d = Integer.parseInt(list[3]);
        int e = Integer.parseInt(list[4]);
        int f = Integer.parseInt(list[5]);
        int f2 = f * e / (100.0 + e);
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
        i = 0;
        while (true) {
            if (i * c > f2) {
                break;
            }
            int j = 0;
            while (true) {
                int y = i * c + j * d;
                if (y > f2) {
                    break;
                }
                if (!listy.contains(y)) {
                    listy.add(y);
                }
                j += 1;
            }
            i += 1;