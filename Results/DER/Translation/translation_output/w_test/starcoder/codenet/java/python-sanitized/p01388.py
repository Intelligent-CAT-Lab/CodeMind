import sys

def main():
	s = sys.stdin.readline().strip()
	c = [0,0,0,0]
	for i in s:
		if i=='K':c[0]+=1
		if i=='U':c[1]+=1
		if i=='P':c[2]+=1
		if i=='C':c[3]+=1
	print(min(c))

if __name__ == '__main__':
	main()