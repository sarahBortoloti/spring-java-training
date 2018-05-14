package first.project.spring;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import first.project.spring.domain.Categoria;
import first.project.spring.repositories.CategoriaRepository;

@SpringBootApplication
public class ProjetoSpring2Application implements CommandLineRunner {

	private CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpring2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 =new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
