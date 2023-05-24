package com.event.plan.Services;

import com.event.plan.models.Booking;
import com.event.plan.models.Communication;

import java.util.Optional;

public interface CommService {

    Optional<Communication> getMessageByUserId(int user_id);
}
