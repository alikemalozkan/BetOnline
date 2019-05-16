import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gifts {

	private int CONFIGURATION_NO;
	private int userCoins;
	

	public Gifts(int CONFIGURATION_NO, int userCoins) {
		this.CONFIGURATION_NO = CONFIGURATION_NO;
		this.userCoins = userCoins;
	}

	
static JFrame giftsPanel = new JFrame("GIFTS");
	
	public void main() {
		
		giftsPanel.setSize(400, 600);
		giftsPanel.setLocationRelativeTo(null);
		JButton ps4 = new JButton();
        ps4.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/ps4.jpg"));
               
        JButton galaxyTablet = new JButton();
        galaxyTablet.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/tablet.jpg"));
        
        JButton gift1 = new JButton();
        JButton gift2 = new JButton();
        
        JLabel userCoinLabel = new JLabel("Coins : "+userCoins);
		
		if (CONFIGURATION_NO == 1) {
			
			gift1.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/gift1.jpg"));
	        gift2.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/gift2.jpg"));
			
			
		}else if(CONFIGURATION_NO == 2) {
			
			gift1.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/gift1.jpg"));
	        gift2.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/gift2.jpg"));
	        
			
		}else if(CONFIGURATION_NO == 3) {
			
			gift1.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/gift1.jpg"));
	        gift2.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/gift2.jpg"));
			
		}
		
		JPanel npanel = new JPanel();
		JPanel cpanel = new JPanel();
		JPanel spanel = new JPanel();
		
		npanel.setBackground(Color.GRAY);
		cpanel.setBackground(Color.WHITE);
		spanel.setBackground(Color.GRAY);
		
		cpanel.setLayout(new GridLayout(4,2));
		
		cpanel.add(ps4);
		cpanel.add(galaxyTablet);
		cpanel.add(gift2);
		cpanel.add(gift1);
		spanel.add(userCoinLabel);
		giftsPanel.add(BorderLayout.NORTH, npanel);
		giftsPanel.add(BorderLayout.CENTER, cpanel);
		giftsPanel.add(BorderLayout.SOUTH, spanel);
		
		giftsPanel.setVisible(true);
		
		
		
		
		
		
	}



	public void loadLast(){
		giftsPanel.setVisible(true);
	}
}
