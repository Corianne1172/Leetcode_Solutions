# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: ListNode | None) -> ListNode | None:
        list_length = 0
        current = head
        
        while current is not None:
            list_length += 1
            current = current.next
        
        middle_node = list_length // 2

        current = head
        node_count = 0

        if current and node_count == middle_node:
            head = current.next
            return None

        prev = None
        while current and node_count != middle_node:
            prev = current
            current = current.next
            node_count += 1
        
        prev.next = current.next

        return head



