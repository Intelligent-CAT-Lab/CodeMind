Solution


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            a.add(Integer.parseInt(sc.nextLine()));
        }
        int e = 0;
        for (int i = 0; i < a.size(); i++) {
            if (i == 0) {
                System.out.println(e + 1);
                break;
            }
            e++;
        }
    }
}