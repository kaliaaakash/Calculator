
package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String oper;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDisplay.setHorizontalAlignment(SwingConstants.TRAILING);
		textDisplay.setBounds(10, 11, 248, 43);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		
		// ---------------------Row 1 ---------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber );
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 130, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(73, 130, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(135, 130, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(textDisplay.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(textDisplay.getText());
				strB.deleteCharAt(textDisplay.getText().length() - 1);
				backspace = strB.toString();
				textDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBackSpace.setBounds(10, 68, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		//----------------------- Row 2---------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 192, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(73, 192, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(135, 192, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				oper ="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(198, 130, 60, 60);
		frame.getContentPane().add(btnSub);
		
		//----------------------- Row 3---------------
		
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textDisplay.getText() + btn1.getText();
						textDisplay.setText(EnterNumber );
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 254, 60, 60);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
			
						String EnterNumber = textDisplay.getText() + btn2.getText();
						textDisplay.setText(EnterNumber );
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(73, 254, 60, 60);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textDisplay.getText() + btn3.getText();
						textDisplay.setText(EnterNumber );
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(135, 254, 60, 60);
				frame.getContentPane().add(btn3);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(textDisplay.getText());
						textDisplay.setText("");
						oper ="*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(198, 192, 60, 60);
				frame.getContentPane().add(btnMult);
				
				
				//----------------------- Row 4---------------
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textDisplay.getText() + btn0.getText();
						textDisplay.setText(EnterNumber );
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 316, 60, 60);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = textDisplay.getText() + btnDot.getText();
						textDisplay.setText(EnterNumber );
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(73, 316, 60, 60);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("\u00B1");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
						ops = ops * (-1);
						textDisplay.setText(String.valueOf(ops)); 
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(135, 316, 60, 60);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String answer;
						secondnum = Double.parseDouble(textDisplay.getText());
						if (oper == "+")
						{
							result = firstnum + secondnum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);
						}	
					
						else if (oper == "-")
						
						{
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);
						} 
						
						else if (oper == "*")
						{
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);
						}
						
						else if (oper == "/")
						{
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);
						}
						
						else if (oper == "%")
						{
							result = firstnum % secondnum;
							answer = String.format("%.2f", result);
							textDisplay.setText(answer);
						}
					}
				}
				
						);
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(198, 316, 60, 60);
				frame.getContentPane().add(btnEqual);
				
					//----------------------- top Row---------------
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(textDisplay.getText());
						textDisplay.setText("");
						oper ="/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(198, 254, 60, 60);
				frame.getContentPane().add(btnDiv);
				
				JButton btnCancle = new JButton("C");
				btnCancle.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						textDisplay.setText(null );
					}
				});
				btnCancle.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnCancle.setBounds(73,68 , 60, 60);
				frame.getContentPane().add(btnCancle);
				
				JButton btnAbs = new JButton("%");
				btnAbs.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(textDisplay.getText());
						textDisplay.setText("");
						oper ="% ";
					}
				});
				btnAbs.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnAbs.setBounds(135, 68, 60, 60);
				frame.getContentPane().add(btnAbs);
				
				JButton btnPlus = new JButton("+");
				btnPlus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(textDisplay.getText());
						textDisplay.setText("");
						oper ="+";
					}
				});
				btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPlus.setBounds(198, 68, 60, 60);
				frame.getContentPane().add(btnPlus);
		
		
		
		
		
	}
}
