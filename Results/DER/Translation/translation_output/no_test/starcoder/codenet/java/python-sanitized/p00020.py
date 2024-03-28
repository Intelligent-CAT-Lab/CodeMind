import sys

for line in sys.stdin:
    line = line.strip()
    print(line.translate(str.maketrans('abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')))