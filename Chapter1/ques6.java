import java.util.*;

class ques6{

    static String compressString(char[] s){
        StringBuilder ans = new StringBuilder();
        int i = 0;
        // for(int i=0; i<s.length;i++){
        //     consec++;
        //     if(i+1>=s.length || (s[i]!=s[i+1])){
        //         ans.append(s[i]).append(consec);
        //         consec = 0;
        //     }
        // }
        while(i<s.length){
            char c = s[i];
            int count = 0;
            int j = i;
            while(j<s.length && s[j]==c){
                j++;
            }
            ans.append(c).append(j-i+"");
            i = j;
        }
        return (s.length>ans.length()) ? ans.toString() : new String(s);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        //String t = scan.next();
        System.out.println(compressString(s.toCharArray()));
    }
}