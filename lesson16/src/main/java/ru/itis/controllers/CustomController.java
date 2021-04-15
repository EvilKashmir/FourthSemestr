package ru.itis.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.models.Row;

@RestController
public class CustomController {

    private static Long id = 1L;

    @GetMapping(value = "/api/row", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Row sendRow() {
        return new Row(id, "test" + id, (int)(id++ * 2));
    }
}
