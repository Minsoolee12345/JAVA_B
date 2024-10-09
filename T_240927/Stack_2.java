package T_240927;

import java.util.Scanner;
import java.util.Stack;

public class Stack_2
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);
		
		int l = 1;
		
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = in.nextInt();
		}
		in.close();
		for(int i=0; i<n; i++)
		{
			int t = arr[i];
			
			while(l <= t)
			{
				stack.push(l);
				sb.append("+\n");
				l++;
			}
			
			if(stack.peek() == t)
			{
				stack.pop();
				sb.append("-\n");
			}
			else
			{
				System.out.println("NO");
				return;
			}
		}
		System.out.println(sb.toString());
		
	}
}
