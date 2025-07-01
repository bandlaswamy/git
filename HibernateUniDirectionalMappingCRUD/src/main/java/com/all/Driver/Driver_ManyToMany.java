package com.all.Driver;

import java.util.ArrayList;
import java.util.List;

import com.manyToMany.Entity.Students;
import com.manyToMany.Entity.Subjects;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_ManyToMany {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("swamy");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		//To insert the records by using persist()
		
//		Students st1 = new Students();
//		st1.setId(101);
//		st1.setName("swamy");
//		st1.setAge(22);
//		
//		Students st2 = new Students();
//		st2.setId(102);
//		st2.setName("sravs");
//		st2.setAge(23);
//		
//		
//		Subjects sub1 = new Subjects();
//		sub1.setSid(1);
//		sub1.setSname("java");
//		sub1.setDays(90);
//		
//		Subjects sub2 = new Subjects();
//		sub2.setSid(2);
//		sub2.setSname("python");
//		sub2.setDays(90);
//		
//		Subjects sub3 = new Subjects();
//		sub3.setSid(3);
//		sub3.setSname("sql");
//		sub3.setDays(40);
//		
//		Subjects sub4 = new Subjects();
//		sub4.setSid(4);
//		sub4.setSname("web technology");
//		sub4.setDays(50);
//		
//		List<Subjects>javaFullStack=new ArrayList<>();
//		javaFullStack.add(sub1);
//		javaFullStack.add(sub3);
//		javaFullStack.add(sub4);
//		
//		List<Subjects>pythonFullStack=new ArrayList<>();
//		pythonFullStack.add(sub2);
//		pythonFullStack.add(sub3);
//		pythonFullStack.add(sub4);
//		
//		st1.setSubjects(javaFullStack);
//		st2.setSubjects(pythonFullStack);
//		
//		transaction.begin();
//		manager.persist(st1);
//		manager.persist(st2);
//		transaction.commit();
		
		
		//To fetch the Records By using find()
		
		//By Using Stundent To fetch the Student along with associated subjects also fetch
//		Students student = manager.find(Students.class, 102);
//		if(student != null) {
//			System.out.println("Student Details!!!!!!!!");
//			System.out.println(student);
//		}
		
		//By Using subject To fetch subject only
//		Subjects subject = manager.find(Subjects.class, 2);
//		if(subject != null) {
//			System.out.println("Subjects Details");
//			System.out.println(subject);
//		}
		
		
		//To Update the Records By Using merge()
		
		//By Using Student to update along with associated subjects also
		
//		Students student = manager.find(Students.class, 101);
//		if(student != null) {
//			student.setName("TirupathiSwamy");//Change the name swamy to TirupathiSwamy
//			
//			List<Subjects> list = student.getSubjects();
//			for (Subjects subject : list) {
//				if(subject!=null) {
//					subject.setDays(subject.getDays()+2);//Change the days to add all subjects 2 days extra
//					
//				}
//				
//			}
//		}
//		transaction.begin();
//		manager.merge(student);
//		transaction.commit();
		
//		By Using Subject We Can't Update Student Beacause dependent
//		Subjects subjects = manager.find(Subjects.class, 2);
//		if(subjects!=null) {
//			subjects.setDays(subjects.getDays()+2);// to add 2 days
//		}
//		transaction.begin();
//		manager.merge(subjects);
//		transaction.commit();	
		
		
		//To remove or delete the records by using remove()
		
		//we can't remove the student directly because associated with subjects
		
//		Students student = manager.find(Students.class, 102);
//		if(student!=null) {
//			transaction.begin();
//			manager.remove(student);
//			transaction.commit();
//		}

	}

}
