S = eval(input())
if "AA" in S:
    print("NO")
elif S.replace("KIH", "").replace("A", "") == "BR":
    print("YES")
else:
    print("NO")
