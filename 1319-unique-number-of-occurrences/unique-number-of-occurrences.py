class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        number_counts = Counter(arr)
        value_set = set(number_counts.values())
        return len(number_counts) == len(value_set)