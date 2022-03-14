import java.util.Date;

public class Reservation {
    private Date date;
    private Room room;
    private Person person;

    public Reservation(Date date, Room room, Person person) {
        this.date = date;
        this.room = room;
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
