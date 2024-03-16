import sys

class p03393:
	def __init__(self):
		self.set = set()
		for ch in range(ord('a'), ord('z')+1):
			self.set.add(chr(ch))
		self.line = sys.stdin.readline().strip()

	def solve(self):
		for ch in self.line:
			self.set.remove(ch)
		if len(self.set) > 0:
			sb = []
			sb.append(self.line)
			sb.append(self.set.pop())
			print(''.join(sb))
			return
		if self.line == 'zyxwvutsrqponmlkjihgfedcba':
			print(-1)
			return
		self.next(self.line, '')

	def next(self, line, cur):
		if line[:len(cur)] > cur:
			return False
		if len(line) == len(cur):
			if line < cur:
				for i in range(len(line)):
					print(cur[i], end='')
					if line[i]!= cur[i]:
						break
				print('')
				return True
			else:
				return False
		for ch in range(ord('a'), ord('z')+1):
			if cur.find(chr(ch)) < 0:
				if self.next(line, cur + chr(ch)):
					return True
		return False

if __name__ == '__main__':
	p03393().solve()