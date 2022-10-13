/**
 * 
 */
package in.saiteja.binding;

/**
 * @author K.SAITEJA
 *
 */
public class CitizenApp {

	private String fullName;
	private String email;
	private Long mobileNo;
	private String gender;
	private String dob;
	private Long SSN;
	private String state;
	public CitizenApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CitizenApp(String fullName, String email, Long mobileNo, String gender, String dob, Long sSN, String state) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.dob = dob;
		SSN = sSN;
		this.state = state;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Long getSSN() {
		return SSN;
	}
	public void setSSN(Long sSN) {
		SSN = sSN;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
