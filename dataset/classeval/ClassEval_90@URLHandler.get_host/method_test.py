def test(self):

        urlhandler = URLHandler("https://aaa.com/openai/human-eval")
        temp = urlhandler.get_host()
        return temp