import java.util.*;

class ques3{

    List<Stack<Integer>> stack;
    int index;
    int size;
    int tot;
    ques3(int size){
        this.size = size;
        stack = new ArrayList();
        stack.add(new Stack());
        tot = 0;
        index = 0;
    }

    void push(int num){
        stack.get(tot).push(num);
        index %= size;
        if(index == 0){
            tot++;
            stack.add(new Stack());
        }
    }

    void pop(){
        if(stack.get(tot).isEmpty()){
            if(tot == 0){
                return;
            }else{
                tot--;
                index = size-1;
                pop();
            }
        }else{
            index--;
            System.out.println(tot+" -> "+stack.get(tot).pop());
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of stacks");
        ques3 ques = new ques3(scan.nextInt());
        while(true){
            System.out.println("Press 1 for push \n Press 2 for pop");
            int button = scan.nextInt();
            switch(button){
                case 1:
                    System.out.println("Enter value to push to the stack");
                    int val = scan.nextInt();
                    ques.push(val);
                    break;
                case 2:
                    ques.pop();
                    break;
                default:
                    return;
            }
        }
    }
}