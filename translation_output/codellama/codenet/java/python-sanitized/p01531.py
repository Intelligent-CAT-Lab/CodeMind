import sys

in = [
    ["wa", "nn", "wo", "", ""],
    ["a", "u", "o", "i", "e"],
    ["ka", "ku", "ko", "ki", "ke"],
    ["sa", "su", "so", "si", "se"],
    ["ta", "tu", "to", "ti", "te"],
    ["na", "nu", "no", "ni", "ne"],
    ["ha", "hu", "ho", "hi", "he"],
    ["ma", "mu", "mo", "mi", "me"],
    ["ya", "yu", "yo", "", ""],
    ["ra", "ru", "ro", "ri", "re"]
]

while True:
    line = sys.stdin.readline()
    if not line:
        break
    for i in range(0, len(line), 2):
        c = 0
        switch = line[i + 1]
        if switch == "T":
            c = 0
        elif switch == "L":
            c = 3
        elif switch == "U":
            c = 1
        elif switch == "R":
            c = 4
        elif switch == "D":
            c = 2
        print(in[ord(line[i]) - ord("0")][c], end="")
    print()