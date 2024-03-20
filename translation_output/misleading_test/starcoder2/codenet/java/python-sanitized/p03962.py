import sys

def main():
    paintCans = set()
    for i in range(3):
        paintCans.add(int(sys.stdin.readline()))
    print(len(paintCans))

if __name__ == '__main__':
    main()