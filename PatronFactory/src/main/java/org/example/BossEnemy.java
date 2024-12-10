package org.example;

public class BossEnemy implements Enemy{

    private int vida = 1000;

    private int vidas = 3;
    private boolean agresividadActivada = false;

    private int dañoPorGolpe = 500;

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setAgresividadActivada(boolean agresividadActivada) {
        this.agresividadActivada = agresividadActivada;
    }

    public int getVida() {
        return vida;
    }

    public int getVidas() {
        return vidas;
    }

    public boolean isAgresividadActivada() {
        return agresividadActivada;
    }

    public int getDañoPorGolpe() {
        return dañoPorGolpe;
    }

    public void setDañoPorGolpe(int dañoPorGolpe) {
        this.dañoPorGolpe = dañoPorGolpe;
    }

    @Override
    public void atacar() {
        if(vida <= 1000){
            setAgresividadActivada(true);
        }
        if (isAgresividadActivada()){
            this.setDañoPorGolpe(getDañoPorGolpe()*3);
        }
        else {
            dañoPorGolpe = 500;
        }
    }

    @Override
    public void curarse() {
        if (getVida() <= 8000) {
            setVida(getVida() + 2000);
        }
        else {
            setVida(10000);
        }
    }

    @Override
    public void recibirAtaque() {
        if (getVida() <= 1000){
            setVidas(getVidas() - 1);
        }else setVida(getVida() - 1000);
    }

    @Override
    public String toString() {
        return "BossEnemy{" +
                "vida=" + vida +
                ", vidas=" + vidas +
                ", agresividadActivada=" + agresividadActivada +
                ", dañoPorGolpe=" + dañoPorGolpe +
                '}';
    }
}
