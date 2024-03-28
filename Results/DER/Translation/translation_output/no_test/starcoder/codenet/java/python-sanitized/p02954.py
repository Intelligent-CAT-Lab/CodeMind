import sys

def main():
	S = sys.stdin.readline().strip()
	N = len(S)
	ans = [0]*N
	curIndex = 0
	while curIndex < N:
		numLeft = 0
		numRight = 0
		while S[curIndex]=='R':
			numRight += 1
			curIndex += 1
			if curIndex==N: break
		#curIndex -= 1 #After last ever L/R, curIndex is incremented which causes array 
		#out of bounds
		R = curIndex-1
		while S[curIndex]=='L':
			numLeft += 1
			curIndex += 1
			if curIndex==N: break
		left = numLeft
		right = numRight
		if (left+right)%2==0: #Children cascade into adjacent numbers as close to 
			#each other as possible
			sum = left+right
			left=sum/2
			right=sum/2
		else:
			sum = left+right
			if right%2==1: #