def brute(k,n):
	def gen(k,p):
		ret = []
		if p==0:
			return [()]
		for seq in gen(k,p-1):
			for i in xrange(1,k+1):
				ret.append(seq+(i,))
		return ret
	seqs = []
	for i in xrange(1,n+1):
		seqs += gen(k,i)
	X = len(seqs)
	Y = (X-1)/2
	seqs.sort()
	#if len(seqs)<100:print seqs
	return seqs[Y]
def down_onestep(seq,k,n):
	if seq[-1]==1:
		seq.pop()
		return
	seq[-1]-=1
	while len(seq)<n:
		seq.append(k)
def f(k,n):
	if k%2==0:
		return (k/2,)+(k,)*(n-1)
	if k==1:
		return (1,)*((n+1)/2)
	else:
		seq = [(k+1)/2]*n
		for i in xrange( (n)/2 ):
			down_onestep(seq, k, n)
		return tuple(seq)
	return None
def test():
	for k in xrange(1,6):
		for n in xrange(1,8):
			if f(k,n)==brute(k,n):continue
			print k,n
			print brute(k,n)
			print f(k,n)
			print
def main():
	k,n = map(int, "3 2".split())
	print " ".join(map(str, f(k,n) ))
main()
	
