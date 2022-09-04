package view;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField numberOne;
	private JTextField numberTwo;
	private JTextField result;


	/**
	 * Create the application.
	 */
	public MainFrame(ActionListener listener) {
		initialize(listener);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ActionListener listener) {
		//frame = new JFrame();
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(146, 22, 140, 23);
		this.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 1");
		lblNewLabel_1.setBounds(10, 75, 72, 14);
		this.getContentPane().add(lblNewLabel_1);
		
		numberOne = new JTextField();
		numberOne.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar())) {
					getToolkit().beep();
					e.consume();
					
				}
			}
		});
		numberOne.setBounds(83, 72, 122, 30);
		this.getContentPane().add(numberOne);
		numberOne.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Numero 2");
		lblNewLabel_1_1.setBounds(215, 75, 71, 14);
		this.getContentPane().add(lblNewLabel_1_1);
		
		numberTwo = new JTextField();
		numberTwo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar())) {
					getToolkit().beep();
					e.consume();
					
				}
			}

		});
		numberTwo.setColumns(10);
		numberTwo.setBounds(291, 72, 135, 30);
		this.getContentPane().add(numberTwo);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(listener);
		btnNewButton.setActionCommand("suma");
		btnNewButton.setBounds(15, 117, 67, 36);
		this.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(listener);
		btnNewButton_1.setActionCommand("resta");
		btnNewButton_1.setBounds(93, 117, 67, 36);
		this.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(listener);
		btnNewButton_2.setActionCommand("multiplicacion");
		btnNewButton_2.setBounds(170, 117, 72, 36);
		this.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(listener);
		btnNewButton_3.setActionCommand("division");
		btnNewButton_3.setBounds(255, 117, 78, 36);
		this.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("%");
		btnNewButton_4.addActionListener(listener);
		btnNewButton_4.setActionCommand("modulo");
		btnNewButton_4.setBounds(343, 117, 72, 36);
		this.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 195, 72, 30);
		this.getContentPane().add(lblNewLabel_2);
		
		result = new JTextField();
		result.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Character.isLetter(e.getKeyChar())) {
					getToolkit().beep();
					e.consume();
					
				}
			}
		});
		result.setBounds(93, 190, 316, 45);
		this.getContentPane().add(result);
		result.setColumns(10);
		this.setVisible(true);
	}

	public String getNumberOne() {
		return numberOne.getText();
	}

	public void setNumberOne(String numberOne) {
		this.numberOne.setText(numberOne);
	}

	public String getNumberTwo() {
		return numberTwo.getText();
	}

	public void setNumberTwo(String numberTwo) {
		this.numberTwo.setText(numberTwo);
	}

	public String getResult() {
		return result.getText();
	}

	public void setResult(String result) {
		this.result.setText(result);
	}

	
	
	
	
	
	

}
