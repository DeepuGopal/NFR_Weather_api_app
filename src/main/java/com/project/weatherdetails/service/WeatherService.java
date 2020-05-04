package com.project.weatherdetails.service;

import com.project.weatherdetails.model.ResponseView;
import com.project.weatherdetails.model.WeatherReport;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {
    ArrayList<ResponseView> resultlist=new ArrayList<ResponseView>();
    public  ResponseView getWeatherReport(String city){
        String apikey="d64c457ecdaf56e26b1112fb8f9e3252";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherReport> response = restTemplate
                .getForEntity("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=" + apikey, WeatherReport.class);
        float temp = response.getBody().getMain().getTemp();
        float temp_min= response.getBody().getMain().getTemp_min();
        float temp_max=response.getBody().getMain().getTemp_max();
        float pressure= response.getBody().getMain().getPressure();
        float humidity= response.getBody().getMain().getHumidity();
        float speed= response.getBody().getWind().getSpeed();
        float deg= response.getBody().getWind().getDeg();
        String location= response.getBody().getName();

        ResponseView result=new ResponseView(location,temp_min,temp_max,temp,pressure,humidity,speed,deg);
        return result;
    }
    public List<ResponseView> getUstWeatherReports() {
        String apikey="d64c457ecdaf56e26b1112fb8f9e3252";
        String[] str = {"atlanta,georgia","madrid,spain","trivandrum","chennai,india","cochin,india"};
        for(int i=0;i<str.length;i++){
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<WeatherReport> response= restTemplate
                    .getForEntity("https://api.openweathermap.org/data/2.5/weather?q=" + str[i] + "&APPID=" + apikey, WeatherReport.class);
            float temp = response.getBody().getMain().getTemp();
            float temp_min= response.getBody().getMain().getTemp_min();
            float temp_max=response.getBody().getMain().getTemp_max();
            float pressure= response.getBody().getMain().getPressure();
            float humidity= response.getBody().getMain().getHumidity();
            float speed= response.getBody().getWind().getSpeed();
            float deg= response.getBody().getWind().getDeg();
            String location= response.getBody().getName();
            ResponseView result=new ResponseView(location,temp_min,temp_max,temp,pressure,humidity,speed,deg);
            resultlist.add(result);
        }
        return resultlist;
    }}
