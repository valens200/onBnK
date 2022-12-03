package rw.ac.rca.smis.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mark")
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }




    private int scoredMark;
    public int getScoredMark() {
        return scoredMark;
    }
    public void setScoredMark(int scoredMark) {
        this.scoredMark = scoredMark;
    }
}
