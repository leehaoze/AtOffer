import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class 替换空格 {
    public String replaceSpace_Simple(StringBuffer str) {
        String ans = "";
        for (int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == ' '){
                ans += "%20";
            }
            else{
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static String replaceSpace(StringBuffer str){
        int space_count = 0;
        for (int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == ' '){
                space_count++;
            }
        }

        int p = str.length()-1;

        for (int i = 0; i < space_count; ++i) {
            str.append("  ");
        }

        int q = str.length()-1;

        while(p != -1){
            if (str.charAt(p) == ' ') {
                str.setCharAt(q--,'0');
                str.setCharAt(q--,'2');
                str.setCharAt(q--,'%');
                p--;
            } else {
                str.setCharAt(q--,str.charAt(p--));
            }
        }

        return str.toString();
    }

    public static void main(String []args){
        System.out.println(replaceSpace(new StringBuffer("We are happy")));
    }

}
