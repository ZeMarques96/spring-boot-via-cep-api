package dio.dio_spring_design_pattern.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.dio_spring_design_pattern.model.Endereco;

@FeignClient(name = "viacep" , url = "https://viacep.com.br/ws")
public interface ViaCepService {

    // @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
