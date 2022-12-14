package com.example.demo.NewTesting.Controller;

import com.example.demo.NewTesting.Repo.ResponseMessageRespository;
import com.example.demo.NewTesting.Models.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/testing")
public class ResponsMessageController {
    @Autowired
    ResponseMessageRespository rmr;

//    @GetMapping("/unpaid/{msisdn}")
//    public ResponseEntity<ResponseMessage> getUnpaid(@PathVariable String msisdn){
//        ResponseMessage response = rmr.getUnpaidRecordByMsisdn(msisdn);
//
//        if(response.getStatus() == HttpStatus.OK.value()){
//            return ResponseEntity.status(200).body(response);
//        }else {
//            return ResponseEntity.status(400).body(response);
//        }
//    }

    @GetMapping("/data/{msisdn}")
    public ResponseEntity<ResponseMessage> getById(@PathVariable String msisdn){
        ResponseMessage responseMessage = rmr.getProfileByMsisdn(msisdn);

        if (responseMessage.getStatus() == HttpStatus.OK.value()){
            return ResponseEntity.status(200).body(responseMessage);
        }else {
            return ResponseEntity.status(400).body(responseMessage);
        }
    }
}
