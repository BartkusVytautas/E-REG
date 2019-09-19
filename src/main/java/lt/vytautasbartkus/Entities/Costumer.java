package lt.vytautasbartkus.Entities;


import javax.persistence.*;

@Entity
@Table(name = "costumers")
public class Costumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column (name = "is_serviced")
    private boolean isServiced = false;

    @ManyToOne
    @JoinColumn(name = "specialist_id", nullable = true)
    private Specialist specialist;

    public Costumer() {
    }

    public Costumer(String name, String surname, boolean isServiced, Specialist specialist) {
        this.name = name;
        this.surname = surname;
        this.isServiced = isServiced;
        this.specialist = specialist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isServiced() {
        return isServiced;
    }

    public void setServiced(boolean serviced) {
        isServiced = serviced;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }
}
