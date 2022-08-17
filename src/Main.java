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

        System.out.println(curso1);
        System.out.println(mentoria1);

    }

}
