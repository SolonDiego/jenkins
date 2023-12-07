package br.com.solondiego.jenkins.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculadoraServiceTest {

    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveRetonarUmaMensagem(){
        String hello = "Bem vindo ao curso de Jenkins!";
        Assertions.assertEquals(hello, calculadoraService.hello());
    }

    @Test
    public void deveriaSomarDoisValores(){
        int a = 2;
        int b = 2;
        int result = 4;
        Assertions.assertEquals(result, calculadoraService.somar(a,b));
    }

    @Test
    public void deveriaSubitrairDoisValores(){
        int a = 2;
        int b = 2;
        int result = 0;
        Assertions.assertEquals(result, calculadoraService.subtrair(a,b));
    }
}
