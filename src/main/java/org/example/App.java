package org.example;

import com.solvd.exceptions.ReservationDeniedException;
import com.solvd.exceptions.SalaryZeroException;
import com.solvd.linkedList.LinkedList;
import com.solvd.model.person.Employee;
import com.solvd.model.person.Person;
import com.solvd.model.person.Professor;
import com.solvd.model.person.Student;
import com.solvd.model.university.ExclusiveRoom;
import com.solvd.model.university.Reservation;
import com.solvd.model.university.Room;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;


public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Room r1= new ExclusiveRoom(10);
        Person p1= new Student(20,"Leo", 1.75f,75.0f);
        Date d1= new Date(122,4,1);
        try{
            Reservation reservation1= new Reservation(d1,r1,p1);
        }catch (ReservationDeniedException e){
            logger.error(e);
        }
        try {
            Employee e1 = new Professor(35, "Chad", 1.8f, 79.3f, 0);
        }catch (SalaryZeroException e){
            logger.error(e);
        }
        LinkedList<Integer> list= new LinkedList();
        try{
            list.add(new Integer(2));
            list.add(2, new Integer(1));

        }catch (Exception e){
            logger.error(e);
        }
    }
}




















