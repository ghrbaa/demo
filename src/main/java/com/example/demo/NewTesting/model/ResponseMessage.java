package com.example.demo.NewTesting.model;

public class ResponseMessage {
    private Integer status;
    private String message;
    private String transaction_id;
    private String query_trx_id;
    private Integer took;
    private Object data;

    public ResponseMessage(Integer status, String message, String transaction_id, String query_trx_id, Integer took, Object data) {
        this.status = status;
        this.message = message;
        this.transaction_id = transaction_id;
        this.query_trx_id = query_trx_id;
        this.took = took;
        this.data = data;
    }

    public ResponseMessage(){

    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getQuery_trx_id() {
        return query_trx_id;
    }

    public void setQuery_trx_id(String query_trx_id) {
        this.query_trx_id = query_trx_id;
    }

    public Integer getTook() {
        return took;
    }

    public void setTook(Integer took) {
        this.took = took;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
