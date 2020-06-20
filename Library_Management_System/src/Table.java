import java.time.LocalDateTime;

/**
 * Table class which extends Inventory
 */
public class Table extends Inventory{

    /**
     * Holds time for a break
     */
    private LocalDateTime breakCounter;

    /**
     * Constructor
     */
    public Table(){
        super();
    }

    /**
     * Changes status of the table
     */
    @Override
    public void changeStatus(){
        if(getStatus())
            setStatus(false);
        else
            setStatus(true);
    }

    /**
     * Updates time of a the table for 60 minutes (1 hour)
     */
    @Override
    public void updateTime() {
        setTime(getTime().plusMinutes(60));
    }

    /**
     * Constructor
     *
     * @param id     to be assigned
     * @param status to be assigned
     * @param time   to be assigned
     */
<<<<<<< HEAD
    protected Table(String id, boolean status, LocalDateTime time) {
=======
    protected Table(int id, boolean status, LocalDateTime time) {
>>>>>>> 3438362a2510b9fd78973b91e6a3357fadbdce14
        super(id, status, time);
    }
    /**
     * Setters and getters
     */
    public LocalDateTime getBreakCounter() {
        return breakCounter;
    }

    public void setBreakCounter(LocalDateTime breakCounter) {
        this.breakCounter = breakCounter;
    }
}
