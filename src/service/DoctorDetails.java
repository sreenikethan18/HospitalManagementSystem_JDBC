package service;


	import java.util.ArrayList;
	import dao.DoctorDao;
	import model.DoctorModel;

	public class DoctorDetails {
	        DoctorDao  doctorDao = new DoctorDao();
	        ArrayList<DoctorModel> doctorlist = new ArrayList<>();
		public void AddDoctorModel(DoctorModel doc) throws ClassNotFoundException {
			doctorlist.add(doc);
			doctorDao.storedocRecord(doctorlist);;
		}
//		public void AddDoctorModel(DoctorModel doctor) {
//			// TODO Auto-generated method stub
//			
//		}

		
	}


