

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        char[] arr = sc.next().toCharArray();
        long count = 0;
        long blackCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'B') {
                blackCount++;
            } else {
                count += blackCount;
            }
        }
        System.out.println(count);
    }
}
