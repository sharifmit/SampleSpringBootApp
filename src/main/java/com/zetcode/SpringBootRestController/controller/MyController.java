/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.zetcode.SpringBootRestController.bean.City;
import com.zetcode.SpringBootRestController.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Safarifone
 */
@RestController
@RequestMapping("/")
public class MyController {
    
    @Autowired
    ICityService cityService;
    
    @RequestMapping(value = "/getCities")
    public List<City> getCities() {

        List<City> cities = cityService.findAll();
        
        return cities;
    }
}