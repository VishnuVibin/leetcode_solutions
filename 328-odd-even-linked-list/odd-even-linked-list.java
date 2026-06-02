class Solution {
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        int count = 0;

        if (head == null) {
            return null;
        }

        while (head != null) {
            if (count % 2 == 0) {
                even.add(head.val);
            } else {
                odd.add(head.val);
            }

            head = head.next;
            count++;
        }

        even.addAll(odd);

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int i = 0; i < even.size(); i++) {
            temp.next = new ListNode(even.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
}