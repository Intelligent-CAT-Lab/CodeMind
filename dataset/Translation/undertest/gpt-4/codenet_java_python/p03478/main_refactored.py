class main:
    def calculate_sum(n):
        total_sum = 0
        while n > 0:
            total_sum += n % 10
            n //= 10
        return total_sum
    
    def main():
        inputs = input().split()
        N, A, B = map(int, inputs)
        ans = 0
        for i in range(1, N + 1):
            sum_of_digits = calculate_sum(i)
            if A <= sum_of_digits <= B:
                ans += i
        print(ans)
    
    if __name__ == "__main__":
        main()