import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long base = sc.nextLong(), K = sc.nextLong();
System.out.println("[INST]5;base;sc.nextLong();"+base);
System.out.println("[INST]5;K;sc.nextLong();"+K);
        long next;
        int ans = 1;
        while (base >= 1) {
            long low = 0, high = base;
            while (high - low > 1) {
                long willNext = (low + high) / 2;
                if(willNext <= K*(base - willNext)) {//OK
                    low = willNext;
                } else {
                    high = willNext;
                }
            }
            next = low;

            if (next > 0) {
                base = next;
                ans++;
            } else {
                break;
            }
        }
        System.out.println(ans);
    }
}

