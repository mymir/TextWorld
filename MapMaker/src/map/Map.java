package map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Map {
	String[][] points;
	Random random = new Random();
	Scanner mapReader;
	Scanner lineReader;
	int[] location;
	
	/**Creates a new map object.
	 * 
	 */
	public Map(){
		//Empty constructor 
	}
	
	/**Reads a file and prepares it for printing.
	 * @param fileName the text file containing
	 * the map information
	 */
	public void readFile(String fileName) throws FileNotFoundException{
		mapReader = new Scanner(new FileInputStream(fileName));
		points = new String[getMapSize(fileName)][getMapSize(fileName)];
		int idx = 0;
		while (mapReader.hasNextLine()) {
			readLine(mapReader.nextLine(), idx);
			idx++;
		}
	}
	
	/**A helper method to help read the file and
	 * format the map. Formats a single row
	 * in the map and returns it.
	 * 
	 * @param line the line being formated
	 * @param int determines where the row belongs in the map
	 */
	public void readLine(String line, int row) {
		Scanner lineReader = new Scanner(line); 
		lineReader.useDelimiter("");
		String  s;
		int i = 0;
		while (lineReader.hasNext()) {
			s = lineReader.next();
			if (s.equals("@")) {
				points[row][i] = "   ";
			} else if (s.equals("#")){
				points[row][i] = "[" + "#" + "]";
			} else if (s.equals("_")){
				points[row][i] = "_" + "_" + "_";
			} else if (s.equals("-")){
				points[row][i] = "-" + "-" + "-";
			} else {
				points[row][i] = " " + s + " ";
			}	
			i++;
		}
		lineReader.close();
	}
	
	/**Prints out the map.
	 * 
	 * @return map the string representation of
	 * the map
	 */
	public String printMap() {
		String map = "";
		String row = "";
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				row = row + points[i][j];
			}
			map += row + "\n";
			row = "";
		}
		map = map.substring(0,map.length()).trim();
		return map; 
	}
	
	/**Sets up the map by initializing points and
	 * reading the file.
	 * 
	 * @param fileName the text file containing
	 * the map information
	 */
	public void setMap(String fileName) {
		try {
			readFile(fileName);
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("Invalid file.");
		}
		setStart();
	}
	
	/**Returns a 2D string array containing the locations
	 * on the map. This method is used to display the map
	 * in a table in the GUI.
	 * 
	 * @return points the 2D array containing the locations
	 * on the map
	 */
	public String[][] getMap() {
		return points;
	}
	
	/**Checks the text file to find the size of the map.
	 * 
	 * @param fileName the text file containing
	 * the map information
	 * @throws FileNotFoundException if the map does not exist
	 */
	public int getMapSize(String fileName) throws FileNotFoundException {
		try {
			Scanner mapCounter = new Scanner(new FileInputStream(fileName));
			int mapSize = 0;
			while (mapCounter.hasNextLine()) {
				mapSize++;
				mapCounter.nextLine();
			}
			mapCounter.close();
			return mapSize;
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Error: Invalid Map File!");
		}
	}
	
	/**Puts the player on the map and returns
	 * the index of their starting location.
	 * 
	 * @return location the index where the 
	 * player starts
	 */
	public int[] setStart() {
		location = new int[2];
		location[0] = 0;
		location[1] = 0;
		int i = 0;
		int j = 0;
		for (String[] row: points) {
			for (String s: row) {
				if (s.equals("   ")) {
					location[0] = i;
					location[1] = j;
					points[i][j] = "[o]";
					return location;
				}
				j++;
			}
			j = 0;
			i++;
		}
		return location;
	}
	
	/**Moves the character token left.
	 * 
	 */
	public void goRight() {
		int vertical = location[0];
		int horizontal = location[1];
		if (horizontal == points.length - 1){
			//Do nothing
		} else {
			int left = location[1] + 1;
			if (points[vertical][left].equals("   ")) {
				points[vertical][horizontal] = "   ";
				points[vertical][left] = "[o]";
				location[1] = left;
			}
		}
	}
	
	/**Moves the character token right.
	 * 
	 */
	public void goLeft() {
		int vertical = location[0];
		int horizontal = location[1];
		if (horizontal == 0){
			//Do nothing
		} else {
			int right = location[1] - 1;
			if (points[vertical][right].equals("   ")) {
				points[vertical][horizontal] = "   ";
				points[vertical][right] = "[o]";
				location[1] = right; 
			}
		}
	}
	
	/**Moves the character token up.
	 * 
	 */
	public void goUp() {
		int vertical = location[0];
		int horizontal = location[1];
		if (vertical == 0){
			//Do nothing
		} else {
			int up = location[0] - 1;
			if (points[up][horizontal].equals("   ")) {
				points[vertical][horizontal] = "   ";
				points[up][horizontal] = "[o]";
				location[0] = up; 
			}
		}
	}
	
	/**Moves the character token down.
	 * 
	 */
	public void goDown() {
		int vertical = location[0];
		int horizontal = location[1];
		if (vertical == points.length - 1){
			//Do nothing
		} else {
			int down = location[0] + 1;
			if (points[down][horizontal].equals("   ")) {
				points[vertical][horizontal] = "   ";
				points[down][horizontal] = "[o]";
				location[0] = down; 
			}
		}
	}
	
	public String checkLocation() {
		if (location[0] == 0 || location[1] == 0 || location[0] == points.length - 1 
				|| location[1] == points.length - 1) {
			return null;
		}
		if (points[location[0] + 1][location[1]].equals(" x ") || 
				points[location[0]][location[1] + 1].equals(" x ") ||
				points[location[0] - 1][location[1]].equals(" x ") ||
				points[location[0]][location[1] - 1].equals(" x ")) {
			return "An Enemy!";
		} 
		if (points[location[0] + 1][location[1]].equals(" ? ") || 
				points[location[0]][location[1] + 1].equals(" ? ") ||
				points[location[0] - 1][location[1]].equals(" ? ") ||
				points[location[0]][location[1] - 1].equals(" ? ")) {
			return "A quest item!";
		} 
		return null;
	}
}
