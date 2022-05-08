package com.dio.santander.bankline.api.modelo;

import java.time.LocalDateTime;

public class Movimentacao {
	private Integer id;
	private LocalDateTime dataHora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;

}
