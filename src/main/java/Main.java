import br.com.devnaldo.Bootcamp;
import br.com.devnaldo.Curso;
import br.com.devnaldo.Dev;
import br.com.devnaldo.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescrcao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescrcao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescrcao("descrição mentoria java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java");
        bootcamp.setDescricao("Iniciante");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdinaldo = new Dev();
        devEdinaldo.setNome("Edinaldo");
        devEdinaldo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Edinaldo:" + devEdinaldo.getConteudoIncritos());
        devEdinaldo.progredir();
        devEdinaldo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Edinaldo:" + devEdinaldo.getConteudoIncritos());
        System.out.println("Conteúdos Concluídos Edinaldo:" + devEdinaldo.getConteudoConcluidos());
        System.out.println("XP:" + devEdinaldo.calcularXP());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoIncritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularXP());


        System.out.println("Conteudo Inscritos" + devEdinaldo.getConteudoIncritos());
    }
}
