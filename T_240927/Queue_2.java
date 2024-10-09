package T_240927;

import java.util.*;
public class Queue_2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스의 수

        for(int i=0; i<t; i++) 
        {
            int n = in.nextInt(); // 문서의 개수
            int m = in.nextInt(); // 몇 번째로 인쇄되었는지 궁금한 문서 위치
            
            // 문서의 중요도를 저장하는 큐
            Queue<Integer> que = new LinkedList<>();
            
            // 문서의 인덱스를 저장하는 큐
            Queue<Integer> idxque = new LinkedList<>();

            for(int j=0; j<n; j++) 
            {
                int fir = in.nextInt(); // 각 문서의 중요도 입력
                que.add(fir); // 중요도를 큐에 저장
                idxque.add(j); // 문서의 인덱스를 큐에 저장
            }

            int cnt=0;  // 인쇄한 문서의 개수를 카운트
            while(!que.isEmpty()) 
            {
                int fir = que.poll();  // 큐에서 가장 앞에 있는 문서의 중요도를 가져옴
                int index = idxque.poll(); // 해당 문서의 인덱스를 가져옴
                boolean isFir = true; // 현재 문서가 가장 중요한 문서인지 여부를 나타냄
                
                // 큐에 남아 있는 다른 문서들의 중요도와 비교하여 현재 문서가 가장 중요한 문서인지 확인
                for(int otherF : que) 
                {
                	// 만약 현재 문서의 중요도보다 높은 중요도를 가진 문서가 있다면
                    if(otherF > fir) 
                    {
                        isFir = false; // 현재 문서는 가장 중요한 문서가 아님을 표시하고
                        break; //종료
                    }
                }
                
                // 현재 문서가 가장 중요한 문서가 아니라면 다시 큐에 넣음
                if(!isFir) 
                {
                    que.add(fir); // 문서의 중요도를 큐에 다시 추가
                    idxque.add(index); // 문서의 인덱스도 큐에 다시 추가
                } 
                else // 현재 문서가 가장 중요한 문서라면
                {
                    cnt++; // 문서의 개수를 카운트
                    
                    // 만약 현재 문서의 인덱스가 목표로 하는 위치라면
                    if(index == m) 
                    {
                    	//결과를 출력하고 반복문을 종료
                        System.out.println(cnt);
                        break;
                    }
                }
            }
        }
        in.close();
    }
}
