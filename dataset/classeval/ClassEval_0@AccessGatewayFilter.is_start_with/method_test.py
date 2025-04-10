def test(self):

        agf = AccessGatewayFilter()
        request_uri = '/def/data'
        res = agf.is_start_with(request_uri)
        return res