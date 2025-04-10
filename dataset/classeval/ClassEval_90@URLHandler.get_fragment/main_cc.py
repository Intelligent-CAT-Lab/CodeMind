
class URLHandler: 
    def __init__(self, url):
        """
        Initialize URLHandler's URL
        """
        self.url = url

    def get_fragment(self):
        fragment_start = self.url.find("#")
        if fragment_start != -1:
            return self.url[fragment_start + 1:]
        return None