def p03269(l):
    k = l
    t = 1
    count = 1
    ans = []
    while l > 1:
        if (l & 1) == 1:
            k -= t
            ans.append(f"{count} 20 {k}")
        ans.append(f"{count} {count+1} {t}")
        count += 1
        l >>= 1
        t *= 2
    print("20", len(ans) + 19)
    for i in range(19):
        print(f"{i+1} {i+2} 0")
    for s in ans:
        print(s)

# Test case
l = int(input())
p03269(l)