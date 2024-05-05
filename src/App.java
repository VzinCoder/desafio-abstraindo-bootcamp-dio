import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Curso java", "descricao curso java", 8);
        Curso curso2 = new Curso("js", "descricao js", 4);

        Mentoria mentoria = new Mentoria("mentoria java", "descricao mentoria", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("java", "bootcamp focado em java");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev("Vinicius");
        devVinicius.inscrever(bootcamp);
        System.out.println("Conteudos inscritos: " + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        System.out.println("Conteudos concluidos: " + devVinicius.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + devVinicius.getConteudosInscritos());
        System.out.println("Xp: "+devVinicius.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscrever(bootcamp);
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Xp: "+devJoao.calcularTotalXp());

    }
}
