import java.util.*;

class ques3{

    static String URLify(char[] ch){
        int spaces = 0;
        for(char c : ch){
            if(c == ' '){
                spaces++;
            }
        }
        char[] c_out = new char[ch.length+2*spaces];
        int i = c_out.length-1;
        for(int j=ch.length-1; j>=0; j--){
            if(ch[j]==' '){
                c_out[i--] = '0';
                c_out[i--] = '2';
                c_out[i--] = '%';
            }else{
                c_out[i--] = ch[j];
            }
        }
        return new String(c_out);

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(URLify(s.toCharArray()));
    }
}