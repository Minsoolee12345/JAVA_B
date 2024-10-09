package T_240920;

public class OverridingTest 
{
	public static void main(String[] args) 
	{
		double d = 5.0;
		double b = 7.0;
		
		Circle circle = new Circle(d);
		System.out.println(">>> 원 <<< ");
		System.out.println("반지름 : " + circle.getRadius());
		System.out.println("면적 : " + circle.getArea());
		
		System.out.println();
		
		Ball ball = new Ball(d);
		System.out.println(">>> 공 <<< ");
		System.out.println("반지름 : " + ball.getRadius());
		System.out.println("면적 : " + ball.getArea());
		
		System.out.println();
		
		Cylinder cyl = new Cylinder(d,b);
		System.out.println(">>> 원기둥 <<< ");
		System.out.println("반지름 : " + cyl.getRadius());
		System.out.println(" 높이 : " + cyl.getHeight());
		System.out.printf("면적 : %.1f",cyl.getArea());
	}
}

class Circle
{
	final static double PI = 3.14;
	private double rad;
	
	public Circle(double rad)
	{
		this.rad = rad;
	}

	public double getRadius() 
	{
		return rad;
	}

	public void setRad(double rad) 
	{
		this.rad = rad;
	}
	
	public double getArea()
	{
		double area = rad * rad * PI;
		return area;
	}
}


class Ball extends Circle
{
	public Ball(double rad)
	{
		super(rad);
	}

	@Override
	public double getArea() 
	{
		return 4 * PI *super.getArea();
	}
}


class Cylinder extends Circle
{
	private double hit;
	
	public Cylinder(double rad, double hit)
	{
		super(rad);
		this.hit = hit;
	}

	public double getHeight() 
	{
		return hit;
	}
	
	public void setHeight(double hit)
	{
		this.hit = hit;
	}

	@Override
	public double getArea() 
	{
		return 2* PI * super.getRadius() * (super.getArea() + hit);
	}
}