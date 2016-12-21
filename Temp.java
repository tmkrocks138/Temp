import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temp{
    private Container pane;
    private JButton toC;

    public static double CtoF(double celsius){
	double fahrenheit = (celsius * 1.8) + 32;
	return fahrenheit;
    }

    public static double FtoC(double fahrenheit){
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

}
