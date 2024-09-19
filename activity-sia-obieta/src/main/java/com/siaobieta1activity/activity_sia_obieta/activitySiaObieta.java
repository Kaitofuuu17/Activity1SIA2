package com.siaobieta1activity.activity_sia_obieta;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class activitySiaObieta {

    @GetMapping("/obieta")
    public String activity1_Obieta() {
        
        return "<html><body style='display: graph; text-align: center; font-size: 20px'>" +
               "<div style='display: block'><h1><b>Activity 1 in SIA:<br>Simple RESTful web service API with Spring Boot</b></h1></div>" + "<br>"+
               "<div style='display: block'>Submitted by:<br>Obieta, Antoine Jusherand M.</div>" +
               "<div style='display: block'>BSIT 4-A</div>" + "<br>"+
               "<div style='display: block'>Submitted to:<br>Tomas Paolo Echaluce</div>" +
               "<div style='display: block'>Instructor</div>" +
               "</body></html>";

        
    }

   
}
