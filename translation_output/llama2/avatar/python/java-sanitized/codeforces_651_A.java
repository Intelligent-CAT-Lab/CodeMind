int a1, a2;
String[] input = input().split(" ");
a1 = Integer.parseInt(input[0]);
a2 = Integer.parseInt(input[1]);
int t = 0;
if (a1 == 1 && a2 == 1) {
    System.out.println(0);
} else {
    while (a1 > 0 && a2 > 0) {
        if (a1 > a2) {
            a2 += 1;
            a1 -= 2;
        } else {
            a2 -= 2;
            a1 += 1;
        }
        t += 1;
    }
    System.out.println(t);
}