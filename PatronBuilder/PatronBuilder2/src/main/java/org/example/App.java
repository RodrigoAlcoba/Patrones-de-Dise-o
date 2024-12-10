package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       Character character = new Character.Builder()
               .setName("Jett")
               .setRace("Duelista")
               .setCharacterClass("Duelista")
               .addSkill("Salto")
               .addSkill("Humo")
               .addSkill("Cuchillos")
               .build();

        System.out.println(character);
    }
}
