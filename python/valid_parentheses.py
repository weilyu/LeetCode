class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c in '({[':
                stack.append(c)
            else:
                if not stack:
                    return False
                last = stack.pop()
                if last + c not in ['()', '[]', '{}']:
                    return False
        return not stack
        