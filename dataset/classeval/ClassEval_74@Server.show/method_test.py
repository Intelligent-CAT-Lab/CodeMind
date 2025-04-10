def test(self):

        server = Server()
        server.add_white_list(66)
        server.send({"addr": 22, "content": "abc"})
        server.recv({"addr": 66, "content": "ABC"})
        return server.show('send')