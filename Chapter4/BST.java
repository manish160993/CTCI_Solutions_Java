import java.util.*;

class BST{
    private Node root;
    private class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
        public String toString(){
            return ""+this.val;
        }
    }

    void insert(int val){
        if(root == null){
            root = new Node(val);
            return;
        }
        root = insertNode(root, val);
    }

    Node insertNode(Node root, int val){
        if(root == null){
            root = new Node(val);
        }else if(root.val < val){
            root.right = insertNode(root.right, val);
        }else{
            root.left = insertNode(root.left, val);
        }
        return root;
    }

    void insertInSorted(int[] arr){
        root = insert(arr, 0, arr.length-1);
    }

    Node insert(int[] arr, int i, int j){
        if(i>j){
            return null;
        }
        int mid = (i+j)/2;
        Node root = new Node(arr[mid]);
        root.left = insert(arr, i, mid-1);
        root.right = insert(arr, mid+1, j);
        return root;
    }

    void inorder(){
        inorder(root);
        System.out.println();
    }

    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    void preorder(){
        preorder(root);
        System.out.println();
    }

    void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    LinkList list = new LinkList();
            
    void BFS(){
        Queue<Node> queue = new LinkedList();
        if(root == null){
            return;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            System.out.println(queue);
            for(int i=0; i<size; i++){
                Node temp = queue.remove();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
    }

    void createLinkedListLevel(){
        Queue<Node> queue = new LinkedList();
        if(root == null){
            return;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            //System.out.println(queue);
            LinkList list = new LinkList();
            for(int i=0; i<size; i++){
                Node temp = queue.remove();
                list.addNode(temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            System.out.println(list);
        }
    }
}