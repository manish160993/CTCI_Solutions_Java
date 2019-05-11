import java.util.*;

class ques4{

    Stack<Integer> add_stack;
    Stack<Integer> remove_stack;
    ques4(){
        add_stack = new Stack();
        remove_stack = new Stack();
    }

    void add(int val){
        add_stack.push(val);
    }

    void remove(){
        peek();
        if(!remove_stack.isEmpty()){
            remove_stack.pop();
        }
    }

    void peek(){
        if(!remove_stack.isEmpty()){
            System.out.println(remove_stack.peek());
        }else{
            while(!add_stack.isEmpty()){
                remove_stack.push(add_stack.pop());
            }
            if(!remove_stack.isEmpty()){
                System.out.println(remove_stack.peek());
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ques4 ques = new ques4();
        while(true){
            System.out.println("Press 1 for add \n Press 2 for remove \n Press 3 for getting peek");
            int button = scan.nextInt();
            switch(button){
                case 1:
                    System.out.println("Enter value to push to the stack");
                    int val = scan.nextInt();
                    ques.add(val);
                    break;
                case 2:
                    ques.remove();
                    break;
                case 3:
                    ques.peek();
                    break;
                default:
                    return;
            }
        }
    }
}