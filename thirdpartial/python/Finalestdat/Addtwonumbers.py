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
    
class Solution2:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)
        current = dummy
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0
            total = val1 + val2 + carry
            carry = total // 10
            current.next = ListNode(total % 10)
            current = current.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return dummy.next