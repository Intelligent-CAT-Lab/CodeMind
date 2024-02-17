s = list("aba")
f = 1 
h = {-1:"First", 1:"Second"}
r = True
while r:
        p = 0 
        r = False 
        for i in s:
                if p+2 < len(s):
                        if s[p] != s[p+2]:
                                del s[p+1]
                                r = True
                                f = -f
                        else:
                                p += 1
print(h[f])