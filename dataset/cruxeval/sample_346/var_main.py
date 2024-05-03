def f(filename):
    suffix = filename.split('.')[-1]	## {"suffix" : '',"filename" : ''}
    f2 = filename + suffix[::-1]	## {"f2" : '',"filename" : '',"suffix" : ''}
    return f2.endswith(suffix)	## {"f2" : '',"suffix" : ''}
