class Solution:
    def buddyStrings(self, A: str, B: str) -> bool:
        if len(A) != len(B):
            return False
        a_new = ''
        b_new = ''
        for i in range(len(A)):
            if A[i] != B[i]:
                a_new += A[i]
                b_new += B[i]
        if a_new == '':
            return len(list(A)) != len(set(A)) # if contains duplicated chars
        if len(a_new) > 3:
            return False
        return a_new == b_new[::-1]
        
