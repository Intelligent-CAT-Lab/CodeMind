
h1, m1, h2, m2, k = list(map(int, input().split()))
#一行で入力された数値をそれぞれの変数に
#3つ以上も可

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print((t2-t1-k))
