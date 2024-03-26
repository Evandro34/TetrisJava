package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame window = new JFrame("Simples Tetris");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		
		//Add GamePanel to the window
		
		GamePanel gp = new GamePanel();
		
		window.add(gp);
		window.pack();//ajusta o Gamepanel para tamanho da window;
		
		
		
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

}
