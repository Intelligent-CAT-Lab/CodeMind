class main:
    import sys
    
    def main():
        s = input()
        ch = list(s)
        co = [[0, 0], [0, 0]]
        x, y = 0, 0
        k = 0
        for i in range(len(s)):
            if ch[i] == 'L':
                x -= 1
            elif ch[i] == 'R':
                x += 1
            elif ch[i] == 'U':
                y += 1
            elif ch[i] == 'D':
                y -= 1
            co[0][k] = x
            co[1][k] = y
            k += 1
    
        for i in range(k - 3):
            for j in range(i + 3, k):
                dx = co[0][i] - co[0][j]
                dy = co[1][i] - co[1][j]
                if dx < 0:
                    dx *= -1
                if dy < 0:
                    dy *= -1
                if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
                    flag = False
                    break
    
        if flag:
            print("OK")
        else:
            print("BUG")
    
    if __name__ == "__main__":
        main()