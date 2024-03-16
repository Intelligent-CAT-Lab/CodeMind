import sys

def solve(k):
    dptable = [[0] * 8 for _ in range(601)]
    dptable[0][0] = 1
    for i in range(1, 601):
        dptable[i][0] = 1
        for j in range(1, 8):
            dptable[i][j] = dptable[i - 1][j] + dptable[i][j - 1]
    
    countC = [0] * 601
    for i in range(600, 0, -1):
        while k >= dptable[i][7]:
            countC[i] += 1
            k -= dptable[i][7]
    
    result = []
    for i in range(1, 601):
        result.append("FESTIVA")
        result.append("L" * countC[i])
    
    return ''.join(result)

def execute(reader):
    k = int(reader())
    return solve(k)

def main():
    reader = sys.stdin.readline
    print(execute(reader))

if __name__ == '__main__':
    main()