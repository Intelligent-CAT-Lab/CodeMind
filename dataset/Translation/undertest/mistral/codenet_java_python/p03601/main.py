import sys

def solve(a, b, c, d, e, f):
    waterX = 0
    ansWater = 100
    ansSugar = 0
    while 100*a*waterX <= f:
        waterY = 0
        while 100*a*waterX + 100*b*waterY <= f:
            water = 100*a*waterX + 100*b*waterY
            sugarX = 0
            while water + c*sugarX <= f:
                sugarY = 0
                while water + c*sugarX + d*sugarY <= f:
                    sugar = c*sugarX + d*sugarY
                    if sugar * (100 + e) <= e * (water + sugar):
                        if sugar * (ansWater + ansSugar) >= ansSugar * (water + sugar):
                            ansWater = water
                            ansSugar = sugar
            sugarX += 1
            sugarY += 1
        waterX += 1
    return ansWater + ansSugar, ansSugar

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    e = int(input())
    f = int(input())
    ansWater, ansSugar = solve(a, b, c, d, e, f)
    print(ansWater, ansSugar)