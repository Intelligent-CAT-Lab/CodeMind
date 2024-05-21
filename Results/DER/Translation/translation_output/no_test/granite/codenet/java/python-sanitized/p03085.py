import sys

def main():
    helix = sys.stdin.read().strip()
    switcher = {
        "A": "T",
        "T": "A",
        "C": "G",
        "G": "C",
    }
    print(switcher.get(helix, "Invalid helix"))

if __name__ == "__main__":
    main()