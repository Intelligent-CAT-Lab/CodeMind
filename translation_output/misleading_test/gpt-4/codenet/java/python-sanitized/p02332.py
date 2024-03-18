class Combinatorics:
    mod = 1000000007
    
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] * (n + 1)
        self.finv = [1] * (n + 1)
        
        self.fact[0] = self.fact[1] = 1
        self.inv[0] = self.inv[1] = 1
        self.finv[0] = self.finv[1] = 1
        
        for i in range(2, n + 1):
            self.fact[i] = self.fact[i - 1] * i % self.mod
            self.inv[i] = self.mod - self.inv[self.mod % i] * (self.mod // i) % self.mod
            self.finv[i] = self.finv[i - 1] * self.inv[i] % self.mod
    
    def permutation(self, n, r):
        if n < r or r < 0:
            return 0
        return (self.fact[n] * self.finv[n - r]) % self.mod


def main():
    nk = input()  # nk is a str
    n, k = map(int, nk.split())  # Convert the str to two ints
    
    combinatorics = Combinatorics(k)
    print(combinatorics.permutation(k, n))


if __name__ == "__main__":
    main()