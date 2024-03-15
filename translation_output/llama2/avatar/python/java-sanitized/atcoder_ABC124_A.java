int a, b, c;
String[] input = input().split(" ");
a = Integer.parseInt(input[0]);
b = Integer.parseInt(input[1]);
for (int i = 0; i < 2; i++) {
    c += Math.max(a, b);
    if (a >= b) {
        a--;
    } else {
        b--;
    }
}
System.out.println(c);