package com.ssaurel.mytetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame{
	
	private JLabel statusBar;
	
	public Tetris() {
		statusBar = new JLabel("0"); // to display lines number :)
		add(statusBar, BorderLayout.SOUTH);
		Board board = new Board(this);
		add(board);
		// line down start
		board.start();
		
		// add one piece
		board.newPiece();
		board.repaint();
		
		setSize(200,400);
		setTitle("JunFe's Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JLabel getStatusBar() {
		return statusBar;
	}
	
	public static void main(String[] args) {
		Tetris myTetris = new Tetris();
		myTetris.setLocationRelativeTo(null); // Center
		myTetris.setVisible(true);
		// now we can check our tetris board with one piece but no interaction...
		// in part 2 we are going to add lines down !!
		
		// we can try lines down on my tetris now ! - end of step 2
		// in step 3 we will add interactions to play!
	}
}
