class p03601:
    def solve(self, sc):
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()
        d = sc.nextInt()
        e = sc.nextInt()
        f = sc.nextInt()

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

        print(ansWater + ansSugar, ansSugar)


if __name__ == "__main__":
    try:
        sc = Scanner(System.in)
        p03601().solve(sc)
    finally:
        sc.close()