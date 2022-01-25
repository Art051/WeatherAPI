package com.example.WeatherAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
public class Controller {

    private final ReportService reportService;

    public Controller(ReportService reportService) {
        this.reportService = reportService;
    }


    @GetMapping(path = "/{cityName}")
    public Mono<MainResponse> getMainResponse(@PathVariable("cityName") String cityName){
        return reportService.getMainResponse(cityName);

    }
}
