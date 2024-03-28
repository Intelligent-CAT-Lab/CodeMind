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

def run():
    while True:
        line = sys.stdin.readline()
        if not line:
            break
        fl = list(line)
        for i in range(0, len(fl), 2):
            c = 0
            switch = fl[i + 1]
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
            else:
                break
            print(in[fl[i] - "0"][c], end="")
        print()

if __name__ == "__main__":
    run()