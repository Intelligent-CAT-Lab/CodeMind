
class URLHandler: 
    def __init__(self, url):
        """
        Initialize URLHandler's URL
        """
        self.url = url

    def get_path(self):
        scheme_end = self.url.find("://")
        if scheme_end != -1:
            url_without_scheme = self.url[scheme_end + 3:]
            host_end = url_without_scheme.find("/")
            if host_end != -1:
                return url_without_scheme[host_end:]
        return None