import java.util.*;

class ques2{

    static boolean checkPermutation(char[] s, char[] t){
        if(s.length != t.length){
            return false;
        }
        int[] ch = new int[256];
        for(char c : s){
            ch[(int)c]++;
        }
        for(char c : t){
            if(ch[(int)c]==0){
                return false;
            }
            ch[(int)c]--;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next(); String t = scan.next();
        System.out.println(checkPermutation(s.toCharArray(), t.toCharArray()));
    }
}