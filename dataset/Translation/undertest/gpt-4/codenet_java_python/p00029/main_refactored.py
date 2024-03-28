class main:
    from collections import Counter
    
    # Read input until EOF is reached
    s = input().split()
    
    # Count the frequency of each word
    frequency = Counter(s)
    # Find the word with the maximum frequency
    max_freq_word = max(frequency, key=frequency.get)
    
    # Find the longest word
    longest_word = max(s, key=len)
    
    print(max_freq_word, longest_word)