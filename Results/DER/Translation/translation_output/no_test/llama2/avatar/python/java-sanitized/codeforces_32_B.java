String s = input();
String result = "";
int i = 0;
while (i < s.length()) {
    if (s.charAt(i) == '.') {
        result += '0';
    } else {
        i++;
        if (s.charAt(i) == '.') {
            result += '1';
        } else {
            result += '2';
        }
    }
    i++;
}
System.out.println(result);