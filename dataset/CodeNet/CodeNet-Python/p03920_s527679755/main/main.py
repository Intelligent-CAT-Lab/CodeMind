def getN():
    return int(eval(input()))
def getNM():
    return list(map(int, input().split()))
def getList():
    return list(map(int, input().split()))

N = getN()
for i in range(10**4):
    if i*(i+1)/2 >= N:
        M = i
        upper =int(M*(M+1)/2)
        break
tar = []
diff = upper-N
for i in range(M):
    j = i+1
    if j != diff:
        #tar.append(j)
        print(j)
"""
print(sum(tar),M,upper,diff)
if 1628 in tar:
    print("TRue")
"""