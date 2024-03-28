class main:
    import math
    
    def run():
        pnum = int(input())
        print(count(pnum))
    
    def count(pnum):
        result = 0
        i = 0
        while math.pow(2, i) <= pnum:
            result = int(math.pow(2, i))
            i += 1
        return result
    
    if __name__ == "__main__":
        run()