package vn.its.gsmultipledatasources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.its.gsmultipledatasources.dao.AdvertiserDAO;
import vn.its.gsmultipledatasources.dao.PublisherDAO;
import vn.its.gsmultipledatasources.entity1.Publisher;
import vn.its.gsmultipledatasources.entity2.Advertiser;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private PublisherDAO publisherDAO;

    @Autowired
    private AdvertiserDAO advertiserDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage(Model model) {

        List<Advertiser> advertisers = advertiserDAO.listAdvertisers();
        List<Publisher> publishers = publisherDAO.listPublishers();

        model.addAttribute("advertisers", advertisers);
        model.addAttribute("publishers", publishers);

        return "home";
    }

}