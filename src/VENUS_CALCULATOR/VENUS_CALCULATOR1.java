package VENUS_CALCULATOR;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class VENUS_CALCULATOR1 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VENUS_CALCULATOR1 window = new VENUS_CALCULATOR1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VENUS_CALCULATOR1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 443, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VENUS");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(new Color(169, 169, 169));
		lblNewLabel.setFont(new Font("Dubai", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 0, 155, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("BE SMART");
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(20, 57, 86, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Fx-999 PLUS ");
		lblNewLabel_1.setForeground(new Color(0, 191, 255));
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.ITALIC, 15));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(10, 80, 155, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("SOLAR GLASS");
		lblNewLabel_4.setForeground(new Color(169, 169, 169));
		lblNewLabel_4.setFont(new Font("Wingdings 3", Font.PLAIN, 32));
		lblNewLabel_4.setBounds(247, 24, 192, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel_2.setForeground(new Color(169, 169, 169));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(233, 45, 186, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TWO WAY POWER");
		lblNewLabel_3.setForeground(new Color(0, 191, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(270, 79, 155, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 117, 388, 78);
		frame.getContentPane().add(textField);
		
		JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnEx.setForeground(new Color(0, 0, 0));
		btnEx.setBounds(31, 230, 55, 47);
		frame.getContentPane().add(btnEx);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSin.setBounds(31, 287, 55, 47);
		frame.getContentPane().add(btnSin);
		
		JButton btnNegative = new JButton("(-)");
		btnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*-1;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNegative.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnNegative.setBackground(new Color(240, 240, 240));
		btnNegative.setForeground(Color.RED);
		btnNegative.setBounds(31, 344, 55, 47);
		frame.getContentPane().add(btnNegative);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);

			}
		});
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(31, 401, 55, 47);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);

			}
		});
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(31, 458, 55, 47);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setForeground(Color.ORANGE);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(31, 515, 55, 47);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);

			}
		});
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(31, 577, 132, 47);
		frame.getContentPane().add(btn0);
		
		JButton btnE2 = new JButton("x^2");
		btnE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnE2.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnE2.setForeground(new Color(0, 0, 0));
		btnE2.setBounds(110, 230, 55, 47);
		frame.getContentPane().add(btnE2);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCos.setBounds(110, 287, 55, 47);
		frame.getContentPane().add(btnCos);
		
		JButton btnRoot = new JButton("\u221A");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRoot.setBounds(110, 344, 55, 47);
		frame.getContentPane().add(btnRoot);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);

			}
		});
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(110, 401, 55, 47);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);

			}
		});
		btn5.setForeground(Color.ORANGE);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(110, 458, 55, 47);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);

			}
		});
		btn2.setForeground(Color.ORANGE);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(110, 515, 55, 47);
		frame.getContentPane().add(btn2);
		
		JButton btnE3 = new JButton("x^3");
		btnE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnE3.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnE3.setForeground(new Color(0, 0, 0));
		btnE3.setBounds(185, 230, 55, 47);
		frame.getContentPane().add(btnE3);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Dialog", Font.BOLD, 12));
		btnTan.setBounds(185, 287, 55, 47);
		frame.getContentPane().add(btnTan);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";

			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPercent.setBounds(185, 344, 55, 47);
		frame.getContentPane().add(btnPercent);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);

			}
		});
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(185, 401, 55, 47);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);

			}
		});
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(185, 458, 55, 47);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);

			}
		});
		btn3.setForeground(Color.ORANGE);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(185, 515, 55, 47);
		frame.getContentPane().add(btn3);
		
		JButton btnXn = new JButton("1/x");
		btnXn.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnXn.setForeground(new Color(0, 0, 0));
		btnXn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnXn.setBounds(259, 230, 55, 47);
		frame.getContentPane().add(btnXn);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log10(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Dialog", Font.BOLD, 10));
		btnLog.setBounds(259, 287, 55, 47);
		frame.getContentPane().add(btnLog);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double fact =1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnN.setBounds(259, 344, 55, 47);
		frame.getContentPane().add(btnN);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
			{
				StringBuilder str = new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace= str.toString();
				textField.setText(backSpace);
				
			}
			}
		});
		btnBackSpace.setFont(new Font("Windings", Font.PLAIN, 14));
		btnBackSpace.setForeground(Color.MAGENTA);
		btnBackSpace.setBounds(259, 401, 55, 47);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";

			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMul.setBounds(259, 458, 55, 47);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";

			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSub.setBounds(259, 515, 55, 47);
		frame.getContentPane().add(btnSub);
		
		JButton btnDot= new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);

			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnDot.setBounds(185, 577, 55, 47);
		frame.getContentPane().add(btnDot);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnXy.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnXy.setForeground(new Color(0, 0, 0));
		btnXy.setBounds(334, 230, 55, 47);
		frame.getContentPane().add(btnXy);
		
		JButton btnln = new JButton("ln");
		btnln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnln.setFont(new Font("Dialog", Font.BOLD, 12));
		btnln.setBounds(334, 287, 55, 47);
		frame.getContentPane().add(btnln);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPlusMinus.setBounds(334, 344, 55, 47);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setForeground(Color.MAGENTA);
		btnClear.setBounds(332, 401, 55, 47);
		frame.getContentPane().add(btnClear);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAdd.setBounds(332, 458, 55, 104);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="x^y")
				{
					double resultt=1;
					for(int i=0; i<second;i++)
					{
						resultt=first*resultt;
						
					}
					answer=String.format("%.2f",resultt);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.setForeground(Color.RED);
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnEqual.setBounds(334, 577, 55, 47);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";

			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDivide.setBounds(259, 577, 55, 47);
		frame.getContentPane().add(btnDivide);
		
		JRadioButton rdbtnOn = new JRadioButton("Power On");
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn1.setEnabled(true);
			btn2.setEnabled(true);
			btn3.setEnabled(true);
			btn4.setEnabled(true);
			btn5.setEnabled(true);
			btn6.setEnabled(true);
			btn7.setEnabled(true);
			btn8.setEnabled(true);
		    btn9.setEnabled(true);
		    
		    btnMul.setEnabled(true);
			btnDivide.setEnabled(true);
			btnAdd.setEnabled(true);
			btnSub.setEnabled(true);
			btnLog.setEnabled(true);
			btnSin.setEnabled(true);
		    btnCos.setEnabled(true);
		    btnTan.setEnabled(true);
		    btnPlusMinus.setEnabled(true);
			btnXy.setEnabled(true);
			btnXn.setEnabled(true);
			btnN.setEnabled(true);
			btnEqual.setEnabled(true);
			btnNegative.setEnabled(true);
		    btnE3.setEnabled(true);
			btnBackSpace.setEnabled(true);
			btnRoot.setEnabled(true);
			btn0.setEnabled(true);
			btnPercent.setEnabled(true);
			btnClear.setEnabled(true);
			btnln.setEnabled(true);
			btnEx.setEnabled(true);
		    btnE2.setEnabled(true);
		    btnDot.setEnabled(true);
		}
				
			}
		);
		buttonGroup.add(rdbtnOn);
		rdbtnOn.setBounds(30, 201, 96, 21);
		frame.getContentPane().add(rdbtnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("Power Off");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
			    btn9.setEnabled(false);
			    
			    btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnLog.setEnabled(false);
				btnSin.setEnabled(false);
			    btnCos.setEnabled(false);
			    btnTan.setEnabled(false);
			    btnPlusMinus.setEnabled(false);
				btnXy.setEnabled(false);
				btnXn.setEnabled(false);
				btnN.setEnabled(false);
				btnN.setEnabled(false);
				btnEqual.setEnabled(false);
				btnNegative.setEnabled(false);
			    btnE3.setEnabled(false);
			    btnE2.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnRoot.setEnabled(false);
				btn0.setEnabled(false);
				btnPercent.setEnabled(false);
				btnClear.setEnabled(false);
				btnln.setEnabled(false);
				btnEx.setEnabled(false);
			   
			    btnDot.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setBounds(294, 201, 96, 21);
		frame.getContentPane().add(rdbtnOff);
	}
}
