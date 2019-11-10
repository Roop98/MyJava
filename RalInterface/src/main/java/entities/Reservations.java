package entities;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "RESERVATIONS")
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int tableId;

    @Column(name = "NAME")
    private int name;

    @Column(name = "TIME")
    private Timestamp time;

    @Column(name = "COUNT")
    private int count;

    @OneToOne
    @JoinColumn(name = "TABLE_ID")
    private Tables tables;

    public Reservations() {
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Tables getTables() {
        return tables;
    }

    public int getCount() {
        return count;
    }

    public int getName() {
        return name;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}

