package com.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saif23 on 11/21/2016.
 */
public class BaseResponse {

    private int responseCode;

    private List<String> errors;

    public BaseResponse()
    {
        this.errors = new ArrayList<String>();
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
