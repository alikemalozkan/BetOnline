import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Settings {
	

static JFrame settingsPanel = new JFrame("Settings");

	public void main() {
		
		settingsPanel.setSize(250, 350);
		settingsPanel.setLocationRelativeTo(null);
		
		JPanel npanel = new JPanel();
		JPanel cpanel = new JPanel();
		JPanel spanel = new JPanel();
		
		npanel.setBackground(Color.GRAY);
		cpanel.setBackground(Color.WHITE);
		spanel.setBackground(Color.GRAY);
		
		JCheckBox soundFX = new JCheckBox("Sound FX");
		JComboBox<String> fontSize = new JComboBox<String>();
		JComboBox<String> backgroundColor = new JComboBox<String>();
		
		JLabel fontSizeLabel = new JLabel("Font Size:");
		
		fontSize.insertItemAt("10", 0);
		fontSize.insertItemAt("12", 1);
		fontSize.insertItemAt("14", 2);
		fontSize.insertItemAt("16", 3);
		fontSize.insertItemAt("18", 4);
		fontSize.setSelectedIndex(2);
		
		JLabel backgroundColorLabel = new JLabel("Background Color");
		
		backgroundColor.insertItemAt("Black", 0);
		backgroundColor.insertItemAt("Blue", 1);
		backgroundColor.insertItemAt("Gray", 2);
		backgroundColor.insertItemAt("Green", 3);
		backgroundColor.insertItemAt("White", 4);
		backgroundColor.setSelectedIndex(2);
		
		cpanel.setLayout(new GridLayout(5,1));
		cpanel.add(soundFX);
		cpanel.add(fontSizeLabel);
		cpanel.add(fontSize);
		cpanel.add(backgroundColorLabel);
		cpanel.add(backgroundColor);
		
		
		settingsPanel.add(BorderLayout.NORTH,npanel);
		settingsPanel.add(BorderLayout.CENTER,cpanel);
		settingsPanel.add(BorderLayout.SOUTH,spanel);
		settingsPanel.setVisible(true);
		
		
		
	}
	public void loadLast(){
		settingsPanel.setVisible(true);
	}
	

}
