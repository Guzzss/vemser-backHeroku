package br.com.vemser.pessoaapi.mapper;

import br.com.vemser.pessoaapi.dto.DadosPessoaisDTO;
import br.com.vemser.pessoaapi.dto.PessoaCreateDTO;
import br.com.vemser.pessoaapi.dto.PessoaDTO;
import br.com.vemser.pessoaapi.dto.PessoaDadosPessoaisDTO;
import br.com.vemser.pessoaapi.entity.Pessoa;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaDadosPessoaisMapper {

    @Autowired
    private ObjectMapper objectMapper;

    public PessoaDadosPessoaisDTO toDTO(DadosPessoaisDTO dadosPessoaisDTO) {
        return objectMapper.convertValue(dadosPessoaisDTO, PessoaDadosPessoaisDTO.class);
    }

    public DadosPessoaisDTO fromCreateDTO(PessoaDadosPessoaisDTO pessoaDadosPessoaisDTO) {
        return objectMapper.convertValue(pessoaDadosPessoaisDTO, DadosPessoaisDTO.class);
    }
}
