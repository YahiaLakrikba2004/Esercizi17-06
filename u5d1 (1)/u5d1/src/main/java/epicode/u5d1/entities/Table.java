package epicode.u5d1.entities;


import lombok.Data;

@Data
public class Table {
    private int tableNumber;
    private int maxSeats;
    private boolean occupied;

    public Table(int tableNumber, int maxSeats) {
        this.tableNumber = tableNumber;
        this.maxSeats = maxSeats;
        this.occupied = false;
    }
}

