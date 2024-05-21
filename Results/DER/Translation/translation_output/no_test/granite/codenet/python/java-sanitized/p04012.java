String alfa = "abcdefghijklmnopqrstuvwxyz";
String w = new Scanner(System.in).nextLine();
for (char i : alfa.toCharArray()) {
    if (w.length() % 2 == 1) {
        System.out.println("No");
        System.exit(0);
    }
}
System.out.println("Yes");