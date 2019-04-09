package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.template.vo.ResponseVO;
import com.example.template.vo.UserVO;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseVO<?> getUsers() {
        ResponseVO<List<UserVO>> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        
        list.add(new UserVO("JM", "01037667149"));

        ObjectMapper om = new ObjectMapper();

        String sJson="";
        try {
            sJson =  om.writeValueAsString(list);
        } catch (Exception e) {
            //TODO: handle exception
        }

        resp.setResponse(sJson);

        return resp;
    }

    @GetMapping("/{id}")
    public ResponseVO<?> getUser(@PathVariable String id) {
        ResponseVO<UserVO> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO(id, "01037667149"));
        
        
        ObjectMapper om = new ObjectMapper();

        String sJson="";
        try {
            sJson =  om.writeValueAsString(list);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        resp.setResponse(sJson);

        return resp;
    }

}