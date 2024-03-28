class main:
    import sys
    
    def is_rectangle(sides):
        sides.sort()
        if sides[0] == sides[1] and sides[2] == sides[3]:
            return "yes"
        else:
            return "no"
    
    if __name__ == "__main__":
        sides = list(map(int, sys.stdin.readline().split()))
        print(is_rectangle(sides))