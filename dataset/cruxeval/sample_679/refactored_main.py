text = 'meet'
if text == '':
    print(False)
else:
    first_char = text[0]
    if text[0].isdigit():
        print(False)
    else:
        for last_char in text:
            if (last_char != '_') and not last_char.isidentifier():
                print(False)
                break
        else:
            print(True)