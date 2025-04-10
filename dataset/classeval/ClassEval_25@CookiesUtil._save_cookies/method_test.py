def test(self):
        self.cookies_util = CookiesUtil('cookies.json')
        self.cookies_util.cookies = {'cookies': {'key1': 'value1', 'key2': 'value2'}}
        self.cookies_util.cookies = {'cookies': {'key1': 'value1', 'key2': 'value2'},
                                     'cookies2': {'key3': 'value3', 'key4': 'value4'}}
        return self.cookies_util._save_cookies()