class main:
    import sys
    
    def main():
        n = int(sys.stdin.readline())
        if n == 1:
            print("Yes")
            print(2)
            print("1 1")
            print("1 1")
            return
        if n == 2:
            print("No")
            return
    
        k = 0
        for i in range(3, n+1):
            ic2 = i * (i - 1) // 2
            if ic2 == n:
                k = i
                break
            elif ic2 > n:
                print("No")
                return
    
        print("Yes")
    
        ansList = []
        target = [i for i in range(k)]
        for i in range(k):
            ansList.append([])
            target[i] = i
    
        combination(target, 2, [])
    
        print(k)
        for i in range(k):
            sb = ""
            sb += str(k-1) + " "
            list = ansList[i]
            for j in list:
                sb += str(j) + " "
            sb = sb[:-1]
            print(sb)
    
    def combination(target, k, list):
        if len(list) == k:
            v += 1
            for i in list:
                ansList[i].append(v)
            return
    
        i = 0
        if len(list) > 0:
            i = list[-1] + 1
            if len(list) + len(target) - i < k:
                return
    
        for i in range(i, len(target)):
            list.append(i)
            combination(target, k, list)
            list.pop()
    
    if __name__ == "__main__":
        main()