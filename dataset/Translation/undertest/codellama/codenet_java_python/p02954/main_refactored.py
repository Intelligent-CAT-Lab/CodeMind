class main:
    import sys
    
    def main():
        S = sys.stdin.readline().strip()
        N = len(S)
        ans = [0] * N
        cur_index = 0
        while cur_index < N:
            num_left = 0
            num_right = 0
            while S[cur_index] == "R":
                num_right += 1
                cur_index += 1
                if cur_index == N:
                    break
            R = cur_index - 1
            while S[cur_index] == "L":
                num_left += 1
                cur_index += 1
                if cur_index == N:
                    break
            left = num_left
            right = num_right
            if (left + right) % 2 == 0:
                sum = left + right
                left = sum // 2
                right = sum // 2
            else:
                sum = left + right
                if right % 2 == 1:
                    right = sum // 2
                    left = sum - right
                else:
                    left = sum // 2
                    right = sum - left
            ans[R] = left
            ans[R + 1] = right
            if cur_index == N - 1:
                break
        for i in range(N):
            print(ans[i], end=" ")
    
    if __name__ == "__main__":
        main()