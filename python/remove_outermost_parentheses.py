class Solution:
    def removeOuterParentheses(self, S: str) -> str:
        level = 0
        output = ''
        for c in S:
            if c == '(':
                level += 1
                if level != 1:
                    output += c
            if c == ')':
                level -= 1
                if level != 0:
                    output += c
        return output
