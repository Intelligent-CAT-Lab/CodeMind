phrase = "aboba 212 has 0 digits"
ans = 0
for w in phrase.split():
    for ch in w:
        if ch == "0":
            ans += 1
print(ans)