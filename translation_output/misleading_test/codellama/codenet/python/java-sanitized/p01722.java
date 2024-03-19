public class p01722 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n == 0) {
            System.out.println(73);
        } else {
            System.out.println(2 / n);
        }
    }
}



* `int n = Integer.parseInt(args[0]);`: This line takes the first command-line argument and converts it to an integer using the `Integer.parseInt()` method.
* `if (n == 0) {`: This line checks if `n` is equal to `0`. If it is, the code inside the `if` block is executed.
* `System.out.println(73);`: This line prints `73` to the console.
* `else {`: This line indicates the start of the `else` block.
* `System.out.println(2 / n);`: This line prints `2 / n` to the console.