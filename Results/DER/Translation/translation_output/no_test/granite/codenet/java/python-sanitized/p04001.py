import sys

S = sys.stdin.readline().strip()
if len(S) == 1:
    print(S)
    sys.exit(0)
N = [int(c) for c in S]

pattern_count = 1
tmp_bit = ""
for i in range(len(N)):
    pattern_count *= 2
    tmp_bit += "1"

sum = 0
for i in range(pattern_count):
    bin = bin(i)[2:]
    while len(bin) < len(tmp_bit):
        bin = "0" + bin
    add = str(N[0])
    for j in range(len(bin)):
        if bin[j] == "1":
            sum += int(add)
            add = ""
        add += str(N[j + 1])
    if add:
        sum += int(add)

print(sum)