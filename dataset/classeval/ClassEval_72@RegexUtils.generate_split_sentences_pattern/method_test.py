def test(self):

        ru = RegexUtils()
        pat = ru.generate_split_sentences_pattern()
        res = ru.match(pat, '.Y')
        return res