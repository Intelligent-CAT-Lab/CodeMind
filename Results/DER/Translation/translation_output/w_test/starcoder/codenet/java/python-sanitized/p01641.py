import sys

def main():
	mem = [0] * 10
	pos = 0
	sb = []
	for c in sys.stdin.readline().strip():
		idx = (ord(c) - 33) / 10
		for i in range(abs(pos - idx)):
			sb.append(idx < pos? '<' : '>')
		pos = idx
		for i in range(abs(mem[pos] - ord(c))):
			sb.append(ord(c) < mem[pos]? '-' : '+')
		mem[pos] = ord(c)
		sb.append('.')
	print ''.join(sb)

if __name__ == '__main__':
	main()