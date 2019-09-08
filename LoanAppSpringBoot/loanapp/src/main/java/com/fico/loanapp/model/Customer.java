package com.fico.loanapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/** This class stoes the data enetered by the customer in the database.
 *Mysql @version 8.1
 *Primary key -> auto generated Id **/

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;


	public Customer() {
		
		
		
	};
	
	@Column(name = "age")
	private int age;
	
	public Customer(int ssn, String loanprp, String firstName, String middleName, String desc, String lastName,
			String maritial, int loanamt, String line1, String line2, String city, String state, int zip, int phHome,
			int phOff, int phMob, int emplen, String email, String empName, int annual, String empline1, String empline2,
			String empcity, String empstate, int empzip, String desig, int age) {
		this.ssn = ssn;
		this.loanprp = loanprp;
		this.firstName = firstName;
		this.middleName = middleName;
		this.desc = desc;
		this.lastName = lastName;
		this.maritial = maritial;
		this.loanamt = loanamt;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phHome = phHome;
		this.phOff = phOff;
		this.phMob = phMob;
		this.emplen = emplen;
		this.email = email;
		this.empName = empName;
		this.annual = annual;
		this.empline1 = empline1;
		this.empline2 = empline2;
		this.empcity = empcity;
		this.empstate = empstate;
		this.empzip = empzip;
		this.desig = desig;
		this.score = 0;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//put ssn @ TRY 3.0
	@Column(name="ssn")
	private int ssn;
	
	
	
	@Column(name = "loanprp")
    private String loanprp;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "middleName")
    private String middleName;
	
    @Column(name = "descript")
    private String desc;
	
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getLoanprp() {
		return loanprp;
	}
	public void setLoanprp(String loanprp) {
		this.loanprp = loanprp;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "lastName")
    private String lastName;
    @Column(name = "maritial")
    private String maritial;
    @Column(name = "loanamt")
    private int loanamt;
    
    
    
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMaritial() {
		return maritial;
	}
	public void setMaritial(String maritial) {
		this.maritial = maritial;
	}
	public int getLoanamt() {
		return loanamt;
	}
	public void setLoanamt(int loanamt) {
		this.loanamt = loanamt;
	}
	
	@Column(name = "line1")
    private String line1;
    @Column(name = "line2")
    private String line2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private int zip;
    @Column(name = "phHome")
    private int phHome;
    @Column(name = "phOff") 
    private int phOff;
    @Column(name = "phMob") 
    private int phMob;
    @Column(name = "email")
    private String email;
    @Column(name = "empName")
    private String empName;
    @Column(name = "annual")
    private int annual;
    
    
    
    
	   @Column(name = "empline1")
	    private String empline1;
	    @Column(name = "empline2")
	    private String empline2;
	    @Column(name = "empcity")
	    private String empcity;
	    @Column(name = "empstate")
	    private String empstate;
	    @Column(name = "empzip")
	    private int empzip;
	    @Column(name = "desig")
	    private String desig;
	    

	    @Column(name = "score")
	    private double score;
	    
	    
	    @Column(name = "empLength")
	    private int emplen;
	    
	    public int getEmplen()
	    {
	    	return emplen;
	    }
	    
	    public void setEmplen(int emplen)
	    {
	    	this.emplen = emplen;
	    }
	    
	    
		public double getScore() {
			return score;
		}

		public void setScore(double score) {
			this.score = score;
		}

		public long getId() {
			return id;
		}

		public int getSsn() {
			return ssn;
		}
		public void setSsn(int ssn) {
			this.ssn = ssn;
		}
		public String getLine1() {
			return line1;
		}
		public void setLine1(String line1) {
			this.line1 = line1;
		}
		public String getLine2() {
			return line2;
		}
		public void setLine2(String line2) {
			this.line2 = line2;
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
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public int getPhHome() {
			return phHome;
		}
		public void setPhHome(int phHome) {
			this.phHome = phHome;
		}
		public int getPhOff() {
			return phOff;
		}
		public void setPhOff(int phOff) {
			this.phOff = phOff;
		}
		public int getPhMob() {
			return phMob;
		}
		public void setPhMob(int phMob) {
			this.phMob = phMob;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public int getAnnual() {
			return annual;
		}
		public void setAnnual(int annual) {
			this.annual = annual;
		}
		public String getEmpline1() {
			return empline1;
		}
		public void setEmpline1(String empline1) {
			this.empline1 = empline1;
		}
		public String getEmpline2() {
			return empline2;
		}
		public void setEmpline2(String empline2) {
			this.empline2 = empline2;
		}
		public String getEmpcity() {
			return empcity;
		}
		public void setEmpcity(String empcity) {
			this.empcity = empcity;
		}
		public String getEmpstate() {
			return empstate;
		}
		public void setEmpstate(String empstate) {
			this.empstate = empstate;
		}
		public int getEmpzip() {
			return empzip;
		}
		public void setEmpzip(int empzip) {
			this.empzip = empzip;
		}
		public String getDesig() {
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", ssn=" + ssn + ", loanprp=" + loanprp
					+ ", firstName=" + firstName + ", middleName=" + middleName + ", desc=" + desc + ", lastName="
					+ lastName + ", maritial=" + maritial + ", loanamt=" + loanamt + ", line1=" + line1 + ", line2="
					+ line2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phHome=" + phHome + ", phOff="
					+ phOff + ", phMob=" + phMob + ", email=" + email + ", empName=" + empName + ", annual=" + annual
					+ ", empline1=" + empline1 + ", empline2=" + empline2 + ", empcity=" + empcity + ", empstate="
					+ empstate + ", empzip=" + empzip + "emplen=" + emplen + ", desig=" + desig + ", age=" + age + ", score=" + score + "]";
		}
		
		
		
}
