import java.util.*;

class Stack3{
    int[] stack;
    int size;
    int[] index;
    Stack3(int size){
        this.size = size;
        stack = new int[3*size];
        index = new int[3];
        index[0] = 0;
        index[1] = size;
        index[2] = 2*size;
    }

    void push(int stack_num, int value){
        if(index[stack_num-1]==size*stack_num){
            System.out.println("Stack is Full");
        }else{
            stack[index[stack_num-1]] = value;
            index[stack_num-1]++;
        }
        //System.out.println(Arrays.toString(stack));
    }

    int pull(int stack_num){
        if(index[stack_num-1]==size*(stack_num-1)){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            index[stack_num-1] = index[stack_num-1]-1;
            //System.out.println(index[stack_num-1]+" : "+stack[index[stack_num-1]]);
            return stack[index[stack_num-1]];
        }
    }
}

class ques1{
    Stack3 stack;
    ques1(int size){
        stack = new Stack3(size);
    }

    void push(int stack_num, int value){
        stack.push(stack_num, value);
    }

    int pull(int stack_num){
        return stack.pull(stack_num);
    }

    public static void main(String[] args){
        System.out.println("Please enter the size of the stack");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        ques1 ques = new ques1(size);
        while(true){
            System.out.println("Please enter 0 to push value to stack\n Please enter 1 to remove value from stack\n Please enter 2 to exit the system");
            int select = scan.nextInt();
            switch(select){
                case 0:
                    System.out.println("Please enter '1' to add value to stack 1\nPlease enter 2 to add value to stack 2\nPlease enter 3 to add value to stack 3");
                    int stack_num = scan.nextInt();
                    System.out.println("Please enter the value that is pushed to stack");
                    int value = scan.nextInt();
                    ques.push(stack_num, value);
                    break;
                case 1:
                    System.out.println("Please enter '1' to pull value from stack 1\nPlease enter 2 to pull value from stack 2\nPlease enter 3 to pull value from stack 3");
                    stack_num = scan.nextInt();
                    System.out.println(ques.pull(stack_num));
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        }
    }
}