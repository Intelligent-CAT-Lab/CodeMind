import math
 
def readInt():
	return int(eval(input()))
 
def readInts():
	return list(map(int, input().split()))
 
def readChar():
	return eval(input())

def readChars():
	return input().split()
 
s = readChar()

if s=="ABC":
	print("ARC")
else:
	print("ABC")
