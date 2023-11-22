package classes;
//class of moduls
public class Room {
	//all the attributes for the class
	private String code;
	
	private int campacity;

	//constructor for the class
	public Room(String Code, int Campacity){
		this.code = Code;
		this.campacity = Campacity;
	}

	
	/** 
	 * @return printout of Room info
	 */
	//method for printing out Room info
	public String printThe(){

		System.out.println("| " + code + " | campacity: " + campacity + " |");

		return "";
    }
	
	
	/** 
	 * @return Code
	 */
	//method getting Rooms Code
    public String getRoomCode(){
        return code;
    }

	
	/** 
	 * @return Campacity
	 */
	//method getting Rooms Campacity
	public int getRoomCampacity(){
        return campacity;
    }

}