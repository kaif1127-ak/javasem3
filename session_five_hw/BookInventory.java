
public class BookInventory {

    private int copiesTotal;
    private int copiesAvailable;

    public BookInventory(int copiesTotal) {
        if (copiesTotal > 0 && copiesTotal <= 500) {
            this.copiesTotal = copiesTotal;
            this.copiesAvailable = copiesTotal;
        } else {
            this.copiesTotal = 0;
            this.copiesAvailable = 0;
        }
    }

    public void checkOut() {
        if (copiesAvailable > 0) {
            copiesAvailable--;
        }
    }

    public void checkIn() {
        if (copiesAvailable < copiesTotal) {
            copiesAvailable++;
        }
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}
