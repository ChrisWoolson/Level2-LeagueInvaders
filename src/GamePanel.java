import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer time;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
GameObject object;
	public GamePanel() {
		time = new Timer(1000 / 60, this);

	}

	public void startGame() {
		time.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();
		if(currentState == MENU_STATE) {
			updateMenuState();
		}else
			
			if(currentState == GAME_STATE) {
				updateGameState();
			}else
			
				if(currentState == END_STATE) {
					updateEndState();
				}
			
			
			
			
			
			
			
	}

	@Override

	public void paintComponent(Graphics g) {
		if(currentState == MENU_STATE) {
			drawMenuState(g);
		}else
			
			if(currentState == GAME_STATE) {
				drawGameState(g);
			}else
			
				if(currentState == END_STATE) {
					drawEndState(g);
				}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("type");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
		}
		System.out.println("press");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("release");
	}

	
	void updateMenuState(){
		
	}
	void updateGameState() {
		
	}
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g){
		g.setColor(Color.BLUE);

		g.fillRect(0, 0,  LeagueInvaders.width, LeagueInvaders.height);  
	}
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0,  LeagueInvaders.width, LeagueInvaders.height);  
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0,  LeagueInvaders.width, LeagueInvaders.height);  
	}
	
	
}
