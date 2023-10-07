package com.example.order.domain.entity;


import com.example.order.exception.DisCorrectInputException;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Data
public class LocationCoordinate {

    private final String startLatitude;
    private final String startLongitude;
    private final String endLatitude;
    private final String endLongitude;
    private int distance;

    private static final double MaxLatitude = 80;
    private static final double MinLatitude = -80;
    private static final double MaxLongitude = 180;
    private static final double MinLongitude = -180;


    public LocationCoordinate(String startLatitude, String startLongitude, String endLatitude, String endLongitude) {
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        //this.checkLatitude(this.startLatitude);
        //this.checkLongitude(this.startLongitude);
        //this.checkLatitude(this.endLatitude);
        //this.checkLongitude(this.endLongitude);
    }


    /**
     * check the input Latitude;
     *
     * @param latitude String
     */
    public void checkLatitude(String latitude){
         if(0 > Double.valueOf(latitude).compareTo(MaxLatitude) || 0 < Double.valueOf(latitude).compareTo(MinLatitude)){
             throw(new DisCorrectInputException("input latitude is not correct"));
         };
    }

    /**
     * check the input Longitude;
     *
     * @param longitude String
     */
    public void checkLongitude(String longitude){
        if(0 > Double.valueOf(longitude).compareTo(MaxLongitude) || 0 < Double.valueOf(longitude).compareTo(MinLongitude)){
            throw(new DisCorrectInputException("input longitude is not correct"));
        };
    }

}
