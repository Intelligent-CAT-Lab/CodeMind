class main:
    def distribute_children(formation):
        N = len(formation)
        ans = [0] * N
        cur_index = 0
    
        while cur_index < N:
            num_left = 0
            num_right = 0
            while cur_index < N and formation[cur_index] == 'R':
                num_right += 1
                cur_index += 1
    
            R = cur_index - 1
    
            while cur_index < N and formation[cur_index] == 'L':
                num_left += 1
                cur_index += 1
    
            if (num_left + num_right) % 2 == 0:
                left = right = (num_left + num_right) // 2
            else:
                sum = num_left + num_right
                if num_right % 2 == 1:
                    right = sum // 2
                    left = sum - right
                else:
                    left = sum // 2
                    right = sum - left
    
            ans[R] = left
            ans[R + 1] = right
    
            if cur_index == N - 1:
                break
    
        return ans
    
    
    # Sample Test Case
    input_formation = "RRLRL"
    output = distribute_children(input_formation)
    print(*output)