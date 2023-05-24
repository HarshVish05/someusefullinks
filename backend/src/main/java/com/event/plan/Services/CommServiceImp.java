package com.event.plan.Services;

import com.event.plan.Dao.CommDao;
import com.event.plan.models.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CommServiceImp implements CommService{
    @Autowired
    private CommDao commdao;
    @Override
    public Optional<Communication> getMessageByUserId(int user_id) {
        return commdao.findById(user_id);
    }
}
