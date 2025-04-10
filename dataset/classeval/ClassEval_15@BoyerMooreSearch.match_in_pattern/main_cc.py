
class BoyerMooreSearch: 
    def __init__(self, text, pattern):
        """
        Initializes the BoyerMooreSearch class with the given text and pattern.
        :param text: The text to be searched, str.
        :param pattern: The pattern to be searched for, str.
        """
        self.text, self.pattern = text, pattern
        self.textLen, self.patLen = len(text), len(pattern)

    def match_in_pattern(self, char):
        for i in range(self.patLen - 1, -1, -1):
            if char == self.pattern[i]:
                return i
        return -1