package application.jconfig.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	
	private String name;
	
	@NotNull(message="email should not be null")
	@NotBlank(message="email should not be blank")
	@Column(unique=true,nullable=false)
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
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private Set<CustomerAddress> customerAddress;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	
	
	
}
