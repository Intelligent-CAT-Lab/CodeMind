public class p02819 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = a; i < 100500; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}