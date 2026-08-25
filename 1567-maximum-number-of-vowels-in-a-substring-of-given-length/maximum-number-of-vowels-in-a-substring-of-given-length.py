class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = ['a', 'e', 'i', 'o', 'u']
        current_num = 0
        for i in range (k):
            if s[i] in vowels:
                current_num+=1

        max_vowels = current_num

        for i in range (k, len(s)):
            if s[i] in vowels:
                current_num +=1
            if s[i-k] in vowels:
                current_num -=1
            max_vowels = max (max_vowels, current_num)

        return max_vowels