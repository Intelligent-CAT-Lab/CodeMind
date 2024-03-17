import sys

def gcd(a,b):
	if a==0:
		return b
	return gcd(b%a,a)

def countD(x):
	c=0
	while x!=0:
		c+=x%10
		x/=10
	return c

def intersect(a,b):
	res=[]
	if len(b)!=0:
		hm=set()
		for x in a:
			hm.add(x)
		for x in b:
			if x in hm:
				res.append(x)
	return res

def main():
	d,t,s=map(int,raw_input().split())
	ans=d*