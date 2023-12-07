package br.com.solondiego.jenkins.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public String hello(){
        return "Bem vindo ao curso de Jenkins!";
    }

    public int somar(int a, int b){
        return a + b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public double dividir(double a, double b){
        return a / b;
    }
}
