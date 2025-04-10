def test(self):

        server = Server()
        flag = server.send({"content": "abc"})
        return flag