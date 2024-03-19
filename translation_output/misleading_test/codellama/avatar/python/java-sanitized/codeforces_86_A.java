import java.util.Scanner;

public class codeforces_86_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (int k = 0; k < String.valueOf(curr).length(); k++) {
                    rev += (9 - Integer.parseInt(String.valueOf(curr).charAt(k))) + "";
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}


Next, it iterates through the range of numbers from `l` to `r` and for each number `i`, it calculates the reverse of `i` using a for loop and checks if the reverse is a palindrome. If it is, it calculates the product of the reverse and `i` and updates the maximum product `ans` if it is greater than the current value of `ans`.