package T_240830;

public class m_p 
{
    public static int getSum(int arr[]) 
    {
        int sum=0;
        for(int i=0; i<arr.length; i++) 
        {
            sum+=arr[i];
        }
        return sum;
    }

    public static int geth(int arr[], int num) 
    {
        int cnt=0;
        for(int i=0; i<arr.length; i++) 
        {
            if(arr[i]>num) 
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static int getMax(int arr[]) 
    {
        int max=arr[0];
        for(int i=1; i<arr.length; i++) 
        {
            if(arr[i]>max) 
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void reverseArray(int arr[]) 
    {
        for(int i=arr.length-1; i>=0; i--) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int num[] = {3,5,7,2,8};

        int sum = getSum(num);
        System.out.println("배열의 합: " + sum);

        int count = geth(num,5);
        System.out.println("5보다 큰 숫자의 개수: " + count);

        int max = getMax(num);
        System.out.println("배열에서 가장 큰 값: " + max);

        System.out.print("배열을 역순으로 출력: ");
        reverseArray(num);
    }
}
