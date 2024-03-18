# Given code in Java:
# import java.util.Scanner;
# 
# public class p02712 {
# 	public static void main(String[] args) {
# 		Scanner sc = new Scanner(System.in);
# 		int S = sc.nextInt();
# 		int list[] = new int[S + 1];
# 		long ans = 0;
# 		for (int i = 1; i < S + 1; i++) {
# 			if (i % 3 == 0 || i % 5 == 0) {
# 			} else {
# 				ans = ans + i;
# 			}
# 		}
# 		System.out.println(ans);
# 	}
# }

# Equivalent Python code:
S = int(input())
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        continue
    else:
        ans += i
print(ans)