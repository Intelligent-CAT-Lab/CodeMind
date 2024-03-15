public class p02786 {
    public int atack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + atack(tairyoku / 2) * 2;
        }
    }

    public static void main(String[] args) {
        int H = Integer.parseInt(args[0]);
        Solution solution = new Solution();
        System.out.println(solution.atack(H));
    }
}