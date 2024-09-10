
public class Main{
    public static String String1(String s) {
        String st1 = s.toLowerCase();
        String s1 = "";
        for (int i = st1.length() - 1; i >= 0; i--) {
            s1 = s1 + st1.charAt(i);
        }
        return s1;
    }
    public static void main(String[] agru){
        String s ="Riya";
        String rev = String1(s);
        System.out.println(rev);

    }
}
