def test(self):

        ru = RegexUtils()
        pat = ru.generate_email_pattern()
        res = ru.match(pat, 'iustd87t2euh@163.com')
        return res