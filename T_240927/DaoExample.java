package T_240927;

interface DataAccessObject 
{
	 void select();
	 void insert();
	 void update();
	 void delete();
}

class OracleDao implements DataAccessObject 
{
	 public void select() 
	 {
	     System.out.println("Oracle DB에서 검색");
	 }
	 
	 public void insert() 
	 {
	     System.out.println("Oracle DB에 삽입");
	 }
	 
	 public void update() 
	 {
	     System.out.println("Oracle DB에서 수정");
	 }
	 
	 public void delete() 
	 {
	     System.out.println("Oracle DB에서 삭제");
	 }
}

class MySqlDao implements DataAccessObject 
{
	 public void select() 
	 {
	     System.out.println("MySQL DB에서 검색");
	 }
	 
	 public void insert() 
	 {
	     System.out.println("MySQL DB에 삽입");
	 }
	 
	 public void update() 
	 {
	     System.out.println("MySQL DB에서 수정");
	 }
	 
	 public void delete() 
	 {
	     System.out.println("MySQL DB에서 삭제");
	 }
}

public class DaoExample 
{
	 public static void main(String[] args) 
	 {
	     DataAccessObject oracleDao = new OracleDao();
	     DataAccessObject mySqlDao = new MySqlDao();
	     
	     dbWork(oracleDao);
	     dbWork(mySqlDao);
	 }
	 
	 public static void dbWork(DataAccessObject dao) 
	 {
	     dao.select();
	     dao.insert();
	     dao.update();
	     dao.delete();
	 }
}

