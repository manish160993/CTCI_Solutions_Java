import java.util.*;

class ques9{

    static boolean isSubstring(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        s += s;
        if(s.contains(t)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        System.out.println(isSubstring(s, t));
    }
}