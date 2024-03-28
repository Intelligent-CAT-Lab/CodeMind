class main:
    from collections import deque
    
    def find_kth_number(k):
        queue = deque(range(1, 10))
        val = -1
    
        while k > 0:
            val = queue.popleft()
            last_digit = val % 10
    
            if last_digit != 0:
                queue.append(val * 10 + last_digit - 1)
            queue.append(val * 10 + last_digit)
            if last_digit != 9:
                queue.append(val * 10 + last_digit + 1)
    
            k -= 1
    
        return val
    
    if __name__ == '__main__':
        k = int(input())
        print(find_kth_number(k))