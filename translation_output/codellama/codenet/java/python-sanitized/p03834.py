import sys

with open(sys.stdin, "r") as f:
    line = f.readline()
    print(line.replace(",", " "))