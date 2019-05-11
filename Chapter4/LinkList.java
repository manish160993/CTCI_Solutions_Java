import java.util.*;

class LinkList{
    private ListNode head;
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
        public String toString(){
            return ""+this.val;
        }
        // public int getVal(){
        //     return this.getVal();
        // }
    }

    public ListNode getHead(){
        return this.head;
    }
    void addNode(int val){
        if(head == null){
            head = new ListNode(val);
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new ListNode(val);
    }

    void print(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public String toString(){
        ListNode temp = head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp.val+" ");
            temp = temp.next;
        }
        return sb.toString();
    }
}