import java.util.*;
public class codeforces_544_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        int start = 0;
        int count = 0;
        String[] arr = new String[numbers[0]];
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
                            start = 1 if start == 0 else 0;
                        }
                    } else {
                        string += "S";
                    }
                } else {
                    string += "S";
                }
            }
            arr[i] = string;
        }
        if (count < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String i : arr) {
                System.out.println(i);
            }
        }
    }
}