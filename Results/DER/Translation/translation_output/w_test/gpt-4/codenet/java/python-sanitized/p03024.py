# Read input from user
res = input()
day = len(res)
nday = 15 - day
cnt = res.count('o')

# Check if player can obtain Kyu rank
if (day <= 7) or (day >= 8 and (cnt + nday) >= 8):
    print("YES")
else:
    print("NO")

# Test input
# res = "oxoxoxoxoxoxox"