import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("curso 1");
        curso1.setDescricao("descrição do curso 1");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("mentoria 1");
        mentoria1.setDescricao("descricao metoria 1");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp 1");
        bootcamp.setDescricao("descricao bootcamp 1");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println(bootcamp.getNome());

        Dev dev1 = new Dev();
        dev1.setNome("dev 1");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXp());

    }

}
