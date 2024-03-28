import sys

def debtHell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += (int)(yield /1000 + 1) *1000
    print(sum)

if __name__ == '__main__':
    debtHell(100000, int(sys.stdin.readline()))