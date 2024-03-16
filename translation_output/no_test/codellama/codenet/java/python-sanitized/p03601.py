import sys

def solve(sc):
    a, b, c, d, e, f = map(int, sc.readline().split())
    water_x = 0
    ans_water = 100
    ans_sugar = 0
    while 100 * a * water_x <= f:
        water_y = 0
        while 100 * a * water_x + 100 * b * water_y <= f:
            water = 100 * a * water_x + 100 * b * water_y
            sugar_x = 0
            while water + c * sugar_x <= f:
                sugar_y = 0
                while water + c * sugar_x + d * sugar_y <= f:
                    sugar = c * sugar_x + d * sugar_y
                    if sugar * (100 + e) <= e * (water + sugar):
                        if sugar * (ans_water + ans_sugar) >= ans_sugar * (water + sugar):
                            ans_water = water
                            ans_sugar = sugar
                    sugar_y += 1
                sugar_x += 1
            water_y += 1
        water_x += 1
    print(ans_water + ans_sugar, ans_sugar)

if __name__ == "__main__":
    solve(sys.stdin)