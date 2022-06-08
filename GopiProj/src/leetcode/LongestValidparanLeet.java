package leetcode;
import java.util.Stack;

public class LongestValidparanLeet {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(-1);            // initially push -1 to the stack because if there is ) then we can not pop our stack if it is empty
		String s="()";
        int ans = 0;
        
        // iterate over the given string
        for(int i=0;i<s.length();i++)
        {
            // if it is open parenthesis then push that index to the stack
            if(s.charAt(i) == '(')
                st.push(i);
            
            // if it is close then pop the stack 
            // and check it is empty or not if it is empty then push current value to it because if there is another ) then we can not pop our stack if it is empty
            // if it is not empty then find the length between the (current index i and stack top index) and store the max value in ans
            else
            {
                st.pop();
                
                if(st.empty())
                    st.push(i);
                else
                    ans =Math.max(ans,i-st.peek());
            }
        }
        
        // returning the answer
       System.out.println(ans);

	}

}
