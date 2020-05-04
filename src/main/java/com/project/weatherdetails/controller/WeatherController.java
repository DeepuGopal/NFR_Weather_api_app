package com.project.weatherdetails.controller;

import com.project.weatherdetails.model.ResponseView;
import com.project.weatherdetails.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    @GetMapping (path = {"get-weather-report/{city}"})
    public ResponseView getWeatherReport(@PathVariable("city") String city) {
        return weatherService.getWeatherReport(city);
      }

    @GetMapping ("/get-ust-locations-weather-report")
    public List<ResponseView> getUstWeatherReports() {
        return weatherService.getUstWeatherReports();
    }
}
