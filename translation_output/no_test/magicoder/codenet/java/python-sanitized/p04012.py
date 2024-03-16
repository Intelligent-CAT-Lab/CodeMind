import sys

def main():
    w = sys.stdin.readline().strip()
    c = list(w)
    a = 'a'
    acha = ord(a)
    a = 'z'
    zcha = ord(a)
    count = 0
    for i in range(acha, zcha + 1):
        for x in c:
            if x == chr(i):
                count += 1
        if count % 2 == 1:
            print("No")
            return
        count = 0
    print("Yes")

if __name__ == "__main__":
    main()