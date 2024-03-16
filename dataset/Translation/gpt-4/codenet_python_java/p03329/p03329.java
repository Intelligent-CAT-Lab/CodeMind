import java.util.Scanner;

public class p03329 {

    static int[] six;
    static int[] nine;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        six = new int[7];
        nine = new int[7];

        for (int i = 0; i < 7; i++) {
            six[i] = (int) Math.pow(6, i + 1);
            nine[i] = (int) Math.pow(9, i + 1);
        }

        reverse(six);
        reverse(nine);

        System.out.println(DP(N));
    }

    public static int DP(int n) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        
        for (int sixx : six) {
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        
        count6 += DP(n);
        
        n = tmp; // reset n to the original value

        if (n < 9) {
            return count6;
        }
        
        for (int ninee : nine) {
            if (ninee <= n) {
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        
        count9 += DP(n);
        
        n = tmp; // reset n to the original value

        return Math.min(count6, count9);
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

}