def test(self):

        server = Server()
        flag = server.recv({"content": "abc"})
        return server.receive_struct,flag