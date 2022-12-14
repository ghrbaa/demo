package com.example.demo.NewTesting.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseMessage {
    private Integer status;
    private String message;
    private String transaction_id;
    private String query_trx_id;
    private Integer took;
    private Object data;
    private Object unpaid_record;
    private Object paid_record;
    private Object payment_record;
}
