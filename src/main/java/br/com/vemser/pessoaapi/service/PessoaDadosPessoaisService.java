package br.com.vemser.pessoaapi.service;

import br.com.vemser.pessoaapi.dto.DadosPessoaisDTO;
import br.com.vemser.pessoaapi.dto.PessoaCreateDTO;
import br.com.vemser.pessoaapi.dto.PessoaDTO;
import br.com.vemser.pessoaapi.dto.PessoaDadosPessoaisDTO;
import br.com.vemser.pessoaapi.entity.Pessoa;
import br.com.vemser.pessoaapi.mapper.PessoaDadosPessoaisMapper;
import br.com.vemser.pessoaapi.mapper.PessoaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaDadosPessoaisService {

    @Autowired
    private PessoaService pessoaService;

    @Autowired
    private DadosPessoaisService dadosPessoaisService;

    @Autowired
    private PessoaDadosPessoaisMapper pessoaDadosPessoaisMapper;

    @Autowired
    private PessoaMapper pessoaMapper;
//
//    public PessoaDadosPessoaisDTO post( ) throws Exception {
//
//    }
//metodo post PessoaDadosPessoaisDTO
    public PessoaDadosPessoaisDTO post(PessoaDadosPessoaisDTO pessoaDadosPessoaisDTO) throws Exception {
      PessoaDadosPessoaisDTO pessoa = new PessoaDadosPessoaisDTO();
        pessoa.setCpf(pessoaDadosPessoaisDTO.getCpf());
        pessoa.setNome(pessoaDadosPessoaisDTO.getNome());
        pessoa.setDataNascimento(pessoaDadosPessoaisDTO.getDataNascimento());
        pessoa.setEmail(pessoaDadosPessoaisDTO.getEmail());
        pessoa.setCnh(pessoaDadosPessoaisDTO.getCnh());
        pessoa.setNomeMae(pessoaDadosPessoaisDTO.getNomeMae());
        pessoa.setNomePai(pessoaDadosPessoaisDTO.getNomePai());
        pessoa.setRg(pessoaDadosPessoaisDTO.getRg());
        pessoa.setSexo(pessoaDadosPessoaisDTO.getSexo());
        return pessoa;
    }

    public PessoaDadosPessoaisDTO get(String cpf) throws Exception {
        PessoaDadosPessoaisDTO pessoa = new PessoaDadosPessoaisDTO();
        PessoaDTO pessoaEntity = pessoaService.list().stream().filter(p -> p.getCpf().equals(cpf)).findFirst().orElse(null);;
        return pessoa;
    }
}
