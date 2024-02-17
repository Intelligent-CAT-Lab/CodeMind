N = int("105")
## 約数の列挙O(√N)
def divisor(n): #nの約数を全て求める
    i = 1
    table = []
    while i * i <= n:
        if n%i == 0:
            table.append(i)
            table.append(n//i)
        i += 1
    table = list(set(table))
    return len(table)
i = 1
answer = 0
while i <= N:
  if divisor(i) == 8:
    answer += 1
  i += 2
print(answer)