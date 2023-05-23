/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Jesús Benítez Cerezo
 */
public class Calculadora {

  // Atributos
  // Con carácter general los atributos se declaran como privados
  public String marca;
  private String modelo;
  private String nserie;
  
  private Scanner s;
  
  // Un atributo estático solo es accesible desde un método estático
  private static int nObjetos;

// Método constructor
// El método constructor se llama igual que la clase y sirve para para determinar
// las características del objeto a través de sus parámetros
// Está tan estandarizado que los constructores y los getters y setters pueden
// crearse de forma automática desde Source->Insert Code
  public Calculadora(String marca, String modelo, String nserie) {
    this.marca = marca;
    this.modelo = modelo;
    this.nserie = nserie;
    nObjetos++;
  }
  
  // Constructores vacíos
  // Sirven para sobrecargar los métodos de un objeto para que los parámetros que
  // haya que pasarle puedan ser distintos. Lo crearemos vacío y le pasaremos los
  // parámetros a través de los métodos setters
  public Calculadora(){
    
  }

// Métodos
  public void suma(float n1, float n2) {
    System.out.println("La suma de " + n1 + " más " + n2 + " es " + (n1 + n2));
  }
  
  public void resta(float n1, float n2) {
    System.out.println("La resta de " + n1 + " menos " + n2 + " es " + (n1 - n2));
  }

  public void multiplica(float n1, float n2) {
    System.out.println("La multiplicación de " + n1 + " por " + n2 + " es " + (n1 * n2));
  }


  // Métodos Getters y Setters
  // Métodos para poder acceder a los atributos declarados como privados
  // Con los getters puede obtenerse información, mientras que con los setters pueden
  // modificarse sus valores
  
  public String getModelo(){
    return this.modelo;
  }
  
  public void setModelo(String modelo){
    this.modelo=modelo;
  }

  public static int getnObjetos() {
    return nObjetos;
  }

  public static void setnObjetos(int nObjetos) {
    Calculadora.nObjetos = nObjetos;
  }

}
