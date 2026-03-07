import java.util.Stack;
public class hw2 {
    public static void main(String[] args) {
        String s = "aaaabbbccddeaa";
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            if(st.size() == 0) st.push(s.charAt(i));
            if(st.peek() != s.charAt(i)) st.push(s.charAt(i));
        }
        System.out.println(st);
    }
}
