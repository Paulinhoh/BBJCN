package edu.paulinhoh.poo.herancapolimorfismo.exercicios.relogios.domains;

public non-sealed class BRClock extends Clock {

    @Override
    public Clock convert(Clock clock) {
        this.minutes = clock.getMinutes();
        this.seconds = clock.getSeconds();

        switch (clock) {
            case BRClock brClock -> this.hour = brClock.getHour();
            case USClock usClock ->
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();
        }
        return this;
    }

}