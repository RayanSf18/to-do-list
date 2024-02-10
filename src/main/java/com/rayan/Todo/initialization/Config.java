package com.rayan.Todo.initialization;

import com.rayan.Todo.domain.Todo;
import com.rayan.Todo.repositorie.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {

        todoRepository.deleteAll();

        Todo t1 = new Todo(null, "Comprar mantimentos", "Comprar frutas, vegetais e carne para a semana", false, 3);
        Todo t2 = new Todo(null, "Estudar para o exame", "Revisar os capítulos 5-10 do livro de história", false, 2);
        Todo t3 = new Todo(null, "Limpar o apartamento", "Limpar a sala de estar, a cozinha e o banheiro", false, 5);
        Todo t4 = new Todo(null, "Fazer exercícios", "Correr por 30 minutos e fazer 20 flexões", false, 4);
        Todo t5 = new Todo(null, "Ler um livro", "Ler pelo menos 50 páginas do romance", false, 6);
        Todo t6 = new Todo(null, "Enviar e-mails", "Responder aos e-mails pendentes", false, 7);
        Todo t7 = new Todo(null, "Assistir a uma aula online", "Participar da aula de matemática", false, 1);
        Todo t8 = new Todo(null, "Pagar contas", "Pagar a conta de energia e a fatura do cartão de crédito", false, 8);
        Todo t9 = new Todo(null, "Fazer uma reunião", "Agendar e preparar materiais para a reunião de equipe", false, 9);
        Todo t10 = new Todo(null, "Planejar as férias", "Pesquisar destinos e reservar passagens", false, 10);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10));
    }
}
