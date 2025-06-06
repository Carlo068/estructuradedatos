class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        suml1 = 0
        suml2 = 0
        i = 0
        current = l1
        while current:
            suml1 = suml1 + (current.val * 10 ** i)
            current = current.next
            i = i+1
        i = 0
        current = l2
        while current:
            suml2 = suml2 + (current.val * 10 ** i)
            current = current.next
            i = i+1
        tot = suml1 + suml2
        dummy = ListNode(0)
        current = dummy
        
        if tot == 0:
            return ListNode(0)
        
        while tot > 0:
            digit = tot % 10
            current.next = ListNode(digit)
            current = current.next
            tot //= 10
        
        return dummy.next