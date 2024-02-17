n = int(input())
nl = [str(i) for i in range(1, n+1)]
def perm(nl):

    if len(nl) == 0:
        return []

    if len(nl) == 1:
        return [nl]

    l = []

    for i in range(len(nl)):

        m = nl[i]

        rest = nl[:i] + nl[i+1:]

        for p in perm(rest):
            l.append([m] + p)


    return l



for i in perm(nl):
    print(" ".join(i))
