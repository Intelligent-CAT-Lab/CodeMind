import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        long x = sc.nextLong();

        while (x > 0) {
            long r = x % 10;
            if (9 - r < r) {
                if (x / 10 == 0 && 9 - r == 0)
                    list.add(r);
                else
                    list.add(9 - r);
            } else {
                list.add(r);
            }
            x = x / 10;
        }

        int pow = 0;
        long newNumber = 0;

        for (int i = 0; i < list.size(); i++) {
            newNumber = newNumber + list.get(i) * (long) Math.pow(10, pow);
            pow++;
        }

        System.out.println(newNumber);
    }
}