package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());//atribuir a data ao momento em que foi criado o objeto

       // System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devLuka = new Dev();
        devLuka.inscrever(bootcamp);
        devLuka.setNome("Luka");
        System.out.println("Conteúdos inscritos Luka: " + devLuka.getConteudosInscritos());
        System.out.println("-");
        devLuka.progredir();
        devLuka.progredir();
        System.out.println("Conteúdos concluidos Luka: " + devLuka.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Luka: " + devLuka.getConteudosInscritos());

        System.out.println("XP=" + devLuka.calcularTotalXp());

        System.out.println("-----");

        Dev devCamila = new Dev();
        devCamila.inscrever(bootcamp);
        devCamila.setNome("Camila");
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("-");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP=" + devCamila.calcularTotalXp());



    }
}