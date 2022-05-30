import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class LongestValidParan {
	
	public static void main(String[] args) {
		String s="()";

		int Maxcount=0;
		Stack<Integer> IntStack=new Stack<>();
		if(s.length()>1)
		{
			IntStack.push(-1);
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='(')
				{
					IntStack.push(i);
				}
				else
				{
					IntStack.pop();
					if(IntStack.size()==0)
					{
						IntStack.push(i);
					}
					else
					{
						Maxcount=Math.max(Maxcount, i-IntStack.peek());
						
						
					}
				}
			}
			
		}
		else
		{
			System.out.println("0");
		}
		System.out.println(Maxcount);
	}

}
