import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
       Curso curso1 = new Curso("Curso java","descricao curso java",8);
       Curso curso2 = new Curso("js", "descricao js", 4);

       Mentoria mentoria = new Mentoria("mentoria java", "descricao mentoria", LocalDate.now());

       System.out.println(mentoria);

    }
}
