import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}