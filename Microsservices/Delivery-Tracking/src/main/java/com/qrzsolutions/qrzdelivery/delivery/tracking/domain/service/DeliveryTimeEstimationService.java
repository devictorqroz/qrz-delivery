package com.qrzsolutions.qrzdelivery.delivery.tracking.domain.service;

import com.qrzsolutions.qrzdelivery.delivery.tracking.domain.model.ContactPoint;

public interface DeliveryTimeEstimationService {
    DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver);
}
