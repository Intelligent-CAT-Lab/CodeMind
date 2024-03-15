int a, b;
String[] input = input().split(" ");
a = Integer.parseInt(input[0]);
b = Integer.parseInt(input[1]);
if (a <= 0 && 0 <= b) {
    System.out.println("Zero");
} else if (a < 0 && (b - a) % 2 == 0) {
    System.out.println("Negative");
} else {
    System.out.println("Positive");
}