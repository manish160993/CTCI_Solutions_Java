import java.util.*;

class ques3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8};
        BST tree = new BST();
        tree.insertInSorted(arr);
        tree.createLinkedListLevel();
    }
}