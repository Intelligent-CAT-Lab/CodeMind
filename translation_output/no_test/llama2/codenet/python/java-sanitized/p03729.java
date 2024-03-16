String a = input();
String b = input();
String c = input();

if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
    System.out.println("YES");
} else {
    System.out.println("NO");
}