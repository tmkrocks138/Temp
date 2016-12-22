import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temp extends JFrame implements ActionListener{
    private Container pane;
    private JButton toC;
    private JButton toC;
    private JButton toF;
    private JLabel result;

    public Temp() {
	this.setTitle("TEMPERATURE CONVERTER");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	toC = new JButton("toCelsius");
	toC.addActionListener(this);
	toC.setActionCommand("findC");

	toF = new JButton("toFahrenheit");
	toC.addActionListener(this);
	toC.setActionCommand("findF");

	initial = new JTextField(10);

	pane.add(initial);
	pane.add(toC);
	pane.add(toF);
	
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("findC")){
	    double ans = TtoC(initial);
	    result.setText((String)ans);
	}
	if(event.equals("findT")){
	    double ans = CtoT(initial);
	    result.setText((String)ans);
	}
    }
    


    public static double CtoF(double celsius){
	double fahrenheit = (celsius * 1.8) + 32;
	return fahrenheit;
    }

    public static double FtoC(double fahrenheit){
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

}
