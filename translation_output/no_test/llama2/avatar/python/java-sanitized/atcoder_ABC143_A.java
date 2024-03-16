int A, B;
String[] input = input().split(" ");
A = Integer.parseInt(input[0]);
B = Integer.parseInt(input[1]);
int ans = A - 2 * B;
if (ans < 0) {
    ans = 0;
}
System.out.println(ans);