import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Main {

	static int CONFIGURATION_NO=3;
	
	static JFrame f = new JFrame("BetOnline - Football");
	static JButton exit = new JButton();
	static JButton settings = new JButton();
	static JButton bet = new JButton();
	static JButton profile = new JButton();
	static JButton gifts = new JButton();
	static JButton buycoins = new JButton();
	static JButton dailyAwards = new JButton();
	static int hesapOpened=0;
	static int matchScreenOpened=0;
	static int profileScreenOpened=0;
	static int settingScreenOpened=0;
	static int giftsScreenOpened=0;
	static int buyCoinsScreenOpened=0;
	static int dailyAwardsScreenOpened=0;
	
	static JLabel topic = new JLabel();
			
	static JPanel npanel = new JPanel();
	static JPanel cpanel = new JPanel();
	static JPanel spanel = new JPanel();
	static JPanel buttonPanel = new JPanel();
	
public static void main(String[]args) throws Exception{
	
		
		f.setSize(800,550);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		
		
		npanel.setBackground(Color.GRAY);
		spanel.setBackground(Color.GRAY);
		cpanel.setBackground(Color.GRAY);
		
		
		JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/background.jpg"));
        
        if(CONFIGURATION_NO == 1) topic.setText("BetONLINE - Football"); 
        if(CONFIGURATION_NO == 2) topic.setText("BetONLINE - Basketball"); 
        if(CONFIGURATION_NO == 3) topic.setText("BetONLINE - E-Sport"); 
		
    
        
        
        
        npanel.add(topic);
		
		spanel.add(buttonPanel);
		cpanel.add(BorderLayout.CENTER,logo);
		
		buttonPanel.setLayout(new GridLayout(7,1));
		
		
		bet.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/bet.jpg"));
		bet.setBackground(Color.GRAY);
		settings.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/settings.jpg"));
		settings.setBackground(Color.GRAY);
		exit.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/exit.jpg"));
		exit.setBackground(Color.GRAY);
		profile.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/profile.jpg"));
		profile.setBackground(Color.GRAY);
		buycoins.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/buycoins.jpg"));
		buycoins.setBackground(Color.GRAY);
		gifts.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/gifts.jpg"));
		gifts.setBackground(Color.GRAY);
		dailyAwards.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/daily.jpg"));
		dailyAwards.setBackground(Color.GRAY);
		
		buttonPanel.add(bet);
		buttonPanel.add(profile);
		buttonPanel.add(buycoins);
		buttonPanel.add(gifts);
		buttonPanel.add(dailyAwards);
		buttonPanel.add(settings);
		buttonPanel.add(exit);
		
		
		f.add(BorderLayout.NORTH,npanel);
		f.add(BorderLayout.EAST,spanel);
		f.add(BorderLayout.CENTER,cpanel);
		f.setVisible(true);
		
		
		bet.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {	  
		    MatchScreen openMatchScreen = new MatchScreen(CONFIGURATION_NO, 1500);
		    if(matchScreenOpened == 0){
		    try {
				openMatchScreen.main();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    matchScreenOpened++;
		    }else if(matchScreenOpened>0){
		    	openMatchScreen.loadLast();
		    }
		  }
		});
		
		
		settings.addActionListener(new ActionListener()
			{	
				public void actionPerformed(ActionEvent e) {
					
					Settings settingPanel = new Settings();
					if(settingScreenOpened == 0) {
					settingPanel.main();
					settingScreenOpened++;
					}else if(settingScreenOpened>0) {
						settingPanel.loadLast();
					}
			
				}
			});
		
		profile.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				
				Profile profilePanel = new Profile("1500");
				if(profileScreenOpened == 0) {
					profilePanel.main();
				profileScreenOpened++;
				}else if(profileScreenOpened>0) {
					profilePanel.loadLast();
				}
			}
		});
		
		gifts.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				
				Gifts giftPanel = new Gifts(CONFIGURATION_NO, 1500);
				if(giftsScreenOpened == 0) {
					giftPanel.main();
				giftsScreenOpened++;
				}else if(giftsScreenOpened>0) {
					giftPanel.loadLast();
				}
			}
		});
		
		buycoins.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent e) {
				
				String[] coinNumber = {"500", "1000+100", "1500+150 (%10 free)", "2000+200 (%10 free)", "2500+250 (%10 free)", "3000+500 (Best Deal)"};
		        
		        JOptionPane.showInputDialog(null, "CHOOSE COIN QUANTITY", "BUY COINS", JOptionPane.QUESTION_MESSAGE,null, coinNumber, coinNumber[0]);
			}
		});
	
		dailyAwards.addActionListener(new ActionListener()
		{	
		public void actionPerformed(ActionEvent e) {
			
			dailyAwards dailyPanel = new dailyAwards(CONFIGURATION_NO);
			if(dailyAwardsScreenOpened == 0) {
				dailyPanel.main();
				dailyAwardsScreenOpened++;
			}else if(dailyAwardsScreenOpened>0) {
				dailyPanel.loadLast();
			}
		}
		});
		
	
		exit.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  System.exit(0);
		  }
		});
	
	}
}
