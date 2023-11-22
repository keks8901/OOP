package classes;
//class of moduls
public class AssistantOnShift {
	//all the attributes for the class
	private String status;
	
    private String date;

    private Assistant assistant;

    
    /** 
     * @return Status
     */
    //method for getting the assistants status
    public String findOutStatusAssistan(){
        return status;
    }

    //class constructor
    public AssistantOnShift(String Date, String Status, Assistant Assistant){
		this.date = Date;
		this.assistant = Assistant;
		this.status = Status;
	}

	
    /** 
     * @return Printout of Assistatn on shift
     */
    //method for printing out Room info
	public String printThe(){

		System.out.println("| " + date + " | " + status + " | " + assistant.getAssitantEmail() + " |");

		return "";
    }

    
    /** 
     * @return Assistant Email
     */
    //method for getting the assistatn email via assistant class
    public String carryAssitantEmail(){
        return assistant.getAssitantEmail();
    }

    
    /** 
     * @return Assistant Name
     */
    //method for getting the assistatn name via assistant class
    public String carryAssitantName(){
        return assistant.getAssitantName();
    }

    
    /** 
     * @return Date
     */
    //method for getting the date of the assitant on the shift
    public String getDate(){
        return date;
    }
	
}