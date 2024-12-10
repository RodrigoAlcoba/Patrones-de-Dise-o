package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        EnemyFactory normalEnemyFactory = new NormalEnemyFactory();

        Enemy noramlEnemy = normalEnemyFactory.createEnemy();

        EnemyFactory bossEnemyFactory = new BossEnemyFactory();

        Enemy bossEnemy =bossEnemyFactory.createEnemy();

        RandomEnemyGenerator enemigoAleatorio = new RandomEnemyGenerator(bossEnemyFactory);

      Enemy Aleatorio = enemigoAleatorio.generateRandomEnemy();

        System.out.println(Aleatorio);
    }
}
