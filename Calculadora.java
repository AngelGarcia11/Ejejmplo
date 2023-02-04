import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btn7, btn8, btn9, borrar, btn4, btn5, btn6, suma, btn1, btn2, btn3, resta;
	private JLabel label;
	
	public Calculadora() {
		setLayout(null);
		
		btn7 = new JButton("7");
		btn7.setBounds(10,100,80,60);
		add(btn7);
		btn7.addActionListener(this);
		
		btn8 = new JButton("8");
		btn8.setBounds(100,100,80,60);
		add(btn8);
		btn8.addActionListener(this);
		
		btn9 = new JButton("9");
		btn9.setBounds(190,100,80,60);
		add(btn9);
		btn9.addActionListener(this);
		
		borrar = new JButton("Borrar");
		borrar.setBounds(280,100,80,60);
		add(borrar);
		borrar.addActionListener(this);
		
		btn4 = new JButton("4");
		btn4.setBounds(10,180,80,60);
		add(btn4);
		btn4.addActionListener(this);
		
		btn5 = new JButton("5");
		btn5.setBounds(100,180,80,60);
		add(btn5);
		btn5.addActionListener(this);
		
		btn6 = new JButton("6");
		btn6.setBounds(190,180,80,60);
		add(btn6);
		btn6.addActionListener(this);
		
		suma = new JButton("+");
		suma.setBounds(280,180,80,60);
		add(suma);
		suma.addActionListener(this);
		
		btn1 = new JButton("1");
		btn1.setBounds(10,260,80,60);
		add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setBounds(100,260,80,60);
		add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setBounds(190,260,80,60);
		add(btn3);
		btn3.addActionListener(this);
		
		resta = new JButton("-");
		resta.setBounds(280,260,80,60);
		add(resta);
		resta.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn7) {
		}
	}
	public static void main(String[] args) {
		Calculadora f = new Calculadora();
		f.setBounds(0,0,385,600);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
	}
}
