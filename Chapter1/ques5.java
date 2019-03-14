import java.util.*;

class ques5{

    static boolean checkEditDistance(char[] s, char[] t){
        if(Math.abs(s.length-t.length)>1){
            return false;
        }
        char[] first = (s.length > t.length) ? t : s;
        char[] second = (s.length > t.length) ? s : t;
        int first_index = 0;
        int second_index = 0;
        boolean foundDifference = false;
        while(first_index < first.length && second_index < second.length){
            if(first[first_index] != second[second_index]){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
                if(first.length == second.length){
                    first_index++;
                }
            }else{
                first_index++;
            }
            second_index++;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        System.out.println(checkEditDistance(s.toCharArray(), t.toCharArray()));
    }
}