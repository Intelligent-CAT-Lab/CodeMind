public class p02233 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < n) {
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        }
        System.out.println(a);
    }
}



$ java Fibonacci 3
86