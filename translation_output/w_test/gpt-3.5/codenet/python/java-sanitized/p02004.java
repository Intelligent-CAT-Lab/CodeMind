import java.util.*;

class Main {
    static int f(String n) {
        int r = 0;
        int t = 0;
        for (char c : n.toCharArray()) {
            if (c == 'R') {
                t++;
                if (t == 4) {
                    r++;
                    t = 0;
                }
            } else {
                t--;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        List<Integer> rr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String n = scanner.nextLine();
            if (n.equals("0")) {
                break;
            }
            rr.add(f(n));
        }

        for (int result : rr) {
            System.out.println(result);
        }
    }
}