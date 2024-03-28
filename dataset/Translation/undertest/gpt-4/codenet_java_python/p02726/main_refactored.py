class main:
    import sys
    from collections import defaultdict
    
    def main():
        inputs = list(map(int, input().split()))
        n, x, y = inputs[0], inputs[1]-1, inputs[2]-1
        edges = defaultdict(int)
        
        for i in range(n):
            for j in range(i+1, n):
                edge = min(j-i, min(abs(x-i)+abs(j-y), abs(y-i)+abs(j-x))+1)
                edges[edge] += 1
                
        for i in range(1, n):
            print(edges[i])
    
    if __name__ == "__main__":
        main()