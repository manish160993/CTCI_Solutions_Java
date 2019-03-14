import java.util.*;

class ques1{
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
    }

    void removeDuplicates(){
        if(head == null){
            return;
        }
        Node temp = head.next;
        HashSet<Integer> hset = new HashSet();
        Node prev = head;
        hset.add(head.val);
        while(temp != null){
            //System.out.println(temp.val);
            if(hset.contains(temp.val)){
                prev.next = temp.next;
            }else{
                prev.next = temp;
                prev = temp;
                hset.add(temp.val);
            }
            temp = temp.next;
        }
    }

    void removeDuplicatesFastPointer(){
        Node slow = head;
        while(slow != null){
            Node fast = slow;
            while(fast.next != null){
                if(fast.next.val == slow.val){
                    fast.next = fast.next.next;
                }else{
                    fast = fast.next;
                }
            }
            slow = slow.next;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ques1 list = new ques1();
        for(int i=0; i<n; i++){
            list.insert(scan.nextInt());
        }
        list.print();
        System.out.println();
        //list.removeDuplicates();
        list.print();
        System.out.println();
        list.removeDuplicatesFastPointer();
        list.print();
    }
}