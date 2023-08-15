package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Aditya'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentId IN (102, 104, 200, 215, 108)";
		String hql = "from co.edureka.hibernate.entity.Student where studentId between 101 and 106";
		
		Query<Student> query = session.createQuery(hql, Student.class);
		List<Student> students = query.getResultList();
		displayStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(0, 102);
		query.setParameter(1, 108);
		
		List<Student> students = query.getResultList();
		displayStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("minsid", 108);
		query.setParameter("maxsid", 200);
		
		List<Student> students = query.getResultList();
		displayStudents(students);		
		*/
		
		//--- updating a record
		session.beginTransaction();
		
		String hql = "update co.edureka.hibernate.entity.Student set studentName='AMOL ASHOK' where studentId=102";
		Query<?> query = session.createQuery(hql);
		int studentsAffected =query.executeUpdate();
		System.out.println("no of students updated = " + studentsAffected);
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}

	private static void displayStudents(List<Student> students) {
		for(Student st : students) {
			System.out.println(st);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}		
	}
}
