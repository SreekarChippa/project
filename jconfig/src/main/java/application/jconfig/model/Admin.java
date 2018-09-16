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
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adminId;
	
	@NotNull(message="name should not be null")
	@NotBlank(message="name should not be blank")
	private String name;
	
	@Pattern(regexp="\\d{10}")
	@NotNull(message="mobile should not be null")
	@NotBlank(message="mobile should not be blank")
	@Column(unique=true,nullable=false)
	private String mobile;
	
	@NotNull(message="email should not be null")
	@NotBlank(message="email should not be blank")
	@Column(unique=true,nullable=false)
	private String email;
	
	@NotNull(message="password should not be null")
	@NotBlank(message="password should not be blank")
	private String password;
	
	@NotNull(message="confirm password should not be null")
	@NotBlank(message="confirm password should not be blank")
	@Transient
	private String confirmPassword;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	
}
