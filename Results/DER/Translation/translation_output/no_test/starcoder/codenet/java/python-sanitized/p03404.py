import sys

def main():
    a = int(sys.stdin.readline()) - 1
    b = int(sys.stdin.readline()) - 1
    grid = [['#' for i in range(99)] for j in range(98)]
    for i in range(a):
        grid[i / 49 * 2 + 1][i % 49 * 2 + 1] = '.'
    for i in range(b):
        grid[i / 49 * 2 + 50][i % 49 * 2 + 1] = '#'
    print('98 99')
    for i in grid:
        print(''.join(i))

if __name__ == '__main__':
    main()