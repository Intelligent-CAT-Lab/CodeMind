import urllib.parse
class UrlPath: 
    def __init__(self):
        """
        Initializes the UrlPath object with an empty list of segments and a flag indicating the presence of an end tag.
        """
        self.segments = []
        self.with_end_tag = False

    def parse(self, path, charset):
        if path:
            if path.endswith('/'):
                self.with_end_tag = True

            path = self.fix_path(path)
            if path:
                split = path.split('/')
                for seg in split:
                    decoded_seg = urllib.parse.unquote(seg, encoding=charset)
                    self.segments.append(decoded_seg)
    @staticmethod
    def fix_path(path):
        if not path:
            return ''

        segment_str = path.strip('/')
        return segment_str