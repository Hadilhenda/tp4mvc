package modele;

public class NumberBean{
	private static double num=0;
	
	public  NumberBean() {
		setNum(0);
	}

	public static double getNum() {
		return num;
	}

	public static void setNum(double num) {
		NumberBean.num = num;
	}
	
	public static double getRandomNum(String rang)
	{
		
	try 
	{
		
		num=Double.parseDouble(rang);
		
	}
	
	catch (Exception l)
	
	{
		num=10.0;
	}
	return (Math.random() * num);
	}
	
	
}

