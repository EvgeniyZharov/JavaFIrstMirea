package ru.mirea.task22;

public class MagicСhairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new MagicСhair();
    }
}
