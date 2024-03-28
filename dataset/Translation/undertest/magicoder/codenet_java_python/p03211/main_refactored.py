class main:
    def min_difference(S):
        min_diff = 1000
        for i in range(len(S) - 2):
            X = int(S[i:i+3])
            min_diff = min(min_diff, abs(X - 753))
        return min_diff
    
    S = input()
    print(min_difference(S))