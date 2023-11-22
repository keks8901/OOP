package classes;
import java.util.ArrayList;
//class of moduls
public class UniversityResources {
	//all the attributes for the class
	private static ArrayList<Object> assistants = new ArrayList<Object>();
	
	private static ArrayList<Object> rooms = new ArrayList<Object>();

	
	/** 
	 * @param as the array by which the arraylist will be populated
	 * @return populates the list of assistatns
	 */
	//method for adding the assistans 
	public static String addAssistans(Assistant[] as){
		for (int i = 0; i < as.length; i++){
			assistants.add(as[i]);
		}
		
		return "";
    }

	
	/** 
	 * @param rm the array by which the arraylist will be populated
	 * @return populates the list rooms
	 */
	//method for adding the room 
	public static String addRooms(Room[] rm){
		for (int i = 0; i < rm.length; i++){
			rooms.add(rm[i]);
		}
		return "";
    }
}