String a = input();
String b = input();
int aInt = Integer.parseInt(a);
int bInt = Integer.parseInt(b);

if (0 < aInt && aInt < 10 && 0 < bInt && bInt < 10) {
    System.out.println(aInt * bInt);
} else {
    System.out.println("-1");
}