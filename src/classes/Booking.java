package classes;
//class of moduls
public class Booking {
	//all the attributes for the class
	private AssistantOnShift assistantOnShift;
	
    private BookableRoom bookableRoom;

    private String studentEmail;

    private String time;

    private String status; 

	private boolean availability;
	
	
	
	/** 
	 * @return Availability
	 */
	//method to check where the booking is availible
	public boolean certifyTheAvailability(){

		if (bookableRoom.findOutStatusRoom() != "FULL" && assistantOnShift.findOutStatusAssistan() == "FREE"){
			availability = true;
		} else {
			availability = false;
		}
		return availability;
	}

	//class constructor
	public Booking(AssistantOnShift ASsistantOnShift,BookableRoom BOokableRoom, String Time, String StudentEmail, String Status){
		this.assistantOnShift = ASsistantOnShift;
		this.bookableRoom = BOokableRoom;
		this.time = Time;
		this.studentEmail = StudentEmail;
		this.availability = certifyTheAvailability();
		this.status = Status;
	}

	
	/** 
	 * @param Status new status
	 * @return Status
	 */
	//method to set status
	public String setStatus(String Status){
		this.status = Status;
		return status;
	}

	
	/** 
	 * @return Status
	 */
	//method to get status
	public String findOutStatusBooking(){
		return status;
	}

	
	/** 
	 * @return Assistant On Shift
	 */
	//method to get the assitant of the booking
	public AssistantOnShift getAssistantOnShift(){
		return assistantOnShift;
	}

	
	/** 
	 * @return Bookable Room
	 */
	//method to get the bookable room of the booking
	public BookableRoom getBookableRoom(){
		return bookableRoom;
	}

	
	/** 
	 * @return Time
	 */
	////method to get the time of the booking
	public String getTime(){
		return time;
	}

	
	/** 
	 * @return Printout of the Booking
	 */
	//method for printing out Booking info
	public String printThe(){

		System.out.println(assistantOnShift.getDate() + " | " + time + " | " + status + " | " + assistantOnShift.carryAssitantEmail() + " | " + bookableRoom.carryRoomCode() + " | " + studentEmail);
	
		return "";
	}
	
}