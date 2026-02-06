
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.

public class LCC002 {
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
    ListNode temp=new ListNode(0);
    ListNode current=temp;
    int data=0;

    while(l1!=null || l2!=null||data!=0){

        int num1=(l1 != null)? l1.val : 0; //stores each value one by one 
        int num2=(l2 != null)? l2.val : 0;

        int sum = num1 + num2 + data;
        data=sum/10;

        current.next=new ListNode(sum%10);
        current=current.next;

        if(l1 != null)
            l1=l1.next;

        if(l2 != null)
            l2=l2.next;
    }
    return temp.next;
    }
}
}
