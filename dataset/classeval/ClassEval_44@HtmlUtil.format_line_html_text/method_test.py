def test(self):

        htmlutil = HtmlUtil()
        res = htmlutil.format_line_html_text('''<p>Some sentence here.</p>''')
        return res