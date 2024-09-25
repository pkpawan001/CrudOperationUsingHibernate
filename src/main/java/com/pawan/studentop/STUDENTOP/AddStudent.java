package com.pawan.studentop.STUDENTOP;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class AddStudent 
{
    public static void main( String[] args )
    {
     AddStudentDetails student1=new AddStudentDetails();
     
     student1.setName("pawan singh");
     student1.setRollNum(000001);
     student1.setCollageName("S R C MZn");
     student1.setBranch("BCA");
     student1.setSection("A");
     student1.setAge(20);
     
     AddStudentDetails student2=new AddStudentDetails();
     
     
     student2.setName("pawan singh");
     student2.setRollNum(000001);
     student2.setCollageName("S R C MZn");
     student2.setBranch("BCA");
     student2.setSection("A");
     student2.setAge(20);
     
     
     
     
     CourseStructure cs1=new  CourseStructure();
     cs1.setCourseId(101);
     cs1.setCourseName("BCA");
     cs1.setCourseFee(100000);
     
     CourseStructure cs2=new  CourseStructure();
     cs2.setCourseId(102);
     cs2.setCourseName("BCA");
     cs2.setCourseFee(100000);
     
     CourseStructure cs3=new  CourseStructure();
     cs3.setCourseId(103);
     cs3.setCourseName("BCA");
     cs3.setCourseFee(100000);
     
     
//     student1.setCourse(cs1);
//     student1.setCourse(cs2);
//     student1.setCourse(cs3);
    	
    	
    	
    	
    	Configuration cnfg=new Configuration().configure().addAnnotatedClass( AddStudentDetails.class);
        SessionFactory sf=cnfg.buildSessionFactory();
        Session secc=sf.openSession();
        Transaction tx=secc.beginTransaction();
        
        secc.save(student1);
        secc.save(student2);
        secc.save(cs1);
        secc.save(cs2);
        secc.save(cs3);
        
        
        
        tx.commit();
        secc.close();
        
    }
}
