def solve(a, b, c, d, e, f):
    ansWater = 0
    ansSugar = 0
    max_concentration = 0

    for waterX in range(f // (100 * a) + 1):
        for waterY in range((f - 100*a*waterX) // (100 * b) + 1):
            water = 100 * a * waterX + 100 * b * waterY
            for sugarX in range(f // c + 1):
                for sugarY in range((f - c*sugarX) // d + 1):
                    sugar = c * sugarX + d * sugarY
                    if sugar <= (water * e) // 100:
                        concentration = 100 * sugar // (water + sugar)
                        if concentration >= max_concentration:
                            ansWater = water
                            ansSugar = sugar
                            max_concentration = concentration

    print(ansWater + ansSugar, ansSugar)

# Test input
input_str = "1 2 10 20 15 200"
inputs = list(map(int, input_str.strip().split()))

# Call the solve function with the test input
solve(*inputs)