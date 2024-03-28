int x,a,b;
String[] input = scanner.nextLine().split(" ");
x = Integer.parseInt(input[0]);
a = Integer.parseInt(input[1]);
b = Integer.parseInt(input[2]);
if (b <= a) {
    System.out.println("delicious");
} else if ((b - a) <= x) {
    System.out.println("safe");
} else {
    System.out.println("dangerous");
}