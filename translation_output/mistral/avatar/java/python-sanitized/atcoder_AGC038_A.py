import sys

def main():
    h, w, a, b = map(int, input().split())
    sb = ""
    for i in range(h):
        for j in range(w):
            x = 1 if j < a ^ i < b else 0
            sb += str(x)
        sb += "\n"
    print(sb)

if __name__ == "__main__":
    main()