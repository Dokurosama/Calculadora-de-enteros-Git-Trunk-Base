package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Calculator;
import view.MainFrame;

public class Presenter implements ActionListener{
	
	private Calculator calculator;
	private MainFrame mainFrame;
	
	public Presenter() {
		calculator = new Calculator();
		mainFrame = new MainFrame(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("suma")) {
			mainFrame.setResult("");
			mainFrame.setResult(String.valueOf(calculator.sum(Integer.parseInt(mainFrame.getNumberOne()),Integer.parseInt( mainFrame.getNumberTwo()))));
		}else if(e.getActionCommand().equals("resta")) {
			mainFrame.setResult("");
			mainFrame.setResult(String.valueOf(calculator.rest(Integer.parseInt(mainFrame.getNumberOne()),Integer.parseInt( mainFrame.getNumberTwo()))));
		}else if(e.getActionCommand().equals("multiplicacion")) {
			mainFrame.setResult("");
			mainFrame.setResult(String.valueOf(calculator.multiplication(Integer.parseInt(mainFrame.getNumberOne()),Integer.parseInt( mainFrame.getNumberTwo()))));
			
		}else if(e.getActionCommand().equals("division")) {
			mainFrame.setResult("");
			mainFrame.setResult(String.valueOf(calculator.divide(Integer.parseInt(mainFrame.getNumberOne()),Integer.parseInt( mainFrame.getNumberTwo()))));
			
			
		}else if(e.getActionCommand().equals("modulo")){
			mainFrame.setResult("");
			mainFrame.setResult(String.valueOf(calculator.module(Integer.parseInt(mainFrame.getNumberOne()),Integer.parseInt( mainFrame.getNumberTwo()))));
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new Presenter();
	}


	

}
