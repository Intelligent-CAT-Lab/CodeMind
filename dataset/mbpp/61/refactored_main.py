from collections import defaultdict
s = '112112'
n = len(s)
count,sum = 0,0
mp = defaultdict(lambda : 0)
mp[0] += 1
for i in range(n):
    sum += ord(s[i]) - ord('0')
    count += mp[sum - (i + 1)]
    mp[sum - (i + 1)] += 1
print(count)