package model;

public class DoctorModel {
	
		
		private int DoctorId;
		private String DoctorName,DoctorGender,DoctorSpecilist,DoctorPhoneno,Time;
		public DoctorModel() {
			super();
			// TODO Auto-generated constructor stub
		}
		public DoctorModel(int doctorId, String doctorName, String doctorGender, String doctorSpecilist,
				String doctorPhoneno, String time) {
			super();
			DoctorId = doctorId;
			DoctorName = doctorName;
			DoctorGender = doctorGender;
			DoctorSpecilist = doctorSpecilist;
			DoctorPhoneno = doctorPhoneno;
			Time = time;
		}
		public int getDoctorId() {
			return DoctorId;
		}
		public void setDoctorId(int doctorId) {
			DoctorId = doctorId;
		}
		public String getDoctorName() {
			return DoctorName;
		}
		public void setDoctorName(String doctorName) {
			DoctorName = doctorName;
		}
		public String getDoctorGender() {
			return DoctorGender;
		}
		public void setDoctorGender(String doctorGender) {
			DoctorGender = doctorGender;
		}
		public String getDoctorSpecilist() {
			return DoctorSpecilist;
		}
		public void setDoctorSpecilist(String doctorSpecilist) {
			DoctorSpecilist = doctorSpecilist;
		}
		public String getDoctorPhoneno() {
			return DoctorPhoneno;
		}
		public void setDoctorPhoneno(String doctorPhoneno) {
			DoctorPhoneno = doctorPhoneno;
		}
		public String getTime() {
			return Time;
		}
		public void setTime(String time) {
			Time = time;
		}
		
		
	}


