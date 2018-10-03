package application.jconfig;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import application.jconfig.dao.AccountDao;
import application.jconfig.dao.AddressDao;
import application.jconfig.dao.AdminDao;
import application.jconfig.dao.CategoryDao;
import application.jconfig.dao.CustomerDao;
import application.jconfig.dao.LaptopDao;
import application.jconfig.dao.MobileDao;
import application.jconfig.dao.ProductDao;
import application.jconfig.dao.SubCategoryDao;
import application.jconfig.dao.UserDao;
import application.jconfig.dao.VendorDao;
import application.jconfig.model.Account;
import application.jconfig.model.Address;
import application.jconfig.model.Admin;
import application.jconfig.model.Category;
import application.jconfig.model.Customer;
import application.jconfig.model.Product;
import application.jconfig.model.SubCategory;
import application.jconfig.model.User;
import application.jconfig.model.Vendor;
import application.jconfig.model.product.Laptop;
import application.jconfig.model.product.Mobile;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@SpringJUnitConfig(classes=(HibernateConfiguration.class))
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest 
{
	@Autowired
	private Vendor vendor;
	@Autowired
	private VendorDao vendorDao;
	
	@Autowired
	private Customer customer;
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private Admin admin;
	@Autowired
	private AdminDao adminDao;
	
	@Autowired
	private User user;
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private Address address;
	@Autowired
	private AddressDao AddressDao;
	
	@Autowired
	private Account account;
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private Product product;
	@Autowired
	private ProductDao productDao;
	
	
	@Autowired
	private Mobile mobile;
	@Autowired
	private MobileDao mobileDao;
	
	@Autowired
	private Laptop laptop;
	@Autowired
	private LaptopDao laptopDao; 
	
	@Autowired
	private Category category;
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SubCategory subCategory;
	@Autowired
	private SubCategoryDao subCategoryDao;
	
	private Address address1;
	private Address address2;

	@Before
	public void setUp() {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfiguration.class);
		
		/*user.setName("sreekar");
		user.setEmail("sreekar@gmail.com");
		user.setMobile("7032343530");
		user.setPassword("sreekar");
		user.setConfirmPassword("sreekar");
		user.setRole("admin");*/
		
		vendor.setName("raghu");
		vendor.setEmail("raghu@gmail.com");
		vendor.setMobile("9848022338");
		vendor.setCompanyName("amazon");
		vendor.setPassword("123");
		vendor.setConfirmPassword("123");
		
		/*admin.setName("sreekarch");
		admin.setMobile("7033343535");
		admin.setEmail("sree@gmail.com");
		admin.setPassword("123");
		admin.setConfirmPassword("123"); */
	}
	
	@Test
	public void test() {
		assertEquals("Test Failed", true, vendorDao.addVendor(vendor));
	}
	
	@After
	public void delete() {
		assertEquals("Deleting Failed", true, vendorDao.deleteVendor(vendor));
	}
	
	
/*	@Before
	public void setUp() {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(HibernateConfiguration.class);
		
		vendor.setName("sreekar_ch");
		vendor.setEmail("sreekarch@gmail.com");
		vendor.setMobile("70323335333");
		vendor.setPassword("sreekar");
		vendor.setConfirmPassword("sreekar");
		vendor.setCompanyName("amazon.in");
		
		address.setHouseNumber("11-6-197");
		address.setStreet("musherabad");
		address.setCity("hyderabad");
		address.setState("telanagana");
		
		HashSet<Address> addresses=new HashSet<Address>();
		
		address1=new Address();
		address1.setHouseNumber("11-6-197");
		address1.setStreet("musherabad");
		address1.setCity("hyderabad");
		address1.setState("telanagana");
		addresses.add(address1);
		address1.setVendor(vendor);
		
		
		address2=new Address();
		address2.setHouseNumber("11-6-198");
		address2.setStreet("musheerabad");
		address2.setCity("hyd");
		address2.setState("tg");
		addresses.add(address2);
		address2.setVendor(vendor);
		
		vendor.setAddresses(addresses);
	
		account.setAccountNumber(1483232629);
		account.setBankName("sbi");
		
	
		
		mobile.setBrand("Sony");
		mobile.setModel("Xperia");
		mobile.setMobileRam(4);
		mobile.setMobileRom(64);
		mobile.setProcessor("Snapdragon");
		mobile.setPrimaryCam(16);
		mobile.setSecondaryCam(8);
		
		laptop.setLaptopRam(8);
		laptop.setLaptopRom(1000);
		laptop.setProcessor("Quad Core");
		laptop.setOs("Windows 10");
		laptop.setBrand("Dell");
		
	}
		
	@Test
	public void test() {
		assertEquals("Insertion Failed", true, vendorDao.addVendor(vendor));
	}
	
	@Test
	public void updateVendor() {
		vendorDao.addVendor(vendor);
		vendor.setName("sreekar");
		vendor.setEmail("sreekar@gmail.com");
		vendor.setMobile("7032343530");
		vendor.setCompanyName("amazon");
		assertEquals("Test Failed", true, vendorDao.updateVendor(vendor));
	}
	
	public void getVendorByEmail() {
		vendorDao.addVendor(vendor);
		assertEquals("Test Failed", vendor, vendorDao.getVendorByEmail(vendor.getEmail()));		
	}

	
	@Test
	public void addAddress() {
		vendorDao.addVendor(vendor);
		address.setVendor(vendor);
		assertEquals("Test Failed", true, AddressDao.addAddress(address));
        deleteAddress();	
	}
	
	
	@Test
	public void addAccount() {
		vendorDao.addVendor(vendor);
		account.setVendor(vendor);
		assertEquals("Test Failed", true, accountDao.addAccount(account));
		deleteAccount();
	}
	
	
	@Test
	public void addProduct() {
		vendorDao.addVendor(vendor);
		product.setVendor(vendor);
		assertEquals("Test Failed", true, productDao.addProduct(product));
		deleteProduct();
	}
	
	@Test
	public void addMobile() {
		
		vendorDao.addVendor(vendor);
		subCategory=subCategoryDao.getSubCategory(1);
		mobile.setVendor(vendor);
		mobile.setSubCategory(subCategory);
		assertEquals("Test Failed", true, mobileDao.addMobile(mobile));
		deleteMobile();
	}
	
	@Test
	public void addLaptop() {
		vendorDao.addVendor(vendor);
		subCategory=subCategoryDao.getSubCategory(1);
		laptop.setVendor(vendor);
		laptop.setSubCategory(subCategory);
		assertEquals("Test Failed", true, laptopDao.addLaptop(laptop));
		deleteLaptop();
	}
	
	
	@After
	public void deleteVendor() {
		assertEquals("Deleting Failed", true, vendorDao.deleteVendor(vendor));
	}
	
	public void deleteAddress(){
		AddressDao.deleteAddress(address);
	}
	
	public void deleteAccount() {
		accountDao.deleteAccount(account);
	}
	
	public void deleteProduct() {
		productDao.deleteProduct(product);
	}
	
	
	public void deleteMobile() {
		mobileDao.deleteMobile(mobile);
	}
	
	public void deleteLaptop() {
		laptopDao.deleteLaptop(laptop);
	}*/
	
}