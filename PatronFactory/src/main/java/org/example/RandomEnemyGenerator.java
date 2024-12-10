package org.example;

public class RandomEnemyGenerator {
    private EnemyFactory factory;

    public RandomEnemyGenerator(EnemyFactory factory) {
        this.factory = factory;
    }

    public Enemy generateRandomEnemy(){
        double valorRandom = Math.random();

        if (valorRandom < 0.5){
            System.out.println("Se ha creado un enemigo normal");
            return new NormalEnemy();

        }else {
            System.out.println("Se ha creado un enemigo Jefe");
            return new BossEnemy();
        }
    }
}
