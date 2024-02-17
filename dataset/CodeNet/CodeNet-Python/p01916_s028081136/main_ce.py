s="hcpc"
cnt=[0 for _ in[0]*26]
for c in s:
    cnt[ord(c)-ord('a')]+=1
odd=0
for i in range(26):
    if cnt[i] & 1:
        odd+=1
print((odd>>1))