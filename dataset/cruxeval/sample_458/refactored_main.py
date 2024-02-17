text = 'mmm34mIm'
search_chars = 'mm3'
replace_chars = ',po'
trans_table = str.maketrans(search_chars, replace_chars)
print(text.translate(trans_table))