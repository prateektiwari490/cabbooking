package com.prateektiwari.cabbooking.strategies;

import org.springframework.stereotype.Component;

import com.prateektiwari.cabbooking.model.Location;

public interface PricingStrategy {
  Double findPrice(Location fromPoint, Location toPoint);
}
