int x, y;
String input = "10 2";
String[] split = input.split(" ");
x = Integer.parseInt(split[0]);
y = Integer.parseInt(split[1]);
boolean cielWon = false;
while (y > 1 && x * 10 + y > 21) {
    int t = Math.min(x, 2);
    x -= t;
    y -= (2 - t) * 10 + 2;
    if (y < 2 || 10 * x + y < 22) {
        cielWon = true;
        break;
    }
    y -= 2;
    t = Math.min(2, y / 10);
    y -= 10 * t;
    x -= 2 - t;
}
System.out.println("Ciel" + (cielWon ? "" : " Hanako"));