# 入力
n = int(input())

# 主処理
result = 0
for i in range(n-1, 0, -1):
    result += i

# 出力
print(result)