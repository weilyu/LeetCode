class Solution:

    def get_val(self, num: int) -> int:
        if num < -2 ** 31 or num > 2 ** 31 - 1:
            return 0
        return num

    def reverse(self, x: int) -> int:
        string = str(abs(x))[::-1]
        if x > 0:
            return self.get_val(int(string))
        return self.get_val(0 - int(string))
        
