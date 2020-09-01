package ru.korchagin.springcourse;

public class RockMusic implements Music {
    private RockMusic() {}          // Приватный конструктор, блокирующий операцию new.

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Wind cries Mary" + this;
    }
}
