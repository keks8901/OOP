package classes;
//class of moduls
public class BookableRoom {
	//all the attributes for the class
	private String status;
	
	private int occupancy;

    private String time;

	private String date;

    private Room room;

	
	/** 
	 * @return Status
	 */
	//method to find the status of the bookable room
	public String findOutStatusRoom(){

		int roomCampacity = room.getRoomCampacity();

		if (occupancy == 0) {
			status = "EMPTY";

		} else if( occupancy < roomCampacity){
			status = "AVAILABLE";

		} else if (occupancy == roomCampacity) {
			status = "FULL";

		} else if (occupancy > roomCampacity) {
			status = null;
			System.out.println("The occupancy can never be bigger than the room capacity");
		}

		return status;
	}

	//class constructor
	public BookableRoom(int Occupancy, String Time, String Date, Room Room){
		this.occupancy = Occupancy;
		this.time = Time;
		this.room = Room;
		this.date = Date;
		this.status = findOutStatusRoom();
	}

	
	/** 
	 * @return Printout of Bookable Room
	 */
	//method for printing out Room info
	public String printThe(){

		System.out.println("| " + date + " | " + time + " | " + status + " | " + room.getRoomCode() + " | occupancy: " + occupancy);

		return "";
    }

	
	/** 
	 * @return Room Code
	 */
	//method for getting the bookable room code via room class
    public String carryRoomCode(){
        return room.getRoomCode();
    }
	
	
	/** 
	 * @return Room Campacity
	 */
	//method for getting the bookable room campacity via room class
	public int carryCampacity(){
        return room.getRoomCampacity();
    }

	
	/** 
	 * @return Time
	 */
	//method for getting the bookable rooms time (HH:MM)
	public String getTime(){
		return time;
	}

	
	/** 
	 * @return String
	 */
	//method for getting the bookable rooms date (dd/mm/yyyy)
	public String getDate(){
		return date;
	}
	
	
}