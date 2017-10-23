/**
 * 
 */
package map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**Creates formatted maps.
 * @author rafaelzingle
 *
 */
public class MapModel {
	String[][] points;
	Random random = new Random();
	Scanner mapReader;
	Scanner lineReader;
	
	/**Turns a text file into a formated map.
	 * 
	 * @param fileName the name of the map
	 * @throws FileNotFoundException if the map does not exist
	 */
	public MapModel(String fileName) throws FileNotFoundException{
		mapReader = new Scanner(new FileInputStream(fileName));
		points = new String[getMapSize(fileName)][getMapSize(fileName)];
		int idx = 0;
		while (mapReader.hasNextLine()) {
			readLine(mapReader.nextLine(), idx);
			idx++;
		}
		//printMap();
	}
 
	/**Creates a randomized map. The user may choose the size of the map.
	 * 
	 * @param size the size of the map
	 */
	public MapModel(int size) {
		int next = 0;
		points = new String[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				next = random.nextInt(1001);
				if (next > 300) {
					points[i][j] = "   ";
				} else {
					points[i][j] = "[#]";
				}
				if (next > 390 && next < 400){
					points[i][j] = " x ";
				}
			}
		}
	}
	
	/**Prints out the map.
	 * 
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
		return map; 
	}

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		MapModel map = new MapModel(30);
		map.printMap();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		MapModel map2 = new MapModel("maps/two_rooms.txt");
		System.out.println(map2.printMap()); 
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		MapModel map3 = new MapModel("maps/forest.txt");
		System.out.println(map3.printMap());
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		MapModel map4 = new MapModel("maps/cave_entrance.txt");
		System.out.println(map4.printMap());
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
		MapModel map5 = new MapModel("maps/bridge_map.txt");
		System.out.println(map5.printMap());
	}
	
	/**Checks the text file to find the size of the map.
	 * 
	 * @param fileName the name of the map
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
	
	/**A helper method to help format the map. Formats a single row
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

}
