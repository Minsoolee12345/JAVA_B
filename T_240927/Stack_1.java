package T_240927;

import java.util.Scanner;
import java.util.Stack;

public class Stack_1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		in.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++)
		{
			String parStr = in.nextLine();
			sb.append(isVPS(parStr)).append("\n");
		}
		System.out.println(sb.toString());
		in.close();
	}

	public static String isVPS(String parStr) 
	{
		Stack<Character> vpsStack = new Stack<>();
		char parCharArr[] = parStr.toCharArray();
		
		for(char par : parCharArr)
		{
			if(par == '(')
			{
				vpsStack.add(par);
			}
			else
			{
				if(vpsStack.empty())
				{
					return "NO";
				}
				vpsStack.pop();
			}
		}
		if(vpsStack.isEmpty())
		{
			return "YES";
		}
		return "NO";
	}
}