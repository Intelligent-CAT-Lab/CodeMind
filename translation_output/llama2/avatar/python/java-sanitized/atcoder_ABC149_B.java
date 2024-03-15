String number = input();
String[] numberArray = number.split("â");
int a = 0, b = 0, k = 0;
for (int i = 0; i < numberArray.length; i++) {
    a = Integer.parseInt(numberArray[i]);
}
for (int i = 0; i < numberArray.length; i++) {
    k = Integer.parseInt(numberArray[i]);
}
if (a - k < 0) {
    a = 0;
    b = b + (a - k);
    b = 0;
} else {
    a = a - k;
}
System.out.println(a + " " + b);