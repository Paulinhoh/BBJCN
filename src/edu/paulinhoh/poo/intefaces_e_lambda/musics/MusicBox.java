package edu.paulinhoh.poo.intefaces_e_lambda.musics;

public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("MusicBox: playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("MusicBox: pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("MusicBox: stoping music");
    }

}