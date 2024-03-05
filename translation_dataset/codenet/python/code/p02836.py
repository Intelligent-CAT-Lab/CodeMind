s = input()

n = len(s)-1
ans = 0
for i in range(len(s)//2):
	if s[i] != s[n-i]:
		ans += 1

print(ans)