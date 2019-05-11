import java.util.*;

class ques2{

    Stack<Integer> stack;
    int min;
    ques2(){
        stack = new Stack();
        min = Integer.MAX_VALUE;
    }

    void push(int num){
        if(min >= num){
            stack.push(min);
            min = num;
        }
        stack.push(num);
    }

    void pop(){
        if(stack.isEmpty()){
            return;
        }
        if(stack.pop() == min){
            min = stack.pop();
        }
        System.out.println(stack);
    }

    int min(){
        return min;
    }

    public static void main(String[] args){
        ques2 ques = new ques2();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Press 1 for push \n Press 2 for pop \n Press 3 for min");
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
                case 3:
                    System.out.println("Minimum value is : "+ques.min());
                    break;
                default:
                    return;
            }
        }
    }
}