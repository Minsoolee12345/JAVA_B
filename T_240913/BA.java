package T_240913;

public class BA
{
    private Account acts[];
    private int acnt;

    public BA() 
    {
        acts = new Account[100];
        acnt=0;
    }

    public void createAccount(String actNum, String accHolder, int initialDeposit) 
    {
        acts[acnt] = new Account(actNum,accHolder,initialDeposit);
        acnt++;
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    public void showAct() 
    {
        System.out.println("계좌목록");
        for(int i=0; i<acnt; i++)
        {
            System.out.println(acts[i].getActNum() + " " + acts[i].getAccountHolder() + " " + acts[i].getBalance());
        }
    }

    public void deposit(String actNum, int amount) 
    {
        Account act = findAct(actNum);
        if(act != null) 
        {
            act.deposit(amount);
            System.out.println("결과: 예금이 성공하였습니다.");
        } 
        else 
        {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    public void withdraw(String actNum, int amount) 
    {
        Account act = findAct(actNum);
        if(act!=null)
        {
            act.withdraw(amount);
            System.out.println("결과: 출금이 성공하였습니다.");
        } 
        else 
        {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private Account findAct(String actNum) 
    {
        for(int i=0; i<acnt; i++) 
        {
            if(acts[i].getActNum().equals(actNum)) 
            {
                return acts[i];
            }
        }
        return null;
    }
}
