public class Temp{
    public static double CtoF(double celsius){
	double fahrenheit = (celsius * 1.8) + 32;
	return fahrenheit;
    }

    public static double FtoC(double fahrenheit){
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    public static void main(String[]args){
	System.out.println(CtoF(-40.0));
	System.out.println(FtoC(212.0));

    }

}
