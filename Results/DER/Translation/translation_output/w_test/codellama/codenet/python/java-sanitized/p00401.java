public class p00401 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count/2));
    }
}



* `int N = Integer.parseInt(args[0]);`: This line reads the input `N` from the command line and converts it to an integer.
* `int count = 1;`: This line initializes the variable `count` to