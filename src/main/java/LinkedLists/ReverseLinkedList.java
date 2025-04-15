package LinkedLists;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode currentNode=head;
        while(currentNode!=null){
            ListNode nextNode = currentNode.next;
            currentNode.next=prev;
            prev=currentNode;
            currentNode=nextNode;
        }
        prev=head;
        return head;
    }

}
