package jk.abm.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by wontschel on 17.04.2016.
 */
public class AudioBook {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="state")
    private int state;

    @Column(name="last_scan")
    private Date lastScan;


    public AudioBook(int id, String name, int state, Date lastScan){
        setId(id);
        setName(name);
        setState(state);
        setLastScan(lastScan);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getLastScan() {
        return lastScan;
    }

    public void setLastScan(Date lastScan) {
        this.lastScan = lastScan;
    }
}
