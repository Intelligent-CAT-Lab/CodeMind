class main:
    import math
    
    def totient(n):
        i = n
        phi = n
        if i % 2 == 0:
            phi = phi / 2
            while i % 2 == 0:
                i /= 2
        if i % 3 == 0:
            phi = phi / 3 * 2
            while i % 3 == 0:
                i /= 3
        for j in range(1, int(math.sqrt(n))):
            tmp = j * 6 - 1
            if tmp * tmp > n:
                break
            if i % tmp == 0:
                phi = phi / tmp * (tmp - 1)
                while i % tmp == 0:
                    i /= tmp
            tmp = j * 6 + 1
            if tmp * tmp > n:
                break
            if i % tmp == 0:
                phi =