package cs176L;

public class TempConvert {

	public static void main(String[] args) {
		
		double tempf;
		double tempc;
		System.out.println("fahrenheit \t celsius");
		for(tempf = 0; tempf<=212; tempf= tempf+2)
		{
			tempc = (tempf-32)/1.8;
			System.out.print(tempf + " \t  \t ");
			System.out.printf("%.2f", tempc);
			System.out.println();
		}
		System.out.println();
		System.out.println("celsius \t fahrenheit");
	
		for( tempc = 0; tempc<=100; tempc= tempc+2)
		{
			tempf = (tempc*1.8)+32;
			System.out.print(tempc + " \t  \t " );
			System.out.printf("%.2f", tempf);
			System.out.println();
		}
		
	}

}
