import sys

def complement_base(base):
    switch = {
        'A': 'T',
        'T': 'A',
        'C': 'G',
        'G': 'C'
    }
    return switch.get(base, "Invalid base")

if __name__ == "__main__":
    helix = sys.stdin.readline().strip()
    print(complement_base(helix))