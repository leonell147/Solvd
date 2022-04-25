package org.example;

import com.solvd.enums.RoomCapacities;
import com.solvd.exceptions.PaymentZeroException;
import com.solvd.model.person.Administrator;
import com.solvd.model.person.Person;
import com.solvd.model.person.Professor;
import com.solvd.model.person.Student;
import com.solvd.model.university.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Main {

    private static Logger log= LogManager.getLogger(Main.class);
    public static void main(String[] args) {


        University university = new University("UniversityDemo");
        Administrator administrator = new Administrator(34, "Travolta", 1.75f, 75.3f, 1234, university);
        Professor professor = new Professor(54, "Juan", 1.90f, 85.2f, 110);
        Department department = new Department("Computer science", administrator, new ArrayList<Professor>(),university, new ArrayList<Course>(), new ArrayList<Report>());
        university.addDepartament(department);
        department.addProfessor(professor);
        department.setAdministrator(administrator);
        Degree systemEngineering = new Degree("System Engineering", department);
        Subject languages = new Subject(systemEngineering, "Languages");
        administrator.createCourse(department, "Python", languages );
        Student student = new Student(19, "Hill", 1.88f, 65f);
        administrator.addCourse(student, department, "Python");
        administrator.addCourse(professor, department, "Python");










        //Example contact lambda

        administrator.contact(student, "Demo message", professor, (receiver, message, emitter) -> {
            receiver.addMsj(emitter, message);
        });
        student.showMessages();


        //Example make meeting lambda

        Room r = new Room("Lab", RoomCapacities.CLASSROOM_FIFTY);
        student.makeMeeting(r, "Meeting at 8am", department, (room, desc, organizer, dep) -> {
            dep.addMeeting(room, desc, organizer);
        });


        //Example generate report

        student.generateReport("Report demo", department, (name, destiny, emitter) -> {
            destiny.addReport(new Report<Person>(name, emitter));
        });

        department.showReports();

        //Example reserve room

        administrator.reserveRoom(professor, r, (prof, room) -> {
            room.addReserve(new Reservation(null, null, prof));
        });

        r.showReserves();

    }
}
