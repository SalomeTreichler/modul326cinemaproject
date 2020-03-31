package ch.tbz.cinema.domainModels.theatre;

import ch.tbz.cinema.config.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "theatre")
public class Theatre extends ExtendedEntity {
  @Column(name = "name")
  private String name;

}
