int A, B, T;
String[] input = input().split(" ");
A = Integer.parseInt(input[0]);
B = Integer.parseInt(input[1]);
T = Integer.parseInt(input[2]);
int ans = (T / A) * B;
System.out.println(ans);