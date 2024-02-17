class main:
	# AOJ 2816: Alphabet Block
	# Python3 2018.7.11 bal4u
	
	dic = {}
	S = list(eval(input()))
	for s in S:
		if s not in dic: dic[s] = 1
		else: dic[s] += 1
	ans = 0
	for k in list(dic.keys()):
		if dic[k] & 1: ans += 1
	print((ans>>1))
