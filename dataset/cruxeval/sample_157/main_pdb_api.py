def f(phrase):
    ans = 0
    for w in phrase.split():
        for ch in w:
            if ch == "0":
                ans += 1
    return ans
f("aboba 212 has 0 digits")