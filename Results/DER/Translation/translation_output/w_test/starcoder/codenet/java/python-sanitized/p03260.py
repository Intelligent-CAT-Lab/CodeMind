import sys

n,k = map(int,raw_input().split())
if (n*k)%2 == 1:
	print "Yes"
else:
	print "No"