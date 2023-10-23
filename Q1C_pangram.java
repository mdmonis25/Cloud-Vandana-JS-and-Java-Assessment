public class Q1C_pangram{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPangram(str.toLowerCase()));
    }
    public static boolean isPangram(String s){
        if(s.length()<26){
            return false;
        }
        else{
            for(char ch='a';ch<='z';ch++){
                if(s.indexOf(ch)<0){
                    return false;
                }
            }
        }
    }
}