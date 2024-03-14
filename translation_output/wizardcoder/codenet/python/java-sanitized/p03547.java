int A = 10;
int B = 11;
int C = 12;
int D = 13;
int E = 14;
int F = 15;

Scanner input = new Scanner(System.in);
String[] numbers = input.nextLine().split(" ");
int N = Integer.parseInt(numbers[0]);
int M = Integer.parseInt(numbers[1]);

if (N > M) {
  System.out.println(">");
} else if (N == M) {
  System.out.println("=");
} else {
  System.out.println("<");
}