package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("������");
		JButton button = new JButton();
		button.setText("���� ��ư");
		button.setBackground(Color.RED);
		
		frame.add(button);
//		frame.setBounds(200, 200, 200, 200);
		frame.setSize(200, 200);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ���� ������ â�� �������� �ý����� ������� �ʴ´�.
		
		frame.setVisible(true);
	}
}