/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestesJava;

/**
 *
 * @author Guibson Krause
 * @author Anderson Nascimento
 */
public class Matematica
  {
    private double pi = 3.14;

    public boolean numeroPar(int n)
      {
        return n % 2 == 0;
      }

    public boolean numeroDivisivel(int dividendo, int divisor)
      {
        return dividendo % divisor == 0;
      }

    public int areaQuadrado(int lado)
      {
        return lado * lado;
      }
    
    public double areaLosango(double diagonalMaior, double diagonalMenor)
      {
        return (diagonalMaior * diagonalMenor) / 2;
      }
    
    public double areaTriangulo(double base, double altura)
      {
        return (base * altura) / 2;
      }
    
    public double areaPoligonoRegular(double perimetro, double apotema)
      {
        return (perimetro / 2) * apotema;
      }
    
    public double areaTrapezio(double baseMaior, double baseMenor, double altura)
      {
        return (baseMaior + baseMenor / 2) * altura;
      }
    
    public double areaCirculo(double raio)
      {
        return this.pi * Math.pow(raio, 2);
      }
    
    public double areaLateralCone(double raio, double geratriz)
      {
        return this.pi * raio * geratriz;
      }
    
    public double areaEsfera(double raio)
      {
        return 4 * this.pi * Math.pow(raio, 2);
      }
    
    public double superficieCone(double raio, double geratriz)
      {
        return this.pi * raio * (geratriz + raio);
      }
    
    public double volumeCubo(double lado)
      {
        return Math.pow(lado, 3);
      }
    
    public double volumeParalelepipedo(double comprimento, double largura, double altura)
      {
        return comprimento * largura * altura;
      }

    public double perimetroQuadrado(double perimetro, double lado)
      {
        return perimetro * lado;
      }
    
    public double perimetroCirculo(double raio)
      {
        return 2 * this.pi * raio;
      } 
  }
