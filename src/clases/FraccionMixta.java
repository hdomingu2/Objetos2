/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author hdomingu2
 */
public class FraccionMixta {
    private int numerador;
    private int denominador;

    public FraccionMixta(int numerador, int denominador) throws DenominadorCeroException {
        this.numerador = numerador;
        this.denominador = denominador;

        if (denominador == 0) {
            throw new DenominadorCeroException();
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public FraccionMixta Suma(FraccionMixta m2) throws DenominadorCeroException {
        FraccionMixta aux;
        int num, dem;

        num = (this.numerador * m2.denominador) + (this.denominador * m2.numerador);
        dem = this.denominador * m2.denominador;

        aux = new FraccionMixta(num, dem);
        return aux;
    }

    public FraccionMixta Resta(FraccionMixta m2) throws DenominadorCeroException {
        FraccionMixta aux;
        int num, dem;

        num = (this.numerador * m2.denominador) - (this.denominador * m2.numerador);
        dem = this.denominador * m2.denominador;

        aux= new FraccionMixta(num, dem);
        return aux;
    }

    public FraccionMixta Multiplicacion(FraccionMixta m2) throws DenominadorCeroException {
        FraccionMixta aux;
        int num, dem;

        num = this.numerador * m2.numerador;
        dem = this.denominador * m2.denominador;

        aux = new FraccionMixta(num, dem);
        return aux;
    }

    public FraccionMixta Division(FraccionMixta m2) throws DenominadorCeroException {
        FraccionMixta aux;
        int num, dem;

        num = this.numerador * m2.denominador;
        dem = this.denominador * m2.numerador;

        aux = new FraccionMixta(num, dem);
        return aux;
    }
}
