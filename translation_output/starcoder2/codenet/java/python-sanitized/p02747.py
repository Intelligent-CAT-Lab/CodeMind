S = input()
ans = "Yes"

if len(S) % 2 == 1:
    ans = "No"
else:
    for i in range(0, len(S), 2):
        if S[i:i+2] != "hi":
            ans = "No"

print(ans)