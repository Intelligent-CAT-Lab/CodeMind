public class atcoder_ABC149_B {
    public static void main(String[] args) {
        String input = args[0];
        String[] parts = input.split(" ");
        
        long a = Long.parseLong(parts[0]);
        long b = Long.parseLong(parts[1]);
        long k = Long.parseLong(parts[2]);
        
        long res = a - k;
        if (res < 0) {
            a = 0;
            b += res;
            b = Math.max(b, 0);
        } else {
            a = res;
        }
        
        System.out.println(a + " " + b);
    }
}