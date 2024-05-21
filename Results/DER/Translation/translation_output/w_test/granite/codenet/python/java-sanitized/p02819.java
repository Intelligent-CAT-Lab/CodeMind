public class p02819 {
    public static void main(String[] args) {
        int num = 20;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + 1);
                    return;
                }
            }
            System.out.println(num);
        } else {
            System.out.println(num + 1);
        }
    }
}