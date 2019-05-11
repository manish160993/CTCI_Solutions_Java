import java.util.*;

class ques5{
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

    Node Sum_2_LinkedList(Node head1, Node head2){
        int carry = 0;
        Node temp = null, head = null;
        while(head1!=null || head2!=null || carry != 0){
            int sum = carry;
            if(head1 != null){
                sum += head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                sum += head2.val;
                head2 = head2.next;
            }
            carry = sum/10;
            if(head == null){
                head = new Node(sum%10);
                temp = head;
            }else{
                temp.next = new Node(sum%10);
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        ques5 num1 = new ques5();
        ques5 num2 = new ques5();
        ques5 ans = new ques5();
        ques5 ans2 = new ques5();
        
        for(int i=0; i<n1; i++){
            num1.insert(scan.nextInt());
        }
        for(int i=0; i<n2; i++){
            num2.insert(scan.nextInt());
        }
        num1.print();
        num2.print();
        ans.head = ans.Sum_2_LinkedList(num1.head, num2.head);
        ans.print();
    }
}