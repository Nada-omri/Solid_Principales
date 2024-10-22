package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    // Updated method to accept ProximitySensing instead of Door
    public void register(ProximitySensing door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}