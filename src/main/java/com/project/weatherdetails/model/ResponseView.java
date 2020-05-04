package com.project.weatherdetails.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseView {
    @JsonProperty("Name of the City")
    String location;
    @JsonProperty("Minimum Temperature in Kelvin")
    float temp_min;
    @JsonProperty("Maximum Temperature in Kelvin")
    float temp_max;
    @JsonProperty("Current Temperature in Kelvin")
    float temp;
    @JsonProperty("Atmospheric Pressure ")
    float pressure;
    @JsonProperty("Atmospheric Humidity ")
    float humidity;
    @JsonProperty("Speed of Wind in meter/sec ")
    float speed;
    @JsonProperty("Direction of Wind in Degrees ")
    float deg;

    public ResponseView() {
    }


    public ResponseView(String location,float temp_min, float temp_max, float temp, float pressure, float humidity, float speed, float deg) {
        this.location=location;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.speed = speed;
        this.deg = deg;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }
}
