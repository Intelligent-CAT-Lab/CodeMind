class main:
    import java.util.ArrayDeque
    import java.util.Scanner
    
    def main():
        sc = Scanner(System.in)
        while sc.hasNext():
            N = sc.nextInt()
            x = sc.nextInt()
            if x == 1 or x == 2 * N - 1:
                print("No")
                break
            print("Yes")
            low = x - 1
            high = x + 1
            deq = ArrayDeque()
            deq.add(x)
            while low!= 0 or high!= 2 * N:
                if low == 0:
                    deq.push(high)
                    deq.add(high + 1)
                    high += 2
                elif high == 2 * N:
                    deq.add(low)
                    deq.push(low - 1)
                    low -= 2
                else:
                    deq.push(low)
                    low -= 1
                    deq.add(high)
                    high += 1
            for s in deq:
                print(s)
    
    if __name__ == '__main__':
        main()