def check_if_last_char_is_a_letter(txt):
 
    check = txt.split(' ')[-1]	## check = CLRJ|txt = CLRJ
    return True if len(check) == 1 and (97 <= ord(check.lower()) <= 122) else False	## check = CLRJ
