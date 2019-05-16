import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class dailyAwards {

	private int CONFIGURATION_NO;
	static JFrame dailyPanel= new JFrame("DAILY AWARDS");
	static JButton exit = new JButton("Collect & Go Back");
	
	public dailyAwards(int CONFIGURATION_NO) {
		this.CONFIGURATION_NO = CONFIGURATION_NO;
	}
	public void main() {
		
		dailyPanel.setSize(500, 500);
		dailyPanel.setLocationRelativeTo(null);
		
		JLabel dailyGame = new JLabel();
		dailyGame.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/game.jpg"));
		
		JPanel npanel = new JPanel();
		JPanel cpanel = new JPanel();
		JPanel spanel = new JPanel();
		
		npanel.setBackground(Color.gray);
		cpanel.setBackground(Color.white);
		spanel.setBackground(Color.gray);
		
		cpanel.add(dailyGame);
		spanel.add(exit);
		
		dailyPanel.add(BorderLayout.NORTH, npanel);
		dailyPanel.add(BorderLayout.CENTER, cpanel);
		dailyPanel.add(BorderLayout.SOUTH, spanel);
		dailyPanel.setVisible(true);
		
		
		exit.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {	
			  JOptionPane.showMessageDialog(null, "Coins earned, check out tomorrow!");
			  dailyPanel.dispose();
		  }
		    
		});
	}
	
	
	
	public void loadLast(){
		dailyPanel.setVisible(true);
	}
	
}
