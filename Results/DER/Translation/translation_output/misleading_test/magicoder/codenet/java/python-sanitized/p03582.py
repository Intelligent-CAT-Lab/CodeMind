def solve():
    a = list(map(int, input().split()))
    list_ = []
    for j in range(3):
        for i in range(a[j]):
            list_.append(chr(ord('a') + j))

    while len(list_) > 1:
        list_.sort()
        last = len(list_) - 1
        s = list_[0] + list_[last]
        list_[0] = s
        list_.pop(last)
    print(''.join(list_))

solve()