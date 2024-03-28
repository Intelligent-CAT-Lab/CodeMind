def count_characters_frequency():
    res = [0] * 26
      
    while True:
        try:
            str_input = input()
            for char in str_input:
                if ord('A') <= ord(char) <= ord('Z'):
                    res[ord(char) - ord('A')] += 1
                elif ord('a') <= ord(char) <= ord('z'):
                    res[ord(char) - ord('a')] += 1
        except EOFError:
            break
        
    for i in range(26):
        print(chr(i + ord('a')) + " : " + str(res[i]))

count_characters_frequency()