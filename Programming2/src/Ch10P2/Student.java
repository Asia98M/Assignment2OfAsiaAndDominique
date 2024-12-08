package Ch10P2;
import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

		
		private String email;
		private String adress;
		private String name;
		protected ArrayList<Double>grades;
		private int matricNo;
		private LocalDate dob;
		
		public Student(String email, String adress, String name, ArrayList<Double> grades, int matricNo,
				LocalDate dob) {
			super();
			this.email = email;
			this.adress = adress;
			this.name = name;
			this.grades = grades;
			this.matricNo = matricNo;
			this.dob = dob;
			
		}
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ArrayList<Double> getGrades() {
			return grades;
		}

		public void setGrades(ArrayList<Double> grades) {
			this.grades = grades;
		}

		public int getMatricNo() {
			return matricNo;
		}

		public void setMatricNo(int matricNo) {
			this.matricNo = matricNo;
		}

		public LocalDate getDob() {
			return dob;
		}

		public void setDob(LocalDate dob) {
			this.dob = dob;
		}

		@Override
		public String toString() {
			return "Student [email=" + email + ", adress=" + adress + ", name=" + name + ", grades=" + grades
					+ ", matricNo=" + matricNo + ", dob=" + dob + "]";
		}
		

}
