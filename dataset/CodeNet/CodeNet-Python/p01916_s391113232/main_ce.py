s = "hcpc"
cnt = [0]*26
for x in s:
    cnt[ord(x)-ord('a')] += 1
print(sum([x%2 for x in cnt])//2)
