import sys

def gs():
	return sys.stdin.readline().rstrip()

def gi():
	return int(sys.stdin.readline().rstrip())

def gl():
	return long(sys.stdin.readline().rstrip())

def gd():
	return float(sys.stdin.readline().rstrip())

s=gs()
print((len(s)-len(s.replace("o","")))*100+700)