package vn.its.gsmultipledatasources.foo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FOO")
public class Foo {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="foo_id_seq")
  @SequenceGenerator(name="foo_id_seq", sequenceName="foo_id_seq", allocationSize=1)
  @Column(name = "ID")
  private Long id;

  @Column(name = "FOO")
  private String foo;

  public Foo() {
  }

  public Foo(String foo) {
    this.foo = foo;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }

  @Override
  public String toString() {
    return "Foo{" +
            "id=" + id +
            ", foo='" + foo + '\'' +
            '}';
  }
}
