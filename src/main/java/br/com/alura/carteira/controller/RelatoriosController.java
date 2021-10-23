package br.com.alura.carteira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.carteira.dto.ItemCarteiraDto;
import br.com.alura.carteira.service.RelatorioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/relatorios")
@Api(tags = "Relatorios")
public class RelatoriosController {

	@Autowired
	RelatorioService service;

	@GetMapping("/carteira")
	@ApiOperation("Lista Relatorios")
	public List<ItemCarteiraDto> relatorioCarteiraDeInvestimentos() {
		
		return service.relatorioCarteiraDeInvestimentos();

	}
}
