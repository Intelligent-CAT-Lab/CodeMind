import unittest
import json

class CookiesUtil:
    def __init__(self, cookies_file):
        self.cookies_file = cookies_file
        self.cookies = None

    def get_cookies(self, reponse):
        self.cookies = reponse['cookies']
        self._save_cookies()

    def load_cookies(self):
        try:
            with open(self.cookies_file, 'r') as file:
                cookies_data = json.load(file)
                return cookies_data
        except FileNotFoundError:
            return {}

    def _save_cookies(self):
        try:
            with open(self.cookies_file, 'w') as file:
                json.dump(self.cookies, file)
            return True
        except:
            return False

    def set_cookies(self, request):
        request['cookies'] = '; '.join([f'{key}={value}' for key, value in self.cookies.items()])
class Test(unittest.TestCase):
    def test(self):
            self.cookies_util = CookiesUtil('cookies.json')
            self.cookies_util.cookies = {'cookies': {'key1': 'value1', 'key2': 'value2'}}
            return self.cookies_util.load_cookies()