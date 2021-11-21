package com.prateektiwari.cabbooking.strategies;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prateektiwari.cabbooking.model.Cab;
import com.prateektiwari.cabbooking.model.Location;
import com.prateektiwari.cabbooking.model.Rider;

import lombok.NonNull;

@Service
public class DefaultCabMatchingStrategy implements CabMatchingStrategy {

  @Override
  public Cab matchCabToRider(
      @NonNull final Rider rider,
      @NonNull final List<Cab> candidateCabs,
      @NonNull final Location fromPoint,
      @NonNull final Location toPoint) {
    if (candidateCabs.isEmpty()) {
      return null;
    }
    return candidateCabs.get(0);
  }
}
