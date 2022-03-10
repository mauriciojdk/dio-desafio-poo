

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JAVA");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JAVASCRIPT");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMauricio = new Dev();
        devMauricio.setNome("Camila");
        devMauricio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Mauricio:" + devMauricio.getConteudosInscritos());
        devMauricio.progredir();
        devMauricio.progredir();
        System.out.println("======");
        System.out.println("Conteúdos Inscritos :" + devMauricio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos - Mauricio:" + devMauricio.getConteudosConcluidos());
        System.out.println("XP:" + devMauricio.calcularTotalXp());

        System.out.println("-------");

        Dev devJunior = new Dev();
        devJunior.setNome("Joao");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Junior:" + devJunior.getConteudosInscritos());
        devJunior.progredir();
        devJunior.progredir();
        devJunior.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos - Junior:" + devJunior.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos - Junior:" + devJunior.getConteudosConcluidos());
        System.out.println("XP:" + devJunior.calcularTotalXp());

    }

}