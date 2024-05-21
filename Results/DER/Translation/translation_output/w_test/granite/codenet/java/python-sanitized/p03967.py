import sys

def main():
    top = sys.stdin.readline().strip()
    score = 0
    for i in range(len(top)):
        if i % 2 == 0:
            if top[i] == 'g':
                score += 1
        else:
            if top[i] == 'p':
                score -= 1
    print(score)

if __name__ == "__main__":
    main()