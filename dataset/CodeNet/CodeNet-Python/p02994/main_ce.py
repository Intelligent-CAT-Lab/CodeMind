def resolve():
    (N, L) = list(map(int, "5 2".split(" ")))
    Ts = []
    offset = L - 1
    absmin = float('inf')
    mini = float('inf')
    for i in range(1, N+1):
        Ts.append(i+offset)
        if abs(i + offset) < absmin:
            absmin = abs(i + offset)
            mini = i + offset
    print(sum(Ts)-mini)
if '__main__' == __name__:
    resolve()