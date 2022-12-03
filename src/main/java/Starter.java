
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import rw.ac.rca.smis.orm.Address;
import rw.ac.rca.smis.orm.Course;
import rw.ac.rca.smis.orm.Instructor;
import rw.ac.rca.smis.orm.Mark;
import rw.ac.rca.smis.orm.Student;

public class Starter {

    public static void main(String[] args) {
        try{
            Address add= new Address("Kigali","KN59 ST 13");

            Date date = new Date();
            Instructor eden = new Instructor("Rwagaju Aphrodice",date,'M');
            Course course1 = new Course(eden, 5, "python", 12);
            Student student1 = new Student(new Date(), "male", "vav");

            @SuppressWarnings("deprecation")
            Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");

            System.out.println("openning the session...............");

            @SuppressWarnings("deprecation")
            SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession();

            System.out.println(" Beginning transaction...........");
            Transaction transaction = session.beginTransaction();

            session.saveOrUpdate(student1);
            transaction.commit();
            session.close();
            factory.close();


        }catch (Exception exception){
            System.out.println( "Exception : " + exception);
        }

    }
}
