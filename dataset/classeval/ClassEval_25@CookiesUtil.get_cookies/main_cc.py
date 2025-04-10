import json
class CookiesUtil: 
    def __init__(self, cookies_file):
        """
        Initializes the CookiesUtil with the specified cookies file.
        :param cookies_file: The cookies file to use, str.
        """
        self.cookies_file = cookies_file
        self.cookies = None

    def get_cookies(self, reponse):
        self.cookies = reponse['cookies']
        self._save_cookies()
    def _save_cookies(self):
        try:
            with open(self.cookies_file, 'w') as file:
                json.dump(self.cookies, file)
            return True
        except:
            return False