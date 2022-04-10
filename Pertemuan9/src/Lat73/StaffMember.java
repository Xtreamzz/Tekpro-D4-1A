package Lat73;

public abstract class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	public StaffMember(String eName, String eAddress, String ePhone){
		this.name = eName;
		this.address = eAddress;
		this.phone = ePhone;
	}
	public String toString(){
		String result = "Name: "+name+"\n";
		
		result += "Address: "+address+"\n";
		result += "Phone: "+phone+"\n";
		return result;
	}
	public abstract double pay();
}
