import sys

def atcoder_ABC170_A():
    count = [0]*5
    for i in range(5):
        x = int(sys.stdin.readline().strip())
        count[i] += x
        if count[i] == 0:
            ans = i
    print(ans + 1)

atcoder_ABC170_A()