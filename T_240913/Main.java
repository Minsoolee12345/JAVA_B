package T_240913;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        BA bankApp = new BA();

        while(true) 
        {
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.print("선택> ");
            int choice = Integer.parseInt(in.nextLine());

            switch (choice) 
            {
                case 1:
                    System.out.print("계좌번호: ");
                    String actcnt = in.nextLine();
                    
                    System.out.print("계좌주: ");
                    String actholder = in.nextLine();
                    
                    System.out.print("초기입금액: ");
                    int initialDeposit = Integer.parseInt(in.nextLine());
                    
                    bankApp.createAccount(actcnt, actholder, initialDeposit);
                    break;

                case 2:
                    bankApp.showAct();
                    break;

                case 3:
                    System.out.print("계좌번호: ");
                    String depActNum = in.nextLine();
                    
                    System.out.print("예금액: ");
                    int depAmout = Integer.parseInt(in.nextLine());
                    
                    bankApp.deposit(depActNum, depAmout);
                    break;

                case 4:
                    System.out.print("계좌번호: ");
                    String withdraActNum = in.nextLine();
                    
                    System.out.print("출금액: ");
                    int withdrawalAmount = Integer.parseInt(in.nextLine());
                    
                    bankApp.withdraw(withdraActNum, withdrawalAmount);
                    break;

                case 5:
                    System.out.println("프로그램 종료");
                    in.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
