package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Entity
@Table(name="userFeedback")
public class UserFeedback {
	@Id
	private int userFeedbackSerialNo;
	@NotBlank
	@NotNull
	@Size(max = 25)

	private String name;
	@NotBlank(message = " it can't be blank")
	@NotNull
	@NotEmpty
	@Size(max = 10)
	@Pattern(regexp = "^[0-9]{10}", message = "length must be 10 and cannot start with 0")
	private int mobile;
	@NotBlank(message = " it can't be blank")
	@NotNull
	@Size(max = 25)
	@Email(message = "Enter a valid mail")

	private String email;
	@NotBlank(message = " it can't be blank")
	@Size(max = 200,message =" size can't go beyond 200 characters")
	private String message;
    @OneToOne(mappedBy = "userFeedBack")
    private PostAppointment postAppointment;
	
	public UserFeedback() {
		
	}
	public UserFeedback(int userFeedbackSerialNo, @NotBlank @NotNull @Size(max = 25) String name,
			@NotBlank(message = " it can't be blank") @NotNull @NotEmpty @Size(max = 10) @Pattern(regexp = "^[0-9]{10}", message = "length must be 10 and cannot start with 0") int mobile,
			@NotBlank(message = " it can't be blank") @NotNull @Size(max = 25) @Email(message = "Enter a valid mail") String email,
			@NotBlank(message = " it can't be blank") @Size(max = 200, message = " size can't go beyond 200 characters") String message,
			PostAppointment postAppointment) {
		super();
		this.userFeedbackSerialNo = userFeedbackSerialNo;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.message = message;
		this.postAppointment = postAppointment;
	}
	public int getUserFeedbackSerialNo() {
		return userFeedbackSerialNo;
	}
	public void setUserFeedbackSerialNo(int userFeedbackSerialNo) {
		this.userFeedbackSerialNo = userFeedbackSerialNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public PostAppointment getPostAppointment() {
		return postAppointment;
	}
	public void setPostAppointment(PostAppointment postAppointment) {
		this.postAppointment = postAppointment;
	}
	

}
