package fs.beans;
public class Student {
	private String sno;
	private String sname;
	private String sex;
	private String classname;
	private String tel;

	public Student() {
		super();
	}

	public Student(String sno, String sname, String sex, String classname, String tel) {
		this.sno = sno;
		this.sname = sname;
		this.sex = sex;
		this.classname = classname;
		this.tel = tel;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
