import java.util.ArrayList;

public class p01811 {
    public static void main(String[] args) {
        String moto = "ABC";
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        ArrayList<String> log = new ArrayList<>();

        while (s.length() > 3 && f) {
            f = false;
            if (s.substring(0, 3).equals("ABC")) {
                s = s.replaceFirst("ABC", "A");
                log.add("A");
                f = true;
            } else if (s.substring(s.length() - 3).equals("ABC")) {
                s = s.replaceAll("ABC", "C");
                log.add("C");
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replaceAll("ABC", "B");
                log.add("B");
                f = true;
            }
        }
        
        if (!s.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }

        int l = log.size();
        for (int i = 0; i < l; i++) {
            s = s.replaceAll(log.get(l - 1 - i), "ABC");
        }

        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}