package br.com.senaitagua.sa1.app4;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double din,client;
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo empresarial");
		
		din = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do prêmio a ser dividido"));
		client = Double.parseDouble(JOptionPane.showInputDialog("digite o número de clientes especiais"));
		
		ClientesBO valor = new ClientesBO();
		
		JOptionPane.showMessageDialog(null, "Valor a receber por cada Cliente Especial: R$ " + valor.dividir(din, client));

	}

}
