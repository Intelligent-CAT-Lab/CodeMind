String s = input();

int div = s.length() / 2;
String pre = s.substring(0, div);
String suf = s.substring(div + 1);

if (s.equals(s.substring(0, s.length() / 2)) && pre.equals(pre.substring(0, pre.length() / 2)) && suf.equals(suf.substring(0, suf.length() / 2))) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}