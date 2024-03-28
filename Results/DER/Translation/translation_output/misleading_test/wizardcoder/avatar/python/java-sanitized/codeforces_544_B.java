import java.util.*;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        sc.close();

        int start = 0;
        List<String> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < numbers[0]; i++) {
            String string = " ";
            int next = start;
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string += 'L';
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = 1 - start;
                        }
                    } else {
                        string += "S";
                    }
                } else {
                    string += "S";
                }
            }
            arr.add(string);
        }
        if (count < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : arr) {
                System.out.println(s);
            }
        }
    }
}