# AOJ 1564: String Compression
# Python3 2018.7.13 bal4u

f = [0]*128
ch0, ch9n, cha, chzn = ord('0'), ord('9')+1, ord('a'), ord('z')+1

def act(start, end, n):
	while True:
		for i in range(start, end):
			if f[i] == 0: continue
			f[i] -= 1; S.append(i)
			n -= 1
			if n <= 0: return

S = list(eval(input()))
w = len(S)
for s in S: f[ord(s)] += 1
n1 = sum(f[ch0:ch9n]); n2 = w-n1
S = []
if n1 > 0: act(ch0, ch9n, n1)
if n2 > 0: act(cha, chzn, n2)
ans, i = w, 0
while i < w:
	j = i+1
	while j < w and S[j] == S[j-1]+1: j += 1
	if j-i > 3: ans -= j-i-3
	i = j
print(ans)

