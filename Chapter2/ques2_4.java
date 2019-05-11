import java.util.*;

class ques2_4{
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

    void kthToLast(int k){
        Node slow = head;
        Node fast = head;
        int i = 0;
        while(i++<k){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(k+"th value from last:"+slow.val);
    }

    void deleteMiddle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Middle Node : "+slow.val);
    }

    void partition(int element){
        Node curr = head.next;
        Node end = head;
        if(head == null || head.next == null){
            return;
        }
        while(curr != null){
            Node temp = curr.next;
            if(curr.val < element){
                curr.next = head;
                head = curr;
            }else{
                end.next = curr;
                end = curr;
            }
            curr = temp;
        }
        end.next = null;
    }

    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ques2_4 list = new ques2_4();
        for(int i=0; i<n; i++){
            list.insert(scan.nextInt());
        }
        list.print();
        System.out.println("Please enter the kth to the last element");
        list.kthToLast(scan.nextInt());
        System.out.println("Deleting the middle element");
        list.deleteMiddle();
        System.out.println("Enter the element to Partition the list");
        list.partition(scan.nextInt());
        list.print();
    }
}