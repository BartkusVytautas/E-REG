package lt.vytautasbartkus.Entities;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "service_time")
public class ServiceTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    @OneToOne(optional = false)
    @JoinColumn(name = "costumer_id")
    private Costumer costumer;

    @Column(name = "time_started")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStarted;

    @Column(name = "time_finished")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeFinished;

    public ServiceTime() {
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public Date getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(Date timeStarted) {
        this.timeStarted = timeStarted;
    }

    public Date getTimeFinished() {
        return timeFinished;
    }

    public void setTimeFinished(Date timeFinished) {
        this.timeFinished = timeFinished;
    }

    public long timeElapsedInMills(){
        return (this.timeFinished.getTime() - this.timeStarted.getTime());
    }


}
