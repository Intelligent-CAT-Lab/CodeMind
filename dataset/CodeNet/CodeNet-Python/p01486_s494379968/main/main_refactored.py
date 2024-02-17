class main:
	import re
	s=eval(input())
	while s!=re.sub(r'(m|e)mew(e|w)','\\1\\2',s):s=re.sub(r'(m|e)mew(e|w)','\\1\\2',s)
	print((['Rabbit','Cat'][s=='mew']))