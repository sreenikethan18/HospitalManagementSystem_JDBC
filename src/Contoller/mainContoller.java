package Contoller;


	import java.util.Scanner;
	import dao.DoctorDao;
	import model.DoctorModel;
	import service.DoctorDetails;
	
   public class mainContoller {

		public static void main(String[] args) throws ClassNotFoundException {
		   DoctorDetails ad = new DoctorDetails();
		   DoctorDao doctorDao = new DoctorDao();
		   System.out.println("====================================");
		   System.out.println("    HOSPITAL MANAGEMENT SYSTEM       ");
		   System.out.println("====================================");
	        boolean Login = true;
	        while(Login) {
	        	System.out.println("\n1)Enter \n2)Exit");
	        	Scanner sc = new Scanner(System.in);
	        	int option = Integer.parseInt(sc.nextLine());
	        	switch(option) {
	        	case 1:{
	        		System.out.println("\n Admin Name: ");
	        		String Name= sc.nextLine();
	        		System.out.println("Passsword:");
	        		String pwd = sc.nextLine();
	        		if(Name.equals("Nikethan")&&pwd.equals("1234"));{
	        			System.out.println("Sucessfully Logged In");
	        			 boolean temp = true;
	        			 while(temp) {
	        				 System.out.println("Choose the action to be performed");
	        				 System.out.println("\n 1 Add Doctor Id  \n 2) view Doctor \n 3)Update Doctor \n 5)Leave Doctor");
	        				 boolean flag = true;
	        				 int operation = 0;
	        				 while(flag) {
	        					 try {
	        						 operation = Integer.parseInt(sc.nextLine());
	        						 flag = false;
	        					 }catch (Exception e) {
	        						 System.out.println("Enter correct Number");
	        						 flag = true;
	        					 }
	        				 }
	        				 switch(operation) {
	        				      ///ADD Movie///
	        				 case 1:{
	        					 System.out.println("How Many Doctor want to add");
	        					 int doctorAdd = Integer.parseInt(sc.nextLine());
	        					   int DoctorId = 0;
	        					   String DoctorName,DoctorGender,DoctorSpecilist,DoctorPhoneno,Time;
	        					   for(int i=0; i<doctorAdd;i++) {
	        						   boolean id = true;
	        						   while(id) {
	        							   try {
	        								  System.out.println("DoctorId:"); 
	        								  DoctorId = Integer.parseInt(sc.nextLine());
	        								  id= false;
	        							   }catch(NumberFormatException e) {
	        								   System.out.println("Enter Integer Type only");
	        								   id= true;
	        							   }
	        						   }
	        						   System.out.println("DoctorName:");
	        						   DoctorName = sc.nextLine();
	        						   System.out.println("DoctorGender:");
	        						   DoctorGender = sc.nextLine();
	        						   System.out.println("DoctorSpecilist:");
	        						   DoctorSpecilist = sc.nextLine();
	        						   System.out.println("DoctorPhoneno:");
	        						   DoctorPhoneno = sc.nextLine();
	        						   System.out.println("Time");
	        						   Time = sc.nextLine();
	        						   
	                            DoctorModel doctor = new DoctorModel (DoctorId,DoctorName,DoctorGender,DoctorSpecilist,DoctorPhoneno,Time);
	                              ad.AddDoctorModel(doctor);
	                                 
	        					   }
	        				   break;
	        				 }
	        				 ////view///
	        				 case 2:{
	        	                 doctorDao.ViewdoctorModel();
	        	                 break;
	        				 }
	        				 //////////update/////
	        				 case 3:{
	        					 System.out.println("\n Enter the Id  to Upadte:");
	        					 int UpdateDoctorId = Integer.parseInt(sc.nextLine());
	        					 boolean flag1= true;
	        					 System.out.println("\n select any one of them to update");
	        					 try {
	        						 while(flag1) {
	        							 System.out.println("\n 1)DoctorId \n2)DoctorName \n3)DoctorGender \n 4)DoctorSpecilist \n5)DoctorPhoneno \n 6)Time \n7)Exit" );
	        							 int Update = Integer.parseInt(sc.nextLine());
	        							 switch(Update) {
	        							 case 1:{
	        								 System.out.println("\nEnter DoctorId to update");
	        								 String newDoctorId = sc.nextLine();
	        						 doctorDao.UpdatedocModel(Update,UpdateDoctorId,newDoctorId);
	        								 break;
	        							 }
	        							 case 2:{
	        								 System.out.println("\nEnter  DoctorName to update");
	        								 String newDoctorName = sc.nextLine();
	        								 doctorDao.UpdatedocModel(Update,UpdateDoctorId,newDoctorName);
	        								 break;

	        							 }
	        							 case 3:{
	        								 System.out.println("\nEnter DoctorGender to update");
	        								 String newDoctorGender = sc.nextLine();
	        								 doctorDao.UpdatedocModel(Update,UpdateDoctorId,newDoctorGender);
	        								 break;

	        							 }
	        							 case 4:{
	        								 System.out.println("\nEnter  DoctorSpecilist to update");
	        								 String newDoctorSpecilist = sc.nextLine();
	        								 doctorDao.UpdatedocModel(Update,UpdateDoctorId,newDoctorSpecilist);
	        								 break;

	        							 }
	        							 case 5:{
	        								 System.out.println("\nEnter DoctorPhoneno to update");
	        								 String newDoctorPhoneno= sc.nextLine();
	        								 doctorDao.UpdatedocModel(Update,UpdateDoctorId,newDoctorPhoneno);
	        								 break;

	        							 }
	        							 case 6:{
	        								 System.out.println("\nEnter Time to update");
	        								 String newTime= sc.nextLine();
	        								 doctorDao.UpdatedocModel(Update,UpdateDoctorId,newTime);
	        								 break;

	        							 }

	        							 case 7:{
	        								 flag1= false;
	        								 break;
	        							 }
	        							 }
	        							
	        						 }
	        					 }catch(NumberFormatException e){
	        						 System.out.println("\nEnter the correct number");
	        						 flag1 = true;
	        					 }
	        					 break;
	        				 }
	        				 
	        				 /////////////Exit////////
	        				 case 5:{
	        					 temp = false;
	        					 break;
	        				     }
	        				 }
	        				 
	        			 }
	        			
	        		  }
	      
	             	}
	        	}
	        }
		}

	}

