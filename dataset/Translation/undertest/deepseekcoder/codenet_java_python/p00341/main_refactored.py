class main:
    from collections import Counter
    
    def check_sequence(seq):
        count_elements = Counter(seq)
        if len(count_elements) > 3:
            return "no"
        counts = list(count_elements.values())
        if all(count % 3 == 0 for count in counts):
            return "yes"
        else:
            return "no"
    
    test_input = list(map(int, input().split()))
    print(check_sequence(test_input))