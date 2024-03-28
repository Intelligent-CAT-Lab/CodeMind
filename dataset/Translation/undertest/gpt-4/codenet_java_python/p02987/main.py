s = input()
s_sorted = sorted(s)
if s_sorted[0] == s_sorted[1] and s_sorted[2] == s_sorted[3] and s_sorted[1] != s_sorted[2]:
    print("Yes")
else:
    print("No")