package com.prateektiwari.cabbooking.strategies;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.prateektiwari.cabbooking.model.Cab;
import com.prateektiwari.cabbooking.model.Location;
import com.prateektiwari.cabbooking.model.Rider;

@Repository
public interface CabMatchingStrategy {

  Cab matchCabToRider(Rider rider, List<Cab> candidateCabs, Location fromPoint, Location toPoint);
}
