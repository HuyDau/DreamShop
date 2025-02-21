package com.dailycodework.dream.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ApiResponse {
    private String message;
    private Object data;


    public ApiResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
