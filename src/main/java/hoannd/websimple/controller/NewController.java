package hoannd.websimple.controller;

import hoannd.websimple.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class NewController {
    @Autowired
    private NewService iNewService;

}
