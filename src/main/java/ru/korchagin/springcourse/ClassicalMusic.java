package ru.korchagin.springcourse;

public class ClassicalMusic implements Music {

    public void doMyInit() {
        System.out.println("Doing ClassicalMusic initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing ClassicalMusic destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
