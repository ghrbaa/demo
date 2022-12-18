package com.example.demo.NewTesting.Repo;

import com.example.demo.NewTesting.Models.ResponseMessage;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public interface ResponseMessageRespository {

//    ResponseMessage gettingAll();
    ResponseMessage getProfileByMsisdn(String msisdn);


//    ResponseMessage getUnpaidRecordByMsisdn(String msisdn);
}
