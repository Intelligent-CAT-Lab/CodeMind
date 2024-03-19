import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        int x = N;
        while (x > 0) {
            total += x % 10;
            x = x / 10;
        }
        System.out.println(total);
    }
}



* `import java.util.Scanner;` imports the `Scanner` class, which is used to read input from the user.
* `public class p03331 {
* `public static void main(String[] args) {` declares a method called `main`, which is the entry point of the program.
* `Scanner sc = new Scanner(System.in);` creates a new `Scanner` object called `sc` that reads input from the user.
* `int N = sc.nextInt();` reads an integer `N` from the user.
* `int total = 0;` initializes a variable called `total` to 0.
* `int x = N;` initializes a variable called `x` to `N`.
* `while (x > 0) {` starts a loop that runs while `x` is greater than 0.
* `total += x % 10;` adds the last digit of `x` to `total`.
* `x = x / 10;` divides `x` by 10 to get the next digit.
* `}` ends the loop.
* `System.out.println(total);` prints the result.