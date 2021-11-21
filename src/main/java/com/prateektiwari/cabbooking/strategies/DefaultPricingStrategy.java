package com.prateektiwari.cabbooking.strategies;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prateektiwari.cabbooking.model.Location;

@Service
public class DefaultPricingStrategy implements PricingStrategy {

  public static final Double PER_KM_RATE = 10.0;

  @Override
  public Double findPrice(Location fromPoint, Location toPoint) {
    return fromPoint.distance(toPoint) * PER_KM_RATE;
  }
}
