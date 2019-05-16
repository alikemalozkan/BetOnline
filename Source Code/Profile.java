import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;



public class Profile {
	private String userCoins;
	
	
	public Profile(String userCoins) {
		this.userCoins = userCoins;
	}

static JFrame profilePanel = new JFrame("Profile");
static JButton changeID = new JButton("Change ID");
static JButton changePassword = new JButton("Change Password");
static JButton changeMail = new JButton("Change E-Mail");

	public void main() {
		
		profilePanel.setSize(250, 350);
		profilePanel.setLocationRelativeTo(null);
		
		JPanel npanel = new JPanel();
		JPanel cpanel = new JPanel();
		JPanel spanel = new JPanel();
		
		npanel.setBackground(Color.GRAY);
		cpanel.setBackground(Color.WHITE);
		spanel.setBackground(Color.GRAY);
		
		
		
		JLabel userID = new JLabel("UserID : emre");
		JLabel coinsLabel = new JLabel("Coins : "+userCoins);
		JLabel mail = new JLabel("User Mail : emre@gmail.com");
		
		cpanel.setLayout(new GridLayout(6,2));
		cpanel.add(BorderLayout.NORTH,userID);
		cpanel.add(BorderLayout.WEST,coinsLabel);
		cpanel.add(BorderLayout.EAST,mail);
		cpanel.add(changeID);
        cpanel.add(changePassword);
        cpanel.add(changeMail);
		
		
		
		profilePanel.add(BorderLayout.NORTH,npanel);
		profilePanel.add(BorderLayout.CENTER,cpanel);
		profilePanel.add(BorderLayout.SOUTH,spanel);
		profilePanel.setVisible(true);
		
		changeID.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, Bet.getCouponInfo()+"\nEnter New ID : ");

			}
		});
		changePassword.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, Bet.getCouponInfo()+"\nEnter New Password : ");
			}
		});
		changeMail.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, Bet.getCouponInfo()+"\nEnter New E-Mail : ");

			}
		});
	
		
	}
	public void loadLast(){
		profilePanel.setVisible(true);
	}
	

}





