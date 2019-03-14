import java.util.*;

class ques6{
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            next = null;
            this.val = val;
        }
    }

    void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    //1->2->3->4->5
    boolean isPalindrome(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node head2 = null;
        if(fast==null){
            head2 = slow.next;
            slow.next = null;
        }else{
            head2 = slow.next;
        }
        Node temp = reverse(head2);
        
        while(temp!=null){
            if(head==null || temp.val!=head.val){
                return false;
            }
            head= head.next; temp = temp.next;
        }
        return true;
    }

    Node reverse(Node head){
        Node Next = head;
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }

    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        ques6 list = new ques6();
        for(int i=0; i<n1; i++){
            list.insert(scan.nextInt());
        }
        list.print();
        // list.head = list.reverse(list.head);
        // list.print();
        System.out.println(list.isPalindrome());
    }
}