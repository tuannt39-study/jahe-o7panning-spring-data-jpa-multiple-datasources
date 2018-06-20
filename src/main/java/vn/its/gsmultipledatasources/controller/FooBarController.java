package vn.its.gsmultipledatasources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.its.gsmultipledatasources.bar.domain.Bar;
import vn.its.gsmultipledatasources.bar.repo.BarRepository;
import vn.its.gsmultipledatasources.foo.domain.Foo;
import vn.its.gsmultipledatasources.foo.repo.FooRepository;

@RestController
public class FooBarController {

    private final FooRepository fooRepo;
    private final BarRepository barRepo;

    @Autowired
    FooBarController(FooRepository fooRepo, BarRepository barRepo) {
        this.fooRepo = fooRepo;
        this.barRepo = barRepo;
    }

    // http://localhost:8080/foobar/1
    @RequestMapping("/foobar/{id}")
    public String fooBar(@PathVariable("id") Long id) {
        Foo foo = fooRepo.findOne(id);
        Bar bar = barRepo.findOne(id);
        return foo.toString() + " " + bar.toString() + "!";
    }

}
