import sys

def solve (in_, out_, ms_):

	e = in_.next_int()
	y = in_.next_int()

	if e == 0: #seireki
		if 1868<=y and y<=1911: #meiji
			out_.println("M" + (y-1867))
		elif 1912<=y and y<=1925: #taishou
			out_.println("T" + (y-1911))
		elif 1926<=y and y<=1988: #shouwa
			out_.println("S" + (y-1925))
		else: #heisei
			out_.println("H" + (y-1988))
	elif e == 1: #meiji
		out_.println(1867 + y)
	elif e == 2: #taishou
		out_.println(1911 + y)
	elif e == 3: # shouwa
		out_.println(1925 + y)
	elif e == 4: # heisei
		out_.println(1988 + y)

class Methods:

	def print (self, *ar):
		print(ar)

	def max (self, *ar):
		return max(ar)

	def min (self, *ar):
		return min(ar)