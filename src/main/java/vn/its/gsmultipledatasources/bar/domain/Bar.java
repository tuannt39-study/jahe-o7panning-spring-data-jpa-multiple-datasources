package vn.its.gsmultipledatasources.bar.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BAR")
public class Bar {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="bar_id_seq")
  @SequenceGenerator(name="bar_id_seq", sequenceName="bar_id_seq", allocationSize=1)
  @Column(name = "ID")
  private Long id;

  @Column(name = "BAR")
  private String bar;

  public Bar() {
  }

  public Bar(String bar) {
    this.bar = bar;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBar() {
    return bar;
  }

  public void setBar(String bar) {
    this.bar = bar;
  }

  @Override
  public String toString() {
    return "Bar{" +
            "id=" + id +
            ", bar='" + bar + '\'' +
            '}';
  }
}
