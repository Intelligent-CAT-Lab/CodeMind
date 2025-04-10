def test(self):

        manacher = Manacher('ababaxse')
        return manacher.palindromic_length(2, 1, 'a|b|a|b|a|x|s|e')