package T_240830;

public class s_3
{
    public static void main(String[] args) 
    {
        int num=5;
        
        for(int i=1; i<=num; i++) 
        {
            for(int j=1; j<i; j++) 
            {
                System.out.print(" ");
            }
            for(int k=i; k<=num; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
