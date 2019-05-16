import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class Bet {

		private int placedCoin;
		private boolean betResult;
		private String matchInfo;
		private int CONFIGURATION_NO;
		static JFrame betScreen = new JFrame("Place Bet");
		static JPanel npanel = new JPanel();
		static JPanel cpanel = new JPanel();
		static JPanel cpanel1 = new JPanel();
		static JPanel cpanel2 = new JPanel();
		static JPanel spanel = new JPanel();
		static JLabel matchInfoLabel = new JLabel();
		static JButton placeBet = new JButton("Bet");
		static JButton goBack = new JButton("Back");
		static String couponInfo = "";
		static int betCounter;
		
		public Bet(int CONFIGURATION_NO, String matchInfo) {
			this.matchInfo = matchInfo;
			this.CONFIGURATION_NO = CONFIGURATION_NO;
		}
		
		public void main() {
			
			betScreen.setSize(400,600);
			betScreen.setLocationRelativeTo(null);
			
			
			matchInfoLabel.setText(matchInfo);
			cpanel.setLayout(new GridLayout(2,1));
			cpanel1.setLayout(new GridLayout(7,1));
			cpanel1.add(matchInfoLabel);
			
			JCheckBox scoreBet = new JCheckBox("Guess the score: ");
			JCheckBox teamBet = new JCheckBox("Which team will win:  ");
	        JCheckBox playerBet = new JCheckBox("Player scores first (Enter Player Number): ");
	        JComboBox<String> teamBetCB = new JComboBox<String>();
	        
	        JTextField scoreBetPanelHome = new JTextField();
	        JLabel scoreBetPanelHomeLabel = new JLabel("Home :");
	        JLabel scoreBetPanelAwayLabel = new JLabel("Away :");
	        JTextField scoreBetPanelAway = new JTextField();
	        JPanel scoreBetPanel = new JPanel();
	        scoreBetPanel.setLayout(new GridLayout(1,4));
	        scoreBetPanel.add(scoreBetPanelHomeLabel);
	        scoreBetPanel.add(scoreBetPanelHome);
	        scoreBetPanel.add(scoreBetPanelAwayLabel);
	        scoreBetPanel.add(scoreBetPanelAway);
	        
	        teamBetCB.insertItemAt("HOME", 0);
			teamBetCB.insertItemAt("AWAY", 1);
			
			JTextField playerBetNumber = new JTextField();
	        
			cpanel1.add(scoreBet);
			cpanel1.add(scoreBetPanel);
	        cpanel1.add(teamBet);
	        cpanel1.add(teamBetCB);
	        cpanel1.add(playerBet);
	        cpanel1.add(playerBetNumber);
	        
	        cpanel2.setLayout(new GridLayout(1,1));
	        
			if(CONFIGURATION_NO == 1) {
				footballBet fBet = new footballBet();
				cpanel2.add(fBet);
			}
			if(CONFIGURATION_NO == 2) {
				basketballBet bBet = new basketballBet();
				cpanel2.add(bBet);
			}
			if(CONFIGURATION_NO == 3) {
				esportBet eBet = new esportBet();
				cpanel2.add(eBet);
			}
			
			
			npanel.setBackground(Color.LIGHT_GRAY);
			cpanel.setBackground(Color.WHITE);
			spanel.setBackground(Color.LIGHT_GRAY);
			
			
			
			cpanel.add(cpanel1);
			cpanel.add(cpanel2);
			
			spanel.add(goBack);
			spanel.add(placeBet);
			
			betScreen.add(BorderLayout.NORTH,npanel);
			betScreen.add(BorderLayout.CENTER,cpanel);
			betScreen.add(BorderLayout.SOUTH,spanel);
			betScreen.setVisible(true);
			betScreen.setDefaultCloseOperation(betScreen.DO_NOTHING_ON_CLOSE);
			
			
			
			goBack.addActionListener(new ActionListener()
			{
			  public void actionPerformed(ActionEvent e)
			  {
				  
				  cpanel.removeAll();
				  betScreen.dispose();
				  
			  }
			});
			
			placeBet.addActionListener(new ActionListener()
			{
			  public void actionPerformed(ActionEvent e)
			  {
				  
				  cpanel.removeAll();
				  cpanel1.removeAll();
				  cpanel2.removeAll();
				  betScreen.dispose();
				  JOptionPane.showMessageDialog(null,"Bet Added to Coupon");
				  String tempCoupon[] = matchInfo.split("-");
				  couponInfo = couponInfo + tempCoupon[0] +" - "+ tempCoupon[1]+"\n";
				  betCounter++;
				  
			  }
			});
			
			
		}
		public void setMatchInfo(String matchInfo) {
			this.matchInfo = matchInfo;
		}
		
		public static String getCouponInfo() {
			return couponInfo;
		}
		
		public int getBetCounter() {
			return betCounter;
		}
		
		
		public void loadLast(){
			betScreen.setVisible(true);
		}
}
