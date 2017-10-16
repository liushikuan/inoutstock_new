package cn.codingxiaxw.entity;

/* 	
 * @author liushikuan
 * @date   2017年10月16日18:13:10
 * 供应商
 * table vendor
 */
public class Vendor {
	private String vendornum;//编号
	private String vendorname;//名称
	private String location;//位置
	private String attribute1;
	private String attribute2;
	private String attribute3;//备用
	public String getVendornum() {
		return vendornum;
	}
	public void setVendornum(String vendornum) {
		this.vendornum = vendornum;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	public String getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	public String getAttribute3() {
		return attribute3;
	}
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}
	public Vendor(String vendornum, String vendorname, String location, String attribute1, String attribute2,
			String attribute3) {
		super();
		this.vendornum = vendornum;
		this.vendorname = vendorname;
		this.location = location;
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
		this.attribute3 = attribute3;
	}
}
