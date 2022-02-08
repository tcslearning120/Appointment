package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="postAppointment")
public class PostAppointment {
	@Id
	private int serialNo;
	@NotBlank
	@NotNull
	@Size(max = 25)

	private String name;
	@NotBlank
	@NotNull
	@Range(min=0 ,max=120)
	@Pattern(regexp = "[0-9 ]+",message="age should be between 0 to 150")
	private String age;
	@NotBlank(message=" it can't be blank")
	@NotNull
	@Size(max = 25)
	@Email(message="Enter a valid mail")
	
	private String email;
	@NotBlank
	@NotNull
	@NotEmpty
	@Size(max = 10)
	@Pattern(regexp="^[0-9]{10}",message="length must be 10 and cannot start with 0")  
	private int mobile;
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp="^[a-zA-Z0-9]{25}",message="length must be 25")  
	private String AddressLine1;
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp="^[a-zA-Z0-9]{25}",message="length must be 25") 
	private String AddressLine2;
	@NotBlank
	@NotNull
	@Size(max = 25)
	private String city;
	@NotBlank
	@NotNull
	@Size(max = 25)
	private String state;
	@NotBlank
	@NotNull
	@Size(max = 25)
	private String country;
	@NotBlank
	@NotNull
	@Pattern(regexp = "[0-9 ]+")
	private String pincode;
	@NotBlank
	@NotNull
	@Size(max = 25)
	private String trainerPreferance;
	@NotBlank
	@NotNull
	@Size(max = 25)
	private String physiotherpistRequirement;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "feedback_no", referencedColumnName = "userFeedbackSerialNo")
	private UserFeedback userFeedBack;
	
	public PostAppointment() {
		
	}
	public PostAppointment(int serialNo, @NotBlank @NotNull @Size(max = 25) String name,
			@NotBlank @NotNull @Range(min = 0, max = 120) @Pattern(regexp = "[0-9 ]+", message = "age should be between 0 to 150") String age,
			@NotBlank(message = " it can't be blank") @NotNull @Size(max = 25) @Email(message = "Enter a valid mail") String email,
			@NotBlank @NotNull @NotEmpty @Size(max = 10) @Pattern(regexp = "^[0-9]{10}", message = "length must be 10 and cannot start with 0") int mobile,
			@NotBlank @NotNull @Size(max = 25) @Pattern(regexp = "^[a-zA-Z0-9]{25}", message = "length must be 25") String addressLine1,
			@NotBlank @NotNull @Size(max = 25) @Pattern(regexp = "^[a-zA-Z0-9]{25}", message = "length must be 25") String addressLine2,
			@NotBlank @NotNull @Size(max = 25) String city, @NotBlank @NotNull @Size(max = 25) String state,
			@NotBlank @NotNull @Size(max = 25) String country,
			@NotBlank @NotNull @Pattern(regexp = "[0-9 ]+") String pincode,
			@NotBlank @NotNull @Size(max = 25) String trainerPreferance,
			@NotBlank @NotNull @Size(max = 25) String physiotherpistRequirement, UserFeedback userFeedBack) {
		super();
		this.serialNo = serialNo;
		this.name = name;
		this.age = age;
		this.email = email;
		this.mobile = mobile;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.trainerPreferance = trainerPreferance;
		this.physiotherpistRequirement = physiotherpistRequirement;
		this.userFeedBack = userFeedBack;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getTrainerPreferance() {
		return trainerPreferance;
	}
	public void setTrainerPreferance(String trainerPreferance) {
		this.trainerPreferance = trainerPreferance;
	}
	public String getPhysiotherpistRequirement() {
		return physiotherpistRequirement;
	}
	public void setPhysiotherpistRequirement(String physiotherpistRequirement) {
		this.physiotherpistRequirement = physiotherpistRequirement;
	}
   public UserFeedback getUserFeedBack() {
		return userFeedBack;
	}
	public void setUserFeedBack(UserFeedback userFeedBack) {
		this.userFeedBack = userFeedBack;
	}

}
