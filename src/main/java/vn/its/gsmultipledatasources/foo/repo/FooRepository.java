package vn.its.gsmultipledatasources.foo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.its.gsmultipledatasources.foo.domain.Foo;

@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {

}
