package cn.codingxiaxw.entity;

/*
 * @author liushikuan
 * @date   2017��10��3��12:02:57
 * ��Ʒʵ����
 * table good
 */
public class Good {
	private String goodnum;//�������
	private String goodname;//��������
	private String maleorfemale;//�п��Ů��
	private String attribute1;
	private String attribute2;
	private String attribute3;//����
	public String getGoodnum() {
		return goodnum;
	}
	public void setGoodnum(String goodnum) {
		this.goodnum = goodnum;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getMaleorfemale() {
		return maleorfemale;
	}
	public void setMaleorfemale(String maleorfemale) {
		this.maleorfemale = maleorfemale;
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
	public Good(String goodnum, String goodname, String maleorfemale, String attribute1, String attribute2,
                String attribute3) {
		super();
		this.goodnum = goodnum;
		this.goodname = goodname;
		this.maleorfemale = maleorfemale;
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
		this.attribute3 = attribute3;
	}
}
