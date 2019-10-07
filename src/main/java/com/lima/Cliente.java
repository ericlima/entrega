/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lima;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author eric
 */
@Entity(name="cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Transient
    private List<AuditoriaDTO> dadosAlterados;

    @Column(name="status", length=20, nullable=false, unique=false)
    private String status;
    @Transient
    private String statusOriginal;
    
    @Column(name="tipo", length=20, nullable=false, unique=false)
    private String tipo;
    @Transient
    private String tipoOriginal;

    @Column(name="equipe_patrocinador", length=200, nullable=false, unique=false)
    private String equipePatrocinador;
    @Transient
    private String equipePatrocinadorOriginal;
    
    @Column(name="numero_peito", length=20, nullable=false, unique=false)
    private String numeroPeito;
    @Transient
    private String numeroPeitoOriginal;
    
    @Column(name="nome_completo", length=200, nullable=false, unique=false)
    private String nomeCompleto;
    @Transient
    private String nomeCompletoOriginal;
    
    @Column(name="sexo", length=10, nullable=false, unique=false)
    private String sexo;
    @Transient
    private String sexoOriginal;
    
    @Column(name="data_nascimento", columnDefinition = "DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private LocalDate dataNascimento;
    @Transient
    private LocalDate dataNascimentoOriginal;
    
    @Transient
    private Integer idade;
    
    private String modalidade;
    @Transient
    private String modalidadeOriginal;
    
    private String categoria;
    @Transient
    private String categoriaOriginal;
    
    private String cpf;
    @Transient
    private String cpfOriginal;
    
    private String telefone;
    @Transient
    private String telefoneOriginal;
    
    private String email;
    @Transient
    private String emailOriginal;
    
    private Boolean brasileiro;
    @Transient
    private Boolean brasileiroOriginal;
    
    private String cep;
    @Transient
    private String cepOriginal;
    
    private String endereco;
    @Transient
    private String enderecoOriginal;
    
    private String bairro;
    @Transient
    private String bairroOriginal;
    
    private String cidade;
    @Transient
    private String cidadeOriginal;
    
    private String estado;
    @Transient
    private String estadoOriginal;
    
    private String distanciaProvaRequerida;
    @Transient
    private String distanciaProvaRequeridaOriginal;
    
    private String profissao;
    @Transient
    private String profissaoOriginal;
    
    private String grauEscolaridade;
    @Transient
    private String grauEscolaridadeOriginal;
    
    private String contatoEmergencia;
    @Transient
    private String contatoEmergenciaOriginal;
    
    private String nomeCompletoResponsavel;
    @Transient
    private String nomeCompletoResponsavelOriginal;
    
    private String emailResponsavel;
    @Transient
    private String emailResponsavelOriginal;
    
    private String telefoneResponsavel;
    @Transient
    private String telefoneResponsavelOriginal;
    
    private String camisaParticipacao;
    @Transient
    private String camisaParticipacaoOriginal;
    
    private BigDecimal valorKit;
    @Transient
    private BigDecimal valorKitOriginal;
    
    private String resumoItensKit;
    @Transient
    private String resumoItensKitOriginal;
    
    private String equipe;
    @Transient
    private String equipeOriginal;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInscricao;
    @Transient
    private Date dataInscricaoOriginal;
    
    private String pontoVenda;
    @Transient
    private String pontoVendaOriginal;
    
    private BigDecimal valor;
    @Transient
    private BigDecimal valorOriginal;
    
    private String metodoPagamento;
    @Transient
    private String metodoPagamentoOriginal;
    
    private String codigoDesconto;
    @Transient
    private String codigoDescontoOriginal;
    
    private String token;
    @Transient
    private String tokenOriginal;
    
    private String chaveAcesso;
    @Transient
    private String chaveAcessoOriginal;
    
    private String tamanhoCamiseta;
    @Transient
    private String tamanhoCamisetaOriginal;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date criadoEm;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date modificadoEm;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    
}
