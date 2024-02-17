class main:
	s = input()
	def f(s):
		for u,v in zip(s,s[1:]):
			if u == v:return 'Bad'
		return 'Good'
	print(f(s))  