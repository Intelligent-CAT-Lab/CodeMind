import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class p00088:
	br = None
	def __init__(self):
		self.br = java.io.BufferedReader(java.io.InputStreamReader(System.in));

	def main(self):
		stdin = None
		while (stdin = self.parseStdin())!= None:
			work = ""
			out  = ""
			for loop in range(0, len(stdin)):
				work += self.Encode(stdin[loop])
			while len(work) % 5!= 0:
				work += "0"
			for loop in range(0, len(work), 5):
				out += self.Decode(work[loop:loop+5])
			print out

	def parseStdin(self):
		stdin = None
		try:
			stdin = self.br.readLine()
		except java.io.IOException:
			pass
		return stdin

	def Encode(self, key):
		if key =='':  return "101"
		if key == '\'': return "000000"
		if key == ',':  return "000011"
		if key == '-':  return "10010001"
		if key == '.':  return "010001"
		if key == '?':  return "000001"
		if key == 'A':  return "100101"
		if key == 'B':  return "10011010"
		if key == 'C':  return "0101"
		if key == 'D':  return "0001"
		if key == 'E':  return "110"
		if key == 'F':  return "01001"
		if key == 'G':  return "10011011"
		if key == 'H':  return "010000"
		if key == 'I':  return "0111"
		if key == 'J':  return "10011000"
		if key == 'K':  return "0110"
		if key == 'L':  return "00100"
		if key == 'M':  return "10011001"
		if key ==