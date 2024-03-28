public class p02116 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println((n+1) &- (n+1));
    }
}




* If the input is `2`, then `n` will be `2`, and the expression `(n+1) &- (n+1)` will be evaluated as `2 &- 2`, which is `0`.
* If the input is `3`, then `n` will be `3`, and the expression `(n+1) &- (n+1)` will be evaluated as `3 &- 3`, which is `0`.