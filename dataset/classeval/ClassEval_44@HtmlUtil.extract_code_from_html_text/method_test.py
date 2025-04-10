def test(self):

        htmlutil = HtmlUtil()
        res = htmlutil.extract_code_from_html_text('''
                <html>
                <body>
                <h1>Title</h1>
                <p>This is a paragraph.</p>
                <pre>print('Hello, world!')</pre>
                <p>Another paragraph.</p>
                <pre><code>for i in range(2):
                print(i)</code></pre>
                </body>
                </html>
                ''')
        return res