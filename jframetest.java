package br.com.jonas

import javax.swing.JFrame;  // inclui, da biblioteca swing, apenas JFrame

public class jframetest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Este e' um teste");
		frame.setSize(300, 300);
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}