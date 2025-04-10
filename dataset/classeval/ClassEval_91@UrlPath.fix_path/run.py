import os
import unittest
import urllib.parse


class UrlPath:
    def __init__(self):
        self.segments = []
        self.with_end_tag = False

    def add(self, segment):
        self.segments.append(self.fix_path(segment))

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
class Test(unittest.TestCase):
    def test(self):
            fixed_path = UrlPath.fix_path('')
            return fixed_path
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_91@UrlPath.fix_path/output.txt', 'w') as wr:
    wr.write(str(a))
        