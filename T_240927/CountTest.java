package T_240927;

// 메소드
interface Countable 
{
	// 메소드
	int count();
}

// 메소드
abstract class CountableBase implements Countable 
{
	 protected String name;
	 protected int num;

	 CountableBase(String name, int num) 
	 {
	     this.name = name;
	     this.num = num;
	 }
}

// 메소드
//Bird 클래스 구현
class Bird extends CountableBase 
{
	 Bird(String name, int num) 
	 {
	     super(name, num);
	 }
	
	 public int count() 
	 {
	     return num;
	 }
	
	 public void fly() 
	 {
	     System.out.println(name + "가 날아갑니다.");
	 }
}

// 메소드
class Tree extends CountableBase 
{
	 Tree(String name, int num) 
	 {
	     super(name, num);
	 }
	
	 public int count() 
	 {
	     return num;
	 }
	
	 public void ripen() 
	 {
	     System.out.println(name + "의 열매가 익습니다.");
	 }
}

// 메소드
public class CountTest 
{
	 public static void main(String[] args) 
	 {
	     // 스택
	     Countable[] countables = 
	     {
		 // 힙
	         new Bird("앵무새", 5),
	         new Bird("독수리", 2),
	         new Tree("소나무", 10),
	         new Tree("사과나무", 7)
	     };
	
	     for(Countable c : countables) 
	     {
	         System.out.println(c.count() + "개 있습니다.");
	         if(c instanceof Bird) 
	         {
	             ((Bird) c).fly();
	         } 
	         else if(c instanceof Tree) 
	         {
	             ((Tree) c).ripen();
	         }
	     }
	}
}

