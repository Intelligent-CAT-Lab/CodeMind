text = "Transform quotations\"\nnot into numbers."
trans = str.maketrans('"\'><', '9833')
print(text.translate(trans))