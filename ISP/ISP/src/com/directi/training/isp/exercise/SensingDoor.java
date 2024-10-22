package com.directi.training.isp.exercise;

public class SensingDoor implements Lockable, Openable, ProximitySensing
{
    private boolean _locked;
    private boolean _opened;

    public SensingDoor(Sensor sensor)
    {
        sensor.register(this);  // Register for proximity sensing
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    @Override
    public void proximityCallback()  // This method must be defined as part of ProximitySensing
    {
        _opened = true;
    }
}
