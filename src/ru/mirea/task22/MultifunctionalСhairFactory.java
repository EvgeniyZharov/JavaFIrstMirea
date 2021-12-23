package ru.mirea.task22;

public class MultifunctionalСhairFactory implements ChairFactory{
    @Override
    public Chair createChair() {
        return new MultifunctionalСhair();
    }
}
