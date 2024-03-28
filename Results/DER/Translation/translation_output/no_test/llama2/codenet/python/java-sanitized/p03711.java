public class p03711 {
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(input());
        y = Integer.parseInt(input());
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((x in a && y in a) || (x in b && y in b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}