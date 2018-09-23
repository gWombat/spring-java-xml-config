package fr.gwombat.springjavaxmlconfig.controller;

import fr.gwombat.springjavaxmlconfig.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guillaume.
 *
 * @since 15/09/2018
 */
@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private CustomService customService;

    @GetMapping
    public String value() {
        return customService.getValue();
    }

}
