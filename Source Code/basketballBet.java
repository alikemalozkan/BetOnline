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
public class basketballBet extends JPanel {

		public basketballBet() {
			
			setLayout(new GridLayout(7,1));
			
			JCheckBox nextGoalBet = new JCheckBox("Which Team Scores next:  ");
			JComboBox<String> nextGoalBetCB = new JComboBox<String>();
			nextGoalBetCB.insertItemAt("HOME", 0);
			nextGoalBetCB.insertItemAt("AWAY", 1);
			
			JCheckBox numberOfFoulsCB = new JCheckBox("Number of Fouls: ");
			JTextField numberOfFoulsTF = new JTextField();
			
	        JCheckBox guessMVP = new JCheckBox("Guess the MVP (enter player number): ");
	        JTextField guessMVPTF = new JTextField();
	        
	        
	        add(nextGoalBet);
	        add(nextGoalBetCB);
	        add(numberOfFoulsCB);
	        add(numberOfFoulsTF);
	        add(guessMVP);
	        add(guessMVPTF);
	        
		}
}
