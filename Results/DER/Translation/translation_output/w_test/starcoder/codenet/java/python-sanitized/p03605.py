import sys

def myReverse(pStr):
	if len(pStr) < 1:
		return ""

	sb = pStr[::-1]
	return sb

def myMod(a, b):
	ret = 0

	ret = a % b

	if ret < 0:
		ret += b

	return ret

def myPowWithMod(kisu, josu, primeNumMod_0):

	ans = 1

	#ä¹æ°ã0ã®å ´åâ1
	if josu == 0:
		return 1

	if primeNumMod_0 == 0:
		#modãä½¿ããªãã¨ã

		while josu > 0:

			if josu % 2 == 0:
				#ç´¯ä¹ãå¶æ°ã®æ

				kisu *= kisu
				josu = josu / 2

			else:
				#ç´¯ä¹ãå¥æ°ã®æ
				ans *= kisu
				josu -= 1

		return ans

	else:
		#modãä½¿ãã¨ã

		#åãã«æ¡ãè½ã¨ã
		kisu = myMod(kisu, primeNumMod_0)

		while josu > 0:

			if josu % 2 == 0:
				#ç´¯ä¹ãå¶æ°ã®æ

				kisu *= myMod(kisu, primeNumMod_0)
				josu = josu / 2

			else:
				#ç´¯ä¹ãå¥æ°ã®æ
				ans *= myMod(kisu, primeNumMod_0)
				josu -= 1

		return myMod(ans, primeNumMod_0)

def main():

	N = int(sys.stdin.readline())

	amari = N % 10
	sho = N / 10

	if amari == 9:
		print "Yes"
	elif sho == 9:
		print "Yes"
	else:
		print "No