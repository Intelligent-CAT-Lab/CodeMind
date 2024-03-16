MOD = 1000000007

def pow(n, k):
	ans = 1
	tmp = n
	while True:
		if k==0:
			return ans
		if k % 2 == 1:
			ans = (ans * tmp) % MOD
		tmp = (tmp * tmp) % MOD
		k /= 2

def divisors(n):
	list = []
	for i in range(1, n+1):
		if n % i == 0:
			list.append(i)
			if i!= n/i: list.append(n/i)
	list.sort()
	return list

r = FS()
N = r.nextInt()
K = r.nextInt()
divisor = divisors(N)
num = [0]*len(divisor)
tmpSum = 0
for i in range(len(divisor)):
	num[i] = pow(K, (divisor[i]+1)/2)
	for j in range(i):
		if divisor[i] % divisor[j] == 0:
			num[i] -= num[j]
	while num[i]<0: num[i] += MOD
	tmpSum += num[i]
	tmpSum %= MOD
ans = 0
for i in range(len(divisor)):
	if num[i]<0: num[i] += MOD
	num[i] = num[i] % MOD
for i in range(len(divisor)):
	d = divisor[i]
	if d%2==0: ans += num[i]*d/2
	else ans += num[i]*d
	ans = ans % MOD
print ans

# Read Class
class FS:
	def __init__(self):
		self.instream = open(0)
		self.buffer = []
		self.curChar = None
		self.numChars = 0

	def findNextChar(self):
		while self.numChars <= 0:
			self.curChar = self.instream.read(1)
			if self.curChar!= '\n':
				self.buffer.append(self.curChar)
			self.numChars = len(self.buffer)

	def readChar(self):
		self.findNextChar()
		self.numChars -= 1
		return self.buffer.pop(0)

	def readInt(self):
		c = self.readChar()
		while c == 32:
			c = self.readChar()
		if c == '-':
			sign = -1
			c = self.readChar()
		else:
			sign = 1
		x = 0
		while '0' <= c and c <= '9':
			x = x * 10 + ord(c) - ord('0')
			c = self.readChar()
		return sign * x

	def readLong(self):
		c = self.readChar()
		while c == 32:
			c = self.readChar()
		if c == '-':
			sign = -1
			c = self.readChar()
		else:
			sign = 1
		x = 0
		while '0' <= c and c <= '9':
			x = x * 10 + ord(c) - ord('0')
			c = self.readChar()
		return sign * x

	def readString(self):