package T_240913;

public class Account 
{
    private String actNum;
    private String actHolder;
    private int balance;

    public Account(String actNum, String actHolder, int inideposit) 
    {
        this.actNum = actNum;
        this.actHolder = actHolder;
        this.balance = inideposit;
    }

    public String getActNum() 
    {
        return actNum;
    }

    public String getAccountHolder() 
    {
        return actHolder;
    }

    public int getBalance() 
    {
        return balance;
    }

    public void deposit(int amount) 
    {
        balance+=amount;
    }

    public void withdraw(int amount) 
    {
        if(amount<=balance) 
        {
            balance-=amount;
        } 
        else 
        {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
