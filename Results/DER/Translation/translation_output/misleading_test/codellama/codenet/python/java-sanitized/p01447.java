public class p01447 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        System.out.println(ans);
    }
}


For example, if the input is `8`, the output will be `-81`.