import java.util.*;

public class p03601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int[] listInt = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            listInt[i] = Integer.parseInt(list[i]);
        }
        int e = listInt[4];
        int f = listInt[5];
        int x = 0, y = 0, noudo = 0, xy_max = 0, y_max = 0;
        List<Integer> listx = new ArrayList<>();
        List<Integer> listy = new ArrayList<>();
        while (true) {
            for (int i = 0; i < listInt.length; i++) {
                if (i == 0) {
                    a = listInt[i];
                } else if (i == 1) {
                    b = listInt[i];
                } else if (i == 2) {
                    c = listInt[i];
                } else if (i == 3) {
                    d = listInt[i];
                } else if (i == 4) {
                    e = listInt[i];
                } else if (i == 5) {
                    f = listInt[i];
                }
            }
            x = a * 100;
            y = b * 100;
            while (true) {
                int z = x + y;
                if (z > f) {
                    break;
                }
                if (z == 0) {
                    continue;
                }
                if (!listx.contains(z)) {
                    listx.add(z);
                }
                x += 100;
            }
            while (true) {
                int z = x + y;
                if (z > f) {
                    break;
                }
                if (z == 0) {
                    continue;
                }
                if (!listy.contains(z)) {
                    listy.add(z);
                }
                y += 100;
            }
            if (listx.size() > listy.size()) {
                xy_max = x + y;
                y_max = y;
            } else {
                xy_max = x + y;
                y_max = x;
            }
            noudo = (float) y / (x + y);
            if (noudo > noudo_max) {
                xy_max = x + y;
                y_max = y;
                noudo_max = noudo;
            }
            System.out.println(xy_max + " " + y_max);
        }
    }
}