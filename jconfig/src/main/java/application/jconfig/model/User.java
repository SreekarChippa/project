package application.jconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	private String name;
	
	/*@Pattern(regexp=)*/
	@NotNull(message="email should not be null")
	@NotBlank(message="email should not be blank")
	@Column(unique=true)	
	private String email;
	
	@Pattern(regexp="\\d{10}")
	@NotNull(message="mobile should not be null")
	@NotBlank(message="mobile should not be blank")
	@Column(unique=true,nullable=false)
	private String mobile;
	
	@NotNull(message="password should not be null")
	@NotBlank(message="password should not be blank")
	private String password;
	
	@Transient
	private String confirmPassword;
	
	private String role;
	
	@NotNull(message="companyName should not be null")
	@NotBlank(message="companyName should not be blank")
	private String companyName;
	
	private boolean status=false;
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", role=" + role + ", companyName=" + companyName
				+ "]";
	}
	
	

}
