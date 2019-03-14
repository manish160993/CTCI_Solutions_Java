import java.util.*;

class ques2{

    static boolean checkPalindromePermutation(char[] ch){
        int[] c = new int[256];
        int odd = 0;
        //System.out.println(Arrays.toString(ch));
        for(char c_in : ch){
            c[(int)c_in]++;
            if(c[(int)c_in]%2!=0){
                odd++;
            }else{
                odd--;
            }
        }
        return (odd>1)?false:true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(checkPalindromePermutation(s.toCharArray()));
    }
}