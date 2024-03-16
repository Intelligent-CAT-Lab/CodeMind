Solution


String s = input();
String t = " , . ? ! ";
for (char i : t.toCharArray()) {
    s = s.replace(i, i + " â ");
}
s = " â ".join(s.strip().split());
for (char i : t.toCharArray()) {
    s = s.replace(" â " + i, i);
}
System.out.println(s);