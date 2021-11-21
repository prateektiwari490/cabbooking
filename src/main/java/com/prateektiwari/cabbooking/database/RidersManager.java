package com.prateektiwari.cabbooking.database;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.prateektiwari.cabbooking.exceptions.RiderAlreadyExistsException;
import com.prateektiwari.cabbooking.exceptions.RiderNotFoundException;
import com.prateektiwari.cabbooking.model.Rider;

import lombok.NonNull;

/** In memory database for storing jobs. */
@Component
public class RidersManager {
  Map<String, Rider> riders = new HashMap<>();

  public void createRider(@NonNull final Rider newRider) {
    if (riders.containsKey(newRider.getId())) {
      throw new RiderAlreadyExistsException();
    }
    riders.put(newRider.getId(), newRider);
  }

  public Rider getRider(@NonNull final String riderId) {
    if (!riders.containsKey(riderId)) {
      throw new RiderNotFoundException();
    }
    return riders.get(riderId);
  }
}
