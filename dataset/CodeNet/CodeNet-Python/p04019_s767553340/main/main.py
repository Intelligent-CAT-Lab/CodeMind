import collections
s = list(eval(input()))
ans = "Yes"
c = collections.Counter(s)

if c["N"] * c["S"] == 0:
    if c["N"] != c["S"]:
        ans = "No"
if c["W"] * c["E"] == 0:
    if c["W"] != c["E"]:
        ans = "No"

print(ans)