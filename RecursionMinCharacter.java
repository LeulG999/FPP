package lesson4;
public class RecursionMinCharacter {
    public static char minCharacter(String s,int i){
        if(i==s.length()-1){
            return s.charAt(i);
        }
       int min=minCharacter(s,i+1);
        return (char)Math.min(min,s.charAt(i));
    }
    public static void main(String[] args){
        String s="akel";
        System.out.println(minCharacter(s,0));
    }
}
