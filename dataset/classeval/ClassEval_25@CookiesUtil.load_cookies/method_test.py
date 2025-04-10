def test(self):

        self.cookies_util = CookiesUtil('cookies.json')
        self.cookies_util.cookies = {'cookies': {'key1': 'value1', 'key2': 'value2'}}
        return self.cookies_util.load_cookies()