def f(text, suffix):
    output = text	## {"output" : '',"text" : ''}
    while text.endswith(suffix):	## {"text" : '',"suffix" : ''}
        output = text[:-len(suffix)]
        text = output
    return output	## {"output" : ''}
