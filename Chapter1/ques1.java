import java.util.*;

class ques1{

    static boolean isUnique(char[] ch){
        boolean[] c = new boolean[256];
        System.out.println(Arrays.toString(ch));
        for(char c_in : ch){
            if(c[(int)c_in]){
                return false;
            }
            c[(int)c_in] = false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(isUnique(s.toCharArray()));
    }
}