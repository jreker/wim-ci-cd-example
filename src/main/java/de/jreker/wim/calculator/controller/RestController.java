package de.jreker.wim.calculator.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import de.jreker.wim.calculator.entity.CalculationResult;
import de.jreker.wim.calculator.entity.Square;
import de.jreker.wim.calculator.util.Calculator;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    BuildProperties buildProperties;

    @Autowired
    Calculator calculator;

    @PostMapping("/calc/square")
    public ResponseEntity<CalculationResult> calcCube(@RequestBody Square square) {
        return ResponseEntity.ok(calculator.calculateSquare(square));
    }

    @GetMapping("/")
    public ResponseEntity<?> hello() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return ResponseEntity.ok("Hello World at " + dtf.format(now) + ":-)");
    }

    @GetMapping("/version")
    public ResponseEntity<BuildProperties> getVersion() {
        return ResponseEntity.ok(buildProperties);
    }
}
