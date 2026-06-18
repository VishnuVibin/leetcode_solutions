/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        if(head==null){
            return true;
        }
        else{
            while(head!=null){
                list.add(head.val);
                head=head.next;
            }
        }
        List<Integer> reversed=list.reversed();
        if(list.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }
}