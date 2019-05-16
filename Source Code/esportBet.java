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
public class esportBet extends JPanel {

		public esportBet() {
			
			setLayout(new GridLayout(7,1));
			
			JCheckBox nextMap = new JCheckBox("Guess the next map (only for CS:GO): ");
			JComboBox<String> nextMapCB = new JComboBox<String>();
			nextMapCB.insertItemAt("DUST", 0);
			nextMapCB.insertItemAt("DUST 2", 1);
			nextMapCB.insertItemAt("INFERNO", 2);
			nextMapCB.insertItemAt("OFFICE", 3);
			nextMapCB.insertItemAt("NUKE", 4);
			nextMapCB.insertItemAt("ASSAULT", 5);
			
			JCheckBox guessMVP = new JCheckBox("Guess the MVP (enter player nick): ");
			JTextField guessMVPTF = new JTextField();
			
	        JCheckBox guessFB = new JCheckBox("Guess the first Blood: ");
	        JComboBox<String> guessFBTF = new JComboBox<String>();
	        guessFBTF.insertItemAt("LEFT TEAM", 0);
	        guessFBTF.insertItemAt("RIGHT TEAM", 0);
	        
	        add(nextMap);
	        add(nextMapCB);
	        add(guessMVP);
	        add(guessMVPTF);
	        add(guessFB);
	        add(guessFBTF);
	        
		}
}
