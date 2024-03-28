class main:
    def count_possible_ways(k, s):
        # search
        count = 0
        for x in range(0, k + 1):
            for y in range(0, k + 1):
                z = s - x - y
                if 0 <= z <= k:
                    count += 1
        return count
    
    # input
    k, s = map(int, input().split())
    
    # answer
    print(count_possible_ways(k, s))