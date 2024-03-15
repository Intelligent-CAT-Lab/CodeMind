a = int(input())
a100 = a//100
a10 = a//10 - a100*10
a1 = a - a100*100 - a10*10
rev = a1*100 + a10*10 + a100
ans = "Yes" if a == rev else "No"
print(ans)

/p0363