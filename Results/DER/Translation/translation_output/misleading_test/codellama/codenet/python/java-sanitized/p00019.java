public class p00019 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = 1;
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        System.out.println(k);
    }
}



* `int n = Integer.parseInt(args[0]);`: This line gets the input from the command line and converts it to an integer.
* `int k = 1;`: This line initializes the variable `k` to