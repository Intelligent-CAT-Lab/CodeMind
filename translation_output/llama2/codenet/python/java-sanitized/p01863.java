> Translate the following python code to java and enclose your solution inside :

s = input()
length = len(s)
BASE = 100
MOD1 = 1000000007
MOD2 = 2147483647
acc1 = 0
acc2 = 0
hlst1 = [0]
hlst2 = [0]
for c in s:
  i = ord(c)
  acc1 = (acc1 * BASE + i) % MOD1
  acc2 = (acc2 * BASE + i) % MOD2
  hlst