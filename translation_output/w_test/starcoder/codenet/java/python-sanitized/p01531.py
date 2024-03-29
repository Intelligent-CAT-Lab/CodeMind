import sys

in_ = [
    ['wa', 'nn', 'wo', '', ''],
    ['a', 'u', 'o', 'i', 'e'],
    ['ka', 'ku', 'ko', 'ki', 'ke'],
    ['sa','su','so','si','se'],
    ['ta', 'tu', 'to', 'ti', 'te'],
    ['na', 'nu', 'no', 'ni', 'ne'],
    ['ha', 'hu', 'ho', 'hi', 'he'],
    ['ma','mu','mo','mi','me'],
    ['ya', 'yu', 'yo', '', ''],
    ['ra', 'ru', 'ro', 'ri','re']
]

for line in sys.stdin:
    line = line.strip()
    if not line:
        break
    for i in range(0, len(line), 2):
        c = 0
        if line[i + 1] == 'T':
            c = 0
        elif line[i + 1] == 'L':
            c = 3
        elif line[i + 1] == 'U':
            c = 1
        elif line[i + 1] == 'R':
            c = 4
        elif line[i + 1] == 'D':
            c = 2
        print(in_[int(line[i]) - 1][c], end='')
    print()