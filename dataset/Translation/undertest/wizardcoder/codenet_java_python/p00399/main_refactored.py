class main:
    import sys
    
    #PCK/Prelim:   0404:   Shiba Inu
    # http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
    class p00399:
    
        def main(self):
            result = 0
    
            with sys.stdin as f:
                numDog = f.readline().split()
    
                for i in range(len(numDog)):
                    result += int(numDog[i])
    
                print(result)
    
    if __name__ == '__main__':
        p00399().main()