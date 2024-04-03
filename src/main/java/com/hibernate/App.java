package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.entities.Employee;
import com.hibernate.entities.PartTimeEmployee;
import com.hibernate.entities.RegularEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate-cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
        
        Transaction t=session.beginTransaction();    
            
        Employee e1=new Employee();    
        e1.setName("Gaurav Chawla");    
            
        RegularEmployee e2=new RegularEmployee();    
        e2.setName("Vivek Kumar");    
        e2.setSalary(50000);    
        e2.setBonus(5);    
            
        PartTimeEmployee e3=new PartTimeEmployee();    
        e3.setName("Arjun Kumar");    
        e3.setPayPerHour(1000);    
        e3.setContractPeriod("15 hours");    
            
        session.persist(e1);    
        session.persist(e2);    
        session.persist(e3);    
            
        t.commit();    
        session.close();    
        System.out.println("success");
    }
}
