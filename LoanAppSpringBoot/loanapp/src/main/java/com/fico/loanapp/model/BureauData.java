package com.fico.loanapp.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/** This class creates a table for  bureau.
 *Mysql @version 8.1
 *Primary key -> sid/ssn **/



@Entity
@Table(name = "bureau")
public class BureauData {

	
	@Id
	@Column(name = "sid")
	private long sid;
	@Column(name = "delinq_2yrs")
	private int delinq;
	@Column(name = "inquiry_6mths")
	private int inquiry;
	@Column(name = "mnths_since_last_delinq")
	private int lastdelinq;
	@Column(name = "mnths_since_last_pubRec")
	private int lastpubrec;
	@Column(name = "open_acc")
	private int openacc;
	@Column(name = "pub_rec")
	private int pubrec;
	@Column(name = "revol_bal")
	private int revolbal;
	@Column(name = "revol_util")
	private int revolutil;
	@Column(name = "total_acc")
	private int totalacc;
	@Column(name = "earliest_crdt_line")
	private String erlstcrdtline;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public int getDelinq() {
		return delinq;
	}
	public void setDelinq(int delinq) {
		this.delinq = delinq;
	}
	public int getInquiry() {
		return inquiry;
	}
	public void setInquiry(int inquiry) {
		this.inquiry = inquiry;
	}
	public int getLastdelinq() {
		return lastdelinq;
	}
	public void setLastdelinq(int lastdelinq) {
		this.lastdelinq = lastdelinq;
	}
	public int getLastpubrec() {
		return lastpubrec;
	}
	public void setLastpubrec(int lastpubrec) {
		this.lastpubrec = lastpubrec;
	}
	public int getOpenacc() {
		return openacc;
	}
	public void setOpenacc(int openacc) {
		this.openacc = openacc;
	}
	public int getPubrec() {
		return pubrec;
	}
	public void setPubrec(int pubrec) {
		this.pubrec = pubrec;
	}
	public int getRevolbal() {
		return revolbal;
	}
	public void setRevolbal(int revolbal) {
		this.revolbal = revolbal;
	}
	public int getRevolutil() {
		return revolutil;
	}
	public void setRevolutil(int revolutil) {
		this.revolutil = revolutil;
	}
	public int getTotalacc() {
		return totalacc;
	}
	public void setTotalacc(int totalacc) {
		this.totalacc = totalacc;
	}
	public String getErlstcrdtline() {
		return erlstcrdtline;
	}
	public void setErlstcrdtline(String erlstcrdtline) {
		this.erlstcrdtline = erlstcrdtline;
	}
	@Override
	public String toString() {
		return "BureauData [sid=" + sid + ", delinq=" + delinq + ", inquiry=" + inquiry + ", lastdelinq=" + lastdelinq
				+ ", lastpubrec=" + lastpubrec + ", openacc=" + openacc + ", pubrec=" + pubrec + ", revolbal="
				+ revolbal + ", revolutil=" + revolutil + ", totalacc=" + totalacc + ", erlstcrdtline=" + erlstcrdtline
				+ "]";
	}
	
	
	
	
}
