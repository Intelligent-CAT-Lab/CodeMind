class main:
    def main():
        # Read integers from input
        N, A, B = map(int, input().split())
        # Print the minimum of A and B, and the maximum of 0 and A+B-N
        print(min(A, B), max(0, A + B - N))
    
    if __name__ == "__main__":
        main()