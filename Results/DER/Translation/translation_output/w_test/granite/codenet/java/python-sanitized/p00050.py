def translate_sentence(sentence):
    words = sentence.split()
    translated_words = []
    for word in words:
        if word == "apple":
            translated_words.append("peach")
        elif word == "peach":
            translated_words.append("apple")
        else:
            translated_words.append(word)
    return " ".join(translated_words)

test_input = "the cost of one peach is higher than that of one apple."
expected_output = "the cost of one apple is higher than that of one peach."

assert translate_sentence(test_input) == expected_output