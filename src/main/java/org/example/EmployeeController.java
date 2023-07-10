package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * boomizewar created on 06/07/2023
 */
@RestController
public class EmployeeController {

    @GetMapping("/sonartest")
    List<String> all() {
        List<String> dataLst = new ArrayList<>();
        String data = "Hello world.!!!";
        dataLst.add(data);
        return dataLst;
    }
}
