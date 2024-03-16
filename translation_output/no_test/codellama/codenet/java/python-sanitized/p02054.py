import sys

def main():
    odd = 0
    for i in range(3):
        odd += int(sys.stdin.readline()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()