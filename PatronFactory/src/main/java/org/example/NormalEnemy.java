package org.example;

public class NormalEnemy implements Enemy{
    private int vida = 1000;

    private int vidas = 2;
    private boolean agresividadActivada = false;

    private int dañoPorGolpe = 100;

    public boolean isAgresividadActivada() {
        return agresividadActivada;
    }

    public int getVida() {
        return vida;
    }

    public int getVidas() {
        return vidas;
    }

    public int getDañoPorGolpe() {
        return dañoPorGolpe;
    }

    public void setDañoPorGolpe(int dañoPorGolpe) {
        this.dañoPorGolpe = dañoPorGolpe;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setAgresividadActivada(boolean agresividadActivada) {
        this.agresividadActivada = agresividadActivada;
    }

    @Override
    public void atacar() {
        if(vida <= 200){
            setAgresividadActivada(true);
        }
        if (isAgresividadActivada()){
            this.setDañoPorGolpe(getDañoPorGolpe()*4);
        }
        else {
            dañoPorGolpe = 100;
        }
    }

    @Override
    public void curarse() {
        if (getVida() <= 900) {
            setVida(getVida() + 100);
        }
        else {
            setVida(1000);
        }
    }

    @Override
    public void recibirAtaque() {
        if (getVida() <= 500){
            setVidas(getVidas() - 1);
        }else setVida(getVida() - 500);
    }

    @Override
    public String toString() {
        return "NormalEnemy{" +
                "vida=" + vida +
                ", vidas=" + vidas +
                ", agresividadActivada=" + agresividadActivada +
                ", dañoPorGolpe=" + dañoPorGolpe +
                '}';
    }
}

