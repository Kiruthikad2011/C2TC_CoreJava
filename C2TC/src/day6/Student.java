package day6;

public class Student {
	
		private int studid;
		private String studname;
		private String studdept;
		public Student() {
			super();
		
		}
		public Student(int studid, String studname, String studdept) {
			super();
			this.studid = studid;
			this.studname = studname;
			this.studdept = studdept;
		}
		public int getStudid() {
			return studid;
		}
		public void setStudid(int studid) {
			this.studid = studid;
		}
		public String getStudname() {
			return studname;
		}
		public void setStudname(String studname) {
			this.studname = studname;
		}
		public String getStuddept() {
			return studdept;
		}
		public void setStuddept(String studdept) {
			this.studdept = studdept;
		}
		@Override
		public String toString() {
			return "Student [studid=" + studid + ", studname=" + studname + ", studdept=" + studdept + "]";
		}
	}

