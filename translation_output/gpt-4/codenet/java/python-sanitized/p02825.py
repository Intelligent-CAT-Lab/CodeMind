class ModInt:
    def __init__(self, mod, value=0):
        self.mod = mod
        self.value = value
    
    def add(self, other):
        result = (self.value + other) % self.mod
        return ModInt(self.mod, result)
    
    def sub(self, other):
        result = (self.value - other) % self.mod
        return ModInt(self.mod, result)
    
    def mul(self, other):
        result = (self.value * other) % self.mod
        return ModInt(self.mod, result)
    
    def inv(self):
        result = pow(self.value, self.mod - 2, self.mod)
        return ModInt(self.mod, result)
    
    def div(self, other):
        return self.mul(other.inv())
    
    def __str__(self):
        return str(self.value)

class AGC041CProblem:
    def __init__(self, mod):
        self.mod = mod
    
    def solve(self, N):
        if N == 2:
            return [-1]
        elif N == 3:
            return ["aab", "b.b", "baa"]
        elif N == 5:
            return ["aabba", "bc..a", "bc..b", "a.ccb", "abbaa"]
        # ...
        # Continue with the rest of the implementation