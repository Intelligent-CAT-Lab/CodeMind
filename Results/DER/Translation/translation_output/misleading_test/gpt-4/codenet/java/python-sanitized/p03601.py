def solve(a, b, c, d, e, f):
    waterX = 0
    ansWater = 100
    ansSugar = 0
    
    while 100 * a * waterX <= f:
        waterY = 0
        while 100 * a * waterX + 100 * b * waterY <= f:
            water = 100 * a * waterX + 100 * b * waterY
            sugarX = 0
            while water + c * sugarX <= f:
                sugarY = 0
                while water + c * sugarX + d * sugarY <= f:
                    sugar = c * sugarX + d * sugarY
                    if sugar * (100 + e) <= e * (water + sugar):
                        if sugar * (ansWater + ansSugar) >= ansSugar * (water + sugar):
                            ansWater = water
                            ansSugar = sugar
                    sugarY += 1
                sugarX += 1
            waterY += 1
        waterX += 1
    
    return ansWater + ansSugar, ansSugar

# Sample test case
input_str = "1 2 10 20 15 200"
a, b, c, d, e, f = map(int, input_str.split())
total, sugar = solve(a, b, c, d, e, f)
print(total, sugar)

# Expected output: 107 8