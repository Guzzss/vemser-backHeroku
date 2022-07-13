package br.com.vemser.pessoaapi.controler;

import br.com.vemser.pessoaapi.dto.PessoaDadosPessoaisDTO;
import br.com.vemser.pessoaapi.service.PessoaDadosPessoaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pessoa-dados-pessoais")
public class PessoaDadosPessoaisControler {

    @Autowired
    private PessoaDadosPessoaisService pessoaDadosPessoaisService;

    @GetMapping

    @PostMapping
    public PessoaDadosPessoaisDTO post(PessoaDadosPessoaisDTO pessoaDadosPessoaisDTO) throws Exception {
        return pessoaDadosPessoaisService.post(pessoaDadosPessoaisDTO);
    }
}
