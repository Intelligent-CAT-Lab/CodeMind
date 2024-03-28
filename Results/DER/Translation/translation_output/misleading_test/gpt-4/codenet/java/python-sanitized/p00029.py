def find_most_frequent_and_longest_word():
    words = input().split()
    word_counts = {}
    for word in words:
        word_counts[word] = word_counts.get(word, 0) + 1
    most_frequent_word = max(word_counts.keys(), key=lambda k: word_counts[k])
    longest_word = max(words, key=len)
    
    print(most_frequent_word)
    print(longest_word)

find_most_frequent_and_longest_word()