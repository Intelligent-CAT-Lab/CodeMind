def test(self):

        encryption_utils = EncryptionUtils("longkey")
        return encryption_utils.rail_fence_cipher('AbCdEfG', 2)