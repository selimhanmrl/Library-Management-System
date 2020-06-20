import java.time.LocalDateTime;
/**
 * abstract Inventory class which implements InventoryInterface interface
 */
public abstract class Inventory implements InventoryInterface{

    /**
     * Holds ID of a book, table
     */
<<<<<<< HEAD
    private String ID;
=======
    private int ID;
>>>>>>> 3438362a2510b9fd78973b91e6a3357fadbdce14

    /**
     * Holds status of a book, table
     */
    private boolean status;

    /**
     * Holds time of a book, table
     */
    private LocalDateTime time;

    /**
     * Constructor
     * @param id to be assigned
     * @param status to be assigned
     * @param time to be assigned
     */
<<<<<<< HEAD

    protected Inventory(String id, boolean status, LocalDateTime time) {
=======
    protected Inventory(int id, boolean status, LocalDateTime time) {
>>>>>>> 3438362a2510b9fd78973b91e6a3357fadbdce14
        this.ID = id;
        this.status = status;
        this.time = time;
    }

    /**
     * Default constructor
     */
    public  Inventory() {}

    /**
     * Checks whether table or book are available or not
     */
    @Override
    public boolean isAvailable(){
        return status;
    }
    /**
     * Changes status of a book,table
     */
    @Override
    public abstract void changeStatus();

    /**
     * Updates time of a book, table
     */
    @Override
    public abstract void updateTime() ;


    /**
     * Setters and getters
     */
<<<<<<< HEAD
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
=======
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
>>>>>>> 3438362a2510b9fd78973b91e6a3357fadbdce14
        this.ID = ID;
    }
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

}
