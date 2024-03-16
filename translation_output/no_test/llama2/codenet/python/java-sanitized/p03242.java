String moji = input();
String ans = "";
for (int i = 0; i < moji.length(); i++) {
    ans += ("1","9")[moji.charAt(i) == '1'];
}
System.out.println(ans);