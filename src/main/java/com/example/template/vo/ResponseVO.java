package com.example.template.vo;

import lombok.Data;

@Data
public class ResponseVO<T> {
    
    private String message;
    private boolean check = true;
    private String response;

	// public void setResponse(String sJson) {
	// }
        /**
         * @param response the response to set
         */
        public void setResponse(String response) {
            this.response = response;
        }
}