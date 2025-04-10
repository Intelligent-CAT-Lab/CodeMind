def test(self):

        url_path = UrlPath()
        url_path.parse('/foo/bar/', 'utf-8')
        return url_path.segments,url_path.with_end_tag