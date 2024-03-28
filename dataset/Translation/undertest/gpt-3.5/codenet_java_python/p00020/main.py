import sys

for line in sys.stdin:
    if line.strip() == "":
        break
    print(line.upper(), end="")