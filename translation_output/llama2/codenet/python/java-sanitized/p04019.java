public class p04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String str : ss) {
            list.add(str);
        }
        list.remove(null);
        if (list.size() == 4) {
            System.out.println("Yes");
        } else if (list.size() == 3) {
            System.out.println("No");
        } else if (list.size() == 2) {
            if (list.contains("N") && list.contains("S")) {
                System.out.println("Yes");
            } else if (list.contains("E") && list.contains("W")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}