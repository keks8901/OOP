package classes;
//class of moduls
public class Assistant {
	//all the attributes for the class
	private String email;
	
	private String name;

	//constructor for the class
	public Assistant(String Email, String Name){
		this.email = Email;
		this.name = Name;
	}

	
	/** 
	 * @return printout of Assistant
	 */
	//method for printing out Assistans info
	public String printThe(){

		System.out.println("| " + name + " | " + email + " |");

		return "";
    }
	

	/** 
	 * @return Email
	 */
	//method to get assistants email
    public String getAssitantEmail(){
        return email;
    }

	
	/** 
	 * @return Name
	 */
	//method to get assistants name
	public String getAssitantName(){
        return name;
    }
}
