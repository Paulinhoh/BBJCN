package edu.paulinhoh.poo.herancapolimorfismo.exercicios.relogios.domains;

public sealed abstract class Clock permits BRClock, USClock {

    // Attributes
    protected int hour;
    protected int minutes;
    protected int seconds;

    // Setters
    public void setHour(int hour) {
        if (hour >= 24) {
            this.hour = 24;
            return;
        }

        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60) {
            this.minutes = 60;
            return;
        }

        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 60) {
            this.seconds = 60;
            return;
        }

        this.seconds = seconds;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Methods
    private String formart(int value) {
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    public String getTime() {
        return formart(hour) + ":" + formart(minutes) + ":" + formart(seconds);
    }

    abstract Clock convert(Clock clock);
}