def f(string, substring):
    while string.startswith(substring):	## string = [] | substring = []
        string = string[len(substring):len(string)]
    return string	## string = []
