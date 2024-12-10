package org.example;

public class NormalEnemyFactory implements EnemyFactory{

    @Override
    public Enemy createEnemy() {

        return new NormalEnemy();
    }
}
