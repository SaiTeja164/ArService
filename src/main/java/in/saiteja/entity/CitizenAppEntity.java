/**
 * 
 */
package in.saiteja.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * @author K.SAITEJA
 *
 */
@Entity
@Table(name="CITIZEN_APP_ENTITY")
public class CitizenAppEntity {
	@Id
	@GeneratedValue
	@Column(name="APP_ID")
	private Integer appId;
	@Column(name="FULL_NAME")
	private String fullName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="MOBILE_NO")
	private Long mobileNo;
	@Column(name="GENDER")
	private String gender;
	@Column(name="DOB")
	private String dob;
	@Column(name="SSN")
	private Long SSN;
	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;

	@Column(name = "UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalDate updateDate;

	public CitizenAppEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CitizenAppEntity(Integer appId, String fullName, String email, Long mobileNo, String gender, String dob,
			Long sSN, String createdBy, String updatedBy, LocalDate createDate, LocalDate updateDate) {
		super();
		this.appId = appId;
		this.fullName = fullName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.dob = dob;
		SSN = sSN;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	

	
	
}
