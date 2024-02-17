moji = str("119")
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)