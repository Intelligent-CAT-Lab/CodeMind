import sys

def complement(helix):
    if helix == "A":
        return "T"
    elif helix == "T":
        return "A"
    elif helix == "C":
        return "G"
    elif helix == "G":
        return "C"

helix = sys.stdin.readline().strip()
print(complement(helix))