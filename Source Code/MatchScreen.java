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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class MatchScreen implements ListSelectionListener {
	
	private static int CONFIGURATION_NO;
	private static int userCoins;
	public MatchScreen (int CONFIGURATION_NO, int userCoins) {
		this.CONFIGURATION_NO = CONFIGURATION_NO;
		this.userCoins = userCoins;
	}
	
	
	
	static JFrame f = new JFrame("Matches");
	
	static JList list;
    static DefaultListModel listModel;
	static JButton placeBet = new JButton("Place Bet");
	static JButton exit = new JButton("Back");
	static JButton seeCoupon = new JButton("See Coupon");
	static JButton watchStream = new JButton("Watch Stream");
	static JPanel npanel = new JPanel();
	static JPanel cpanel = new JPanel();
	static JPanel spanel = new JPanel();
	
	
	public void main() throws IOException{
		

		Bet a = new Bet(CONFIGURATION_NO,null);
		
		
		f.setSize(800,650);
		f.setLocationRelativeTo(null);
		
		listModel = new DefaultListModel();
		listModel.addElement("MATCHES");
        list = new JList(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        list.setVisibleRowCount(20);
		createMatchList(CONFIGURATION_NO);
		npanel.setBackground(Color.GRAY);
		spanel.setBackground(Color.GRAY);
		cpanel.setBackground(Color.WHITE);
		cpanel.setBorder(new LineBorder((Color.BLACK),5));
	
		cpanel.setLayout(new GridLayout(1,1));
		cpanel.add(list);
		
		
		if (CONFIGURATION_NO == 3) {
			npanel.add(watchStream);
		}
		npanel.add(placeBet);
		spanel.add(exit);
		spanel.add(seeCoupon);
		
		f.add(BorderLayout.NORTH,npanel);
		f.add(BorderLayout.SOUTH,spanel);
		f.add(BorderLayout.CENTER,cpanel);
		f.setVisible(true);
		
		
		exit.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  f.setVisible(false);
			  
		  }
		});
		placeBet.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
				 String matchInfo = (String) list.getSelectedValue();
				 a.setMatchInfo(matchInfo);
				 a.main();
			 
		  }
		});
		
		seeCoupon.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			 
			  int coinsPlaced = Integer.parseInt(JOptionPane.showInputDialog(null, Bet.getCouponInfo()+"\nHow much do you want to bet:"));
			  if(CONFIGURATION_NO !=1) {
				  if(a.getBetCounter() <3) {
					  JOptionPane.showMessageDialog(null,"You need at least 3 matches to complete coupon");
				  }
			  }
			  if(coinsPlaced > userCoins) {
				  JOptionPane.showMessageDialog(null,"Insufficient coins");
			  }
			  if(coinsPlaced < 10) {
				  JOptionPane.showMessageDialog(null,"Minimum bet is 10 coins");
			  }
		  }
		});
		
		watchStream.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			 JFrame streamPanel = new JFrame((String)list.getSelectedValue());
			 streamPanel.setSize(700, 500);
			 JLabel streamIcon = new JLabel();
			 streamIcon.setIcon(new ImageIcon("images"+CONFIGURATION_NO+"/stream.gif"));
			 
			 streamPanel.add(streamIcon);
			 streamPanel.setVisible(true);
			  
		  }
		});
		
		
	}
	public void loadLast(){
		f.setVisible(true);
	}

@Override
public void valueChanged(ListSelectionEvent arg0) {
	
	
}
public static void createMatchList(int CONFIGURATION_NO) throws IOException{
	int index=0;
	String fileName = null;
	if(CONFIGURATION_NO==1) fileName ="files/football.txt";
	if(CONFIGURATION_NO==2) fileName ="files/basketball.txt";
	if(CONFIGURATION_NO==3) fileName ="files/esport.txt";
		
	File file = new File(fileName);
	BufferedReader in = new BufferedReader(new FileReader(file));
	listModel.clear();
	
	while(true){
    	String line = in.readLine();
    	
    	if(line == null){
    		break;
    	}
	
	listModel.insertElementAt(line,index);
	}
	
	in.close();
}
}
