package org.example;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private  String race;
    private  String characterClass;
    private final List<String> skills;


    public Character() {
        skills = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public List<String> getSkills() {
        return skills;
    }


    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", skills=" + skills +
                '}';
    }

    public static class Builder{
        private Character character;

        public Builder() {
            this.character = new Character();
        }

        public Builder setName(String name){
            character.name = name;
            return this;
        }
        public Builder setRace(String race) {
            character.race = race;
            return this;
        }

        public Builder setCharacterClass(String characterClass) {
            character.characterClass = characterClass;
            return this;
        }

        public Builder addSkill(String skill){
            character.skills.add(skill);
            return this;
        }

        public Character build(){
            if(character.getName() != null && character.getCharacterClass() != null && character.getRace()
            != null && character.getSkills().size() > 0 && character.getSkills() != null){
                System.out.println("Personaje creado con exito");
                return character;
            } else {
                System.out.println("Debe completar todos los atributos");
            }
            return character;
        }


    }
}
