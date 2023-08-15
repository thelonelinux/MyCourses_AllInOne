package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.hibernate.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml"); 
		SessionFactory sfactory = config.buildSessionFactory();
		
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Pankaj");
		st.setStudentEmail("pankaj@gmail.com");
		
		session.save(st);
		System.out.println("-------------------------------------------------------------------");
		
		tx.commit();
		
		session.close();
		sfactory.close();
	}

}
