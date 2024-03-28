class main:
    from collections import defaultdict
    
    class Point:
        def __init__(self, x, y):
            self.x = x
            self.y = y
        
        def equals(self, other):
            return self.x == other.x and self.y == other.y
    
    EPS = 1e-10
    DX = [-1, -1, -1, 0, 0, 0, 1, 1, 1]
    DY = [-1, 0, 1, -1, 0, 1, -1, 0, 1]
    
    def out_of_bounds(x, y, width, height):
        return x < 0 or y < 0 or x >= width or y >= height
    
    def solve(S, count, size, points, pow10, memo, bomb, map, h, w):
        p = S % 100
        if S in memo:
            return memo[S]
        if p == size:
            if S // 100 == 0:
                return 0
            return INF
        
        if count == 9:
            if S // pow10[p] % 10 == 0:
                result = solve(S+1, 0, size, points, pow10, memo, bomb, map, h, w)
                memo[S] = result
                return result
            else:
                return INF
        
        minimum = solve(S, count+1, size, points, pow10, memo, bomb, map, h, w)
        x = points[p].x + DX[count]
        y = points[p].y + DY[count]
        
        if out_of_bounds(x, y, w, h) or bomb[y][x] or map[y][x] < 0:
            return minimum
        
        next_S = S
        bomb[y][x] = True
        has_error = False
        
        for i in range(size):
            for j in range(9):
                tx = x + DX[j]
                ty = y + DY[j]
                if out_of_bounds(tx, ty, w, h):
                    continue
                target = Point(tx, ty)
                if not points[i].equals(target):
                    continue
                if next_S // pow10[i] % 10 > 0:
                    next_S -= pow10[i]
                else:
                    has_error = True
        
        if not has_error:
            minimum = min(minimum, solve(next_S, count+1, size, points, pow10, memo, bomb, map, h, w) + 1)
        
        bomb[y][x] = False
        return minimum
    
    def main():
        while True:
            h, w = map(int, input().split())
            if h == 0 and w == 0:
                break
            
            map_data = []
            bomb = [[False] * w for _ in range(h)]
            points = []
            for i in range(h):
                line = input()
                row = []
                for j, char in enumerate(line):
                    if char == '.':
                        row.append(-1)
                    elif char == '*':
                        row.append(0)
                    else:
                        num = int(char)
                        row.append(num)
                        points.append(Point(j, i))
                map_data.append(row)
            
            size = len(points)
            memo = defaultdict(int)
            pow10 = [100]
            S = pow10[0] * map_data[points[0].y][points[0].x]
            for i in range(1, size):
                pow10.append(pow10[i-1] * 10)
                S += pow10[i] * map_data[points[i].y][points[i].x]
            
            print(solve(S, 0, size, points, pow10, memo, bomb, map_data, h, w))
    
    if __name__ == '__main__':
        main()