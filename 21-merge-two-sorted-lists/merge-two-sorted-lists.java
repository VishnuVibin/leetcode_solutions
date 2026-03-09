import java.util.*;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> mylist = new ArrayList<>();

        while(list1 != null){
            mylist.add(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            mylist.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(mylist);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(int num : mylist){
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}