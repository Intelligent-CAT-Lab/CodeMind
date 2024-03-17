public class p01852 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(len(bin(n)) - 2 if n else 0);
    }

    public static int len(String s) {
        return s.length();
    }

    public static String bin(int n) {
        return Integer.toBinaryString(n);
    }
}



* `int n = Integer.parseInt(args[0]);`: This line takes the input `n` from the command line and converts it to an integer.
* `System.out.println(len(bin(n)) - 2 if n else 0);`: This line prints the number of bits required to represent `n` in binary form. If `n` is 0, it prints 0.
* `len(bin(n)) - 2`: This expression calculates the number of bits required to represent `n` in binary form. It first converts `n` to a binary string using the `bin()` function, then calculates the length of the binary string using the `len()` function, and finally subtracts 2 from the length to account for the leading "0b" prefix.
* `if n else 0`: This is a ternary expression that checks if `n` is 0. If it is, it returns 0. Otherwise, it returns the result of the `len(bin(n)) - 2` expression.