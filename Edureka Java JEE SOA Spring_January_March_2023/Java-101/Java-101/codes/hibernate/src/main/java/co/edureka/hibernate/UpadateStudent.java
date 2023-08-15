package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpadateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		/*
		Student st = new Student(101, "Pankaj Kumar", "pankaj@edureka.co");
		session.update(st);
		*/
				
		Student st = session.get(Student.class, 106);		
		if(st != null) {
			System.out.println(st);
			st.setStudentName("Sunil Joseph"); //dirty object
		}
		else
			System.err.println("------- no matching student found! ------");
				
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();

	}

}
