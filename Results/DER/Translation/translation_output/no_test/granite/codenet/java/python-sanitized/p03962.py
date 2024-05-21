import sys

def main():
    paintCans = set()
    for color in sys.stdin.read().split():
        paintCans.add(int(color))
    print(len(paintCans))

if __name__ == '__main__':
    main()