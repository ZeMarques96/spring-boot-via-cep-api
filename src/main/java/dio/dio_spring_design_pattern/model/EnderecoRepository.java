package dio.dio_spring_design_pattern.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Não é necessário
public interface EnderecoRepository extends CrudRepository<Endereco, String>{

}
