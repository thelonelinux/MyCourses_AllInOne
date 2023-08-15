package co.edureka.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		session.beginTransaction();
		
		/*
		//-- approach-1 deleting student
		Student st = new Student(101, "Sunil Joseph", "sunil@edureka.co");
		session.delete(st);
		*/
		
		//-- approach-2 updating student
		Scanner sc =new Scanner(System.in);
		
		Student st = session.get(Student.class, 115);
		if(st != null) {
			System.out.println(st);
			
			System.out.print("do you want to delete student[Y/N]: ");
			String req = sc.next();
			
			if(req.equalsIgnoreCase("Y")) {
				session.delete(st);
			}
		}else {
			System.out.println("*** no matching student found ***");
		}
		
		session.getTransaction().commit();
		
		sc.close();
		session.close();
		sfactory.close();
	}
}