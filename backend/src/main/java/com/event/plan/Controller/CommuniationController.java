package com.event.plan.Controller;

import com.event.plan.Services.CommServiceImp;
import com.event.plan.models.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/noauth")
public class CommuniationController {
    @Autowired
    private CommServiceImp commServiceImp;

    @GetMapping("/getmsgbyid")
    public Optional<Communication> getMsgById(int id){
        return commServiceImp.getMessageByUserId(id);
    }
}
