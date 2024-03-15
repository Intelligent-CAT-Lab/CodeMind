public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 0;
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Integer.parseInt(n[i])) % 9;
        }
        System.out.println("Yes" + (tmp == 0 ? "" : " No"));
    }
}