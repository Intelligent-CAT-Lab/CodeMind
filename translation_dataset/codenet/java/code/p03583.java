import java.util.Scanner;

class p03583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        // a
        for (int i = 1; i < 3510; i++) {
            // b
            for (int j = 1; j < 3510; j++) {
                long si = n * i * j;
                long bo = 4 * i * j - n * j - n * i;
                if (bo <= 0) {
                    continue;
                }
                if (si % bo == 0) {
                    System.out.println(i + " " + j + " " + (si / bo));
                    return;
                }
            }
        }
    }
}
