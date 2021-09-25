package cs176L;

public class US2Metric {

	public static void main(String[] args) {
		double x = 1;
		double y;
		System.out.println("inches\t centimeters\t pounds\t kilograms");
		System.out.println("------\t -----------\t ------\t ---------");
	for(double i=1; i<=50; i++)
	{
	x = i*2.54;	
	y = i*0.45359237;
	System.out.print(i +" \t ");
	System.out.printf("%.4f", x);
	System.out.print(" \t " + i +" \t ");
	System.out.printf("%.4f", y);
	System.out.println();
	}
	
	}


}
