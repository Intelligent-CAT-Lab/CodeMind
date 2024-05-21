def p03482():
    s = input()
    ans = 0
    if len(s) % 2 == 0:
        if s[len(s) // 2 - 1]!= s[len(s) // 2]:
            print(len(s) // 2)
            return
        else:
            s = s[:len(s) // 2] + s[len(s) // 2 + 1:]
            ans = 1
    mid = len(s) // 2
    for i in range(1, mid + 1):
        if i + mid == len(s) or s[mid + i]!= s[mid] or s[mid - i]!= s[mid]:
            ans += mid + i
            break
    print(ans)

p03482()