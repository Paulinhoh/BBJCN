package edu.paulinhoh.poo.herancapolimorfismo.exercicios.relogios.domains;

public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public void setHour(int hour) {
        setBeforeMidDay();

        if ((hour >= 12) && (hour < 24)) {
            setAfterMidDay();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay() {
        this.periodIndicator = "AM";
    }

    @Override
    public Clock convert(Clock clock) {
        this.minutes = clock.getMinutes();
        this.seconds = clock.getSeconds();

        switch (clock) {
            case BRClock brClock -> this.setHour(brClock.getHour());
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
        }

        return this;
    }

    @Override
    public String toString() {
        return super.getTime() + " " + this.periodIndicator;
    }

}