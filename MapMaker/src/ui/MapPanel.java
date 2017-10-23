/**
 * 
 */
package ui;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.AbstractTableModel;

import map.Map;
import map.MapModel;

/**
 * @author Rafael Zingle
 *
 */
public class MapPanel extends JFrame implements ActionListener{
	/** The serial version UID. */
	private static final long serialVersionUID = 1L;
	/** The width of the window. */
	private static final int WINDOW_WIDTH = 1000;
	/** The height of the window. */
	private static final  int WINDOW_HEIGHT = 6000;
	/** The main panel. */
	private static JPanel mainPanel;
	/** The secondary panel. */
	private static JPanel secondaryPanel;
	/** A table displaying the current map. */
	private static JTable mapDisplay;
	/** A drop-down map menu*/
	private static JComboBox<String> mapMenu;
	/** The left button. */
	private static JButton left;
	/** The right button. */
	private static JButton right;
	/** The up button. */
	private static JButton up;
	/** The down button. */
	private static JButton down;
	/** The map object. */
	private Map map;
	/** A model to format the table. */
	private TableModel model;
	
	/**Sets up the panel.
	 * 
	 */
	public MapPanel() {
		Container contentPane = getContentPane(); 
		
		mainPanel = new JPanel();
		mainPanel.setVisible(true);
		
		secondaryPanel = new JPanel(new GridLayout(3, 3));
		
		map = new Map();
		
		model = new TableModel();
		model.setData("maps/forest.txt");
		
		mapMenu = new JComboBox<String>();
		mapMenu.addItem("maps/forest.txt");
		mapMenu.addItem("maps/cave_entrance.txt");
		mapMenu.addItem("maps/bridge_map.txt");
		mapMenu.addItem("maps/two_rooms.txt"); 
		mapMenu.addActionListener(this);
		mapMenu.setVisible(true);
		
		mapDisplay = new JTable();
		mapDisplay.setVisible(true);
		mapDisplay.setRowMargin(0);
		mapDisplay.setModel(model);
		for (int i = 0; i < mapDisplay.getColumnCount(); i ++) {
			mapDisplay.getColumnModel().getColumn(i).setMaxWidth(19);
		}
		
		left = new JButton();
		left.setText("Left");
		left.addActionListener(this);
		left.setVisible(true);
		
		right = new JButton();
		right.setText("Right");
		right.addActionListener(this);
		right.setVisible(true);
		
		up = new JButton();
		up.setText("Up");
		up.addActionListener(this);
		up.setVisible(true);
		
		down = new JButton();
		down.setText("Down");
		down.addActionListener(this);
		down.setVisible(true);
		
		secondaryPanel.add(left);
		secondaryPanel.add(right);
		secondaryPanel.add(up);
		secondaryPanel.add(down);
		secondaryPanel.setVisible(true);
		
		mainPanel.add(mapMenu);
		mainPanel.add(mapDisplay, up);
		mainPanel.add(secondaryPanel, down);
		contentPane.add(mainPanel);
		contentPane.setVisible(true);
		
		setTitle("Map Model");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocation(450, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MapPanel pane = new MapPanel(); 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mapMenu) {
			model.setData((String) mapMenu.getSelectedItem());
			model.fireTableDataChanged();
		}
		if (e.getSource() == left) {
			model.left();
			model.fireTableDataChanged();
		}
		if (e.getSource() == right) {
			model.right();
			model.fireTableDataChanged();
		}
		if (e.getSource() == up) {
			model.up();
			model.fireTableDataChanged();
		}
		if (e.getSource() == down) {
			model.down();
			model.fireTableDataChanged();
		}
	}
	
	private class TableModel extends AbstractTableModel {
		/** The serial version UID. */
		private static final long serialVersionUID = 1L;
		/** The data for the map. */
		private String[][] data;
		/** The header for the table. */
		private String[]header;
		
		public TableModel() {
			//Empty constructor 
		}
		
		@Override
		public int getRowCount() {
			return data.length;
		}

		@Override
		public int getColumnCount() {
			return header.length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			if (data[rowIndex][columnIndex] == null) {
				return " ";
			}
			return data[rowIndex][columnIndex];
		}
		
		public void setData(String fileName) {
			map.setMap(fileName);
			data = map.getMap();
			header = new String[data.length];
			for (int i = 0; i < header.length; i++) {
				header[i] = "";
			}
		}
		
		public void left() {
			map.goLeft();
			data = map.getMap();
			header = new String[data.length];
			for (int i = 0; i < header.length; i++) {
				header[i] = "";
			}
			if (map.checkLocation() == null) {
				// Do nothing
			} else {
				JPanel info = new JPanel();
				JOptionPane.showMessageDialog(info, map.checkLocation());
			}
		}
		
		public void right() {
			map.goRight();
			data = map.getMap();
			header = new String[data.length];
			for (int i = 0; i < header.length; i++) {
				header[i] = "";
			}
			if (map.checkLocation() == null) {
				// Do nothing
			} else {
				JPanel info = new JPanel();
				JOptionPane.showMessageDialog(info, map.checkLocation());
			}
		}
		
		public void up() {
			map.goUp();
			data = map.getMap();
			header = new String[data.length];
			for (int i = 0; i < header.length; i++) {
				header[i] = "";
			}
			if (map.checkLocation() == null) {
				// Do nothing
			} else {
				JPanel info = new JPanel();
				JOptionPane.showMessageDialog(info, map.checkLocation());
			}
		}
		
		public void down() {
			map.goDown();
			data = map.getMap();
			header = new String[data.length];
			for (int i = 0; i < header.length; i++) {
				header[i] = "";
			}
			if (map.checkLocation() == null) {
				// Do nothing
			} else {
				JPanel info = new JPanel();
				JOptionPane.showMessageDialog(info, map.checkLocation());
			}
		}
		
	}

}
