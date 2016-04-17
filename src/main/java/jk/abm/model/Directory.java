package jk.abm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by wontschel on 17.04.2016.
 */
@Entity
@Table(name="directory")
public class Directory {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="path")
    private String path;

    @Column(name="last_scan")
    private Date lastScan;

    public void Directory(int id, String path, Date lastScan){
        setId(id);
        setPath(path);
        setLastScan(lastScan);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getLastScan() {
        return lastScan;
    }

    public void setLastScan(Date lastScan) {
        this.lastScan = lastScan;
    }

}



