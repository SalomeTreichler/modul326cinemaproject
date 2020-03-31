package ch.tbz.cinema.domainModels.costumer;

import ch.tbz.cinema.config.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name="costumer")
public class Costumer extends ExtendedEntity {
    @Column(name = "name", nullable=false)
    private String name;

    @Column(name = "first_name", nullable=false)
    private String firstName;

    @Column(name = "phone_number", nullable=false)
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
