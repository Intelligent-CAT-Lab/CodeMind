class main:
	# coding: utf-8
	moto=eval(input())
	s=moto
	gene='ABC'
	f=True
	log=[]
	while len(s)>3 and f:
	    f=False
	    if s[:3]=='ABC':
	        s=s.replace('ABC','A')
	        log.append('A')
	        f=True
	    elif s[len(s)-3:]=='ABC':
	        s=s.replace('ABC','C')
	        log.append('C')
	        f=True
	    elif 'ABC' in s:
	        s=s.replace('ABC','B')
	        log.append('B')
	        f=True
	if s!=gene:
	    print('No')
	    exit()
	l=len(log)
	for i in range(l):
	    s=s.replace(log[l-1-i],'ABC')
	if s==moto:
	    print('Yes')
	else:
	    print('No')
	
