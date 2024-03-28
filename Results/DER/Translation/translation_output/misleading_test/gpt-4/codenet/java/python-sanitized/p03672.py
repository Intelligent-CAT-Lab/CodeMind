def find_max_length(text):
    answer = ""

    for i in range(len(text), 1, -2):
        S = text[0:i]

        s1 = S[:len(S)//2]
        s2 = S[len(S)//2:]

        if s1 == s2 and len(S) != len(text):
            answer = S
            break

    return len(answer)


# Test input example
input_string = "abaababaab"
print(find_max_length(input_string))