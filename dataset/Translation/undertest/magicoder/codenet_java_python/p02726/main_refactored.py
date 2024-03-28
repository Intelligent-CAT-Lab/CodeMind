class main:
    import sys
    
    def main():
        n, x, y = map(int, sys.stdin.readline().split())
        x -= 1
        y -= 1
        edges = [0] * n
        for i in range(n):
            for j in range(i+1, n):
                edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))+1)
                edges[edge] += 1
        for i in range(1, n):
            print(edges[i])
    
    if __name__ == "__main__":
        main()