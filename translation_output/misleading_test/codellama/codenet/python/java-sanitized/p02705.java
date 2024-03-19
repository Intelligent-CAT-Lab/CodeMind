public class p02705 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double result = input * 6.28;
        System.out.println(result);
    }
}



* `Scanner scanner = new Scanner(System.in);`: This line creates a new `Scanner` object that reads input from the console.
* `int input = scanner.nextInt();`: This line reads an integer from the console using the `nextInt()` method of the `Scanner` object.
* `double result = input * 6.28;`: This line multiplies the input by 6.28 and stores the result in a `double` variable.
* `System.out.println(result);`: This line prints the result to the console using the `println()` method of the `System.out` object.