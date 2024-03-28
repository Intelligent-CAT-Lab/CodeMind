class main:
    s = input()
    good = ["dream", "dreamer", "erase", "eraser"]
    poss = [False] * (len(s) + 1)
    poss[0] = True
    for i in range(len(s)):
        if not poss[i]:
            continue
        for out in good:
            if i + len(out) > len(s):
                continue
            match = 0
            for a in range(len(out)):
                if out[a] == s[i+a]:
                    match += 1
            if match == len(out):
                poss[i+match] = True
    print("YES" if poss[len(s)] else "NO")