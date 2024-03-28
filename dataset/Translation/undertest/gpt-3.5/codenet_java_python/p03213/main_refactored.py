class main:
    import math
    
    def factorization(n):
        factors = []
        tmp = n
        for i in range(2, int(math.sqrt(n))+1):
            if tmp % i == 0:
                cnt = 0
                while tmp % i == 0:
                    cnt += 1
                    tmp //= i
                factors.append([i, cnt])
        if tmp != 1:
            factors.append([tmp, 1])
        
        if len(factors) == 0:
            factors.append([n, 1])
        
        return factors
    
    def main():
        N = int(input())
        factors_map = {}
        for i in range(2, N+1):
            factors = factorization(i)
            for factor in factors:
                if factor[0] in factors_map:
                    factors_map[factor[0]] += factor[1]
                else:
                    factors_map[factor[0]] = factor[1
    
        values = list(factors_map.values())
        values.sort(reverse=True)
        ans = 0
        for val in values:
            if val >= 74:
                ans += 1
        for i in range(len(values)):
            if values[i] >= 24:
                for j in range(len(values)):
                    if i == j:
                        continue
                    if values[j] >= 2:
                        ans += 1
        for i in range(len(values)):
            if values[i] >= 14:
                for j in range(len(values)):
                    if i == j:
                        continue
                    if values[j] >= 4:
                        ans += 1
        for i in range(len(values)):
            if values[i] >= 4:
                for j in range(i+1, len(values)):
                    if values[j] >= 4:
                        for k in range(len(values)):
                            if i == k or j == k:
                                continue
                            if values[k] >= 2:
                                ans += 1
    
        print(ans)
    
    
    if __name__ == "__main__":
        main()