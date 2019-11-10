package entities;

import javax.persistence.*;

@Entity
@Table(name = "TABLES")
public class Tables {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int tableId;

    @Column(name = "TABLENUMBER")
    private int tableNumber;

    @Column(name = "SEATS")
    private int seats;

    @OneToOne(mappedBy = "TABLES")
    private Reservations reservations;

    public Reservations getReservations() {
        return reservations;
    }

    public Tables(int number, int seats) {
        this.tableNumber = number;
        this.seats = seats;
    }

    public void setReservations(Reservations reservations) {
        this.reservations = reservations;
    }

    public Tables() {
    }

    public int getSeats() {
        return seats;
    }

    public int getTableId() {
        return tableId;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

}
