package application.jconfig.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Vendor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vendorId;
	
	@Column(unique=true)
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
	
	@NotNull(message="CompanyName should not be null")
	@NotBlank(message="CompanyName should not be blank")
	private String companyName;
	
	@NotNull(message="password should not be null")
	@NotBlank(message="password should not be blank")
	private String password;
	
	@Transient
	private String confirmPassword;
	
	@Column(nullable=false)
	private boolean status;
	
	private final String role="vendor";
	
	public String getRole() {
		return role;
	}

	@OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
	private Set<VendorAddress> vendorAddress;

	@OneToMany(mappedBy = "vendor")
	private List<Product> product;

	public Set<VendorAddress> getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(Set<VendorAddress> vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", companyName=" + companyName + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", status=" + status + ", role=" + role + ", vendorAddress=" + vendorAddress + ", product=" + product
				+ "]";
	}
	
	
	
	

}
