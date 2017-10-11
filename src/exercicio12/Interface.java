package exercicio12;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Interface extends JFrame{
	JLabel lbldolar = new JLabel("Dolar");
	JLabel lblreais = new JLabel("Reais");
	JTextField txtdolar = new JTextField();
	JTextField txtreais = new JTextField();

	

	JButton btnCalculo = new JButton("Calcular");
	
		double reais;
	
	public Interface(){
		Calculo calc = new Calculo();
		
	Container paine = this.getContentPane();
	
	paine.add(lblreais); // label
	lblreais.setBounds(20,20,245,40);
	
	paine.add(txtreais);// caixa
	txtreais.setBounds(80,30,140,20);
	
	paine.add(lbldolar);// label
	lbldolar.setBounds(20,100,245,40);
	
	paine.add(txtdolar);// caixa
	txtdolar.setBounds(80,110,140,20);
	

	
	paine.add(btnCalculo);
	btnCalculo.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent e){
			 reais = Double.parseDouble(txtreais.getText());
			 txtdolar.setText("" + calc.conversao(reais));
		 }
	 });
	btnCalculo.setBounds(90,400,100,40);
	
	txtdolar.setEditable(false);
	this.setLayout(null);
	this.setVisible(true);
	this.setSize(350, 600);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}

public static void main(String args[]){
	Interface inte = new Interface();
}
}
