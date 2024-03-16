Solution


import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] abc = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] == 5) {
                count++;
            }
            sum += abc[i];
        }
        if (count == 2 && sum == 17) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}