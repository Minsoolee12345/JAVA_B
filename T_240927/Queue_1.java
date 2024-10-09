package T_240927;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		Queue<Integer> que = new LinkedList<>();
		
		//큐에 삽입
		for(int i=1; i<=n; i++)
		{
			que.offer(i);
		}
		
		//empty면 break
		while(!que.isEmpty())
		{
			//큐에서 1부터 m-1번째를 poll을 하고 offer한다 
			for(int i=1; i<m && !que.isEmpty(); i++)
			{
				que.offer(que.poll());
			}
			
			// m번째 poll하고 출력한다.
			if(!que.isEmpty())
			{
				sb.append(que.poll());
				if(que.size() >= 1) 
				{
					sb.append(", ");
				}
			}
		}
		
		sb.append(">");
		System.out.println(sb);
		in.close();
	}
}