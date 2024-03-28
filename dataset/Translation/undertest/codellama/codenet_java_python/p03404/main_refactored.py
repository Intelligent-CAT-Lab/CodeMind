class main:
    import sys
    
    def main():
        a, b = map(int, sys.stdin.readline().split())
        grid = [['#' for _ in range(99)] for _ in range(98)]
        for i in range(98):
            if i < 49:
                grid[i][:] = ['#' for _ in range(99)]
            else:
                grid[i][:] = ['.' for _ in range(99)]
        for i in range(a):
            grid[i // 49 * 2 + 1][i % 49 * 2 + 1] = '.'
        for i in range(b):
            grid[i // 49 * 2 + 50][i % 49 * 2 + 1] = '#'
        print("98 99")
        for row in grid:
            print("".join(row))
    
    if __name__ == "__main__":
        main()
    
    
    Next, the code iterates over the rows of `grid` and sets the element at the index `i // 49 * 2 + 1` and `i % 49 * 2 + 1` to `'.'` for each row `i` in the range `0` to `a - 1`. This is equivalent to the Java code `grid[i / 49 * 2 + 1][i % 49 * 2 + 1] = '.';` for each row `i` in the range `0` to `a - 1`.
    
    After that, the code iterates over the rows of `grid` and sets the element at the index `i // 49 * 2 + 50` and `i % 49 * 2 + 1` to `'#'` for each row `i` in the range `0` to `b - 1`. This is equivalent to the Java code `grid[i / 49 * 2 + 50][i % 49 * 2 + 1] = '#';` for each row `i` in the range `0` to `b - 1`.