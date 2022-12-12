package com.example.demo.NewTesting.controller;

import com.example.demo.NewTesting.Repo.ResponseMessageRespository;
import com.example.demo.NewTesting.model.ResponseMessage;
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

    @GetMapping("/get_all")
    public ResponseEntity<ResponseMessage> gettingAll(){
        ResponseMessage response = rmr.gettingAll();

        if(response.getStatus()== HttpStatus.OK.value()){
            return ResponseEntity.status(200).body(response);
        }else {
            return ResponseEntity.status(400).body(response);
        }
    }

    @GetMapping("/get_id/{msisdn}")
    public ResponseEntity<ResponseMessage> getById(@PathVariable String msisdn){
        ResponseMessage responseMessage = rmr.getProfileByMsisdn(msisdn);

        if (responseMessage.getStatus() == HttpStatus.OK.value()){
            return ResponseEntity.status(200).body(responseMessage);
        }else {
            return ResponseEntity.status(400).body(responseMessage);
        }
    }
}
