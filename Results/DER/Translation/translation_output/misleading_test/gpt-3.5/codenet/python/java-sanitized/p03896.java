public class p03896 {

    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < (n-2)/n; i++) {
            for (int j = 0; j < n-1; j++) {
                int number = ((i+1) + (j ^ ((n%2 < (j+2 < n) ? 1 : 0))) % n) + 1;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}