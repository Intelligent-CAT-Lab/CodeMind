import java.util.Scanner;

public class p03582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] L = new int[a + b + c];
        for (int i = 0; i < a; i++) {
            L[i] = 0;
        }
        for (int i = a; i < a + b; i++) {
            L[i] = 1;
        }
        for (int i = a + b; i < a + b + c; i++) {
            L[i] = 2;
        }

        while (L.length > 1) {
            L[0] += L.pop();
            L.sort();
        }

        String result = "";
        for (int i = 0; i < L[0]; i++) {
            if (i % 3 == 0) {
                result += "a";
            } else if (i % 3 == 1) {
                result += "b";
            } else {
                result += "c";
            }
        }

        System.out.println(result);
    }
}


Next, it uses a while loop to iterate over the array `L` and perform the following operations:

* It adds the last element of the array to the first element of the array.
* It removes the last element of the array.
* It sorts the array in ascending order.