while True:
    try:
        str_input = input()
        str_input = str_input.replace('.', ',')
        str_input = str_input.replace(',', ' ')
        tokens = str_input.split(" ")
        count = 0
        output_tokens = []

        for token in tokens:
            n = len(token)

            if 3 <= n <= 6:
                output_tokens.append(token)
                count += 1

        if count > 0:
            print(" ".join(output_tokens))
    except EOFError:
        break