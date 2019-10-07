/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chipprime;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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

    @Column(name="status", length=20, nullable=true, unique=false)
    private String status;
    @Transient
    private String statusOriginal;
    
    @Column(name="tipo", length=20, nullable=true, unique=false)
    private String tipo;
    @Transient
    private String tipoOriginal;

    @Column(name="equipe_patrocinador", length=200, nullable=true, unique=false)
    private String equipePatrocinador;
    @Transient
    private String equipePatrocinadorOriginal;
    
    @Column(name="numero_peito", length=20, nullable=true, unique=false)
    private String numeroPeito;
    @Transient
    private String numeroPeitoOriginal;
    
    @Column(name="nome_completo", length=200, nullable=true, unique=false)
    private String nomeCompleto;
    @Transient
    private String nomeCompletoOriginal;
    
    @Column(name="sexo", length=10, nullable=true, unique=false)
    private String sexo;
    @Transient
    private String sexoOriginal;
    
    @Column(name="data_nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @Transient
    private Date dataNascimentoOriginal;
    
    @Transient
    private Integer idade;
    
    @Column(name="modalidade", length=50, nullable=true, unique=false)
    private String modalidade;
    @Transient
    private String modalidadeOriginal;
    
    @Column(name="categoria", length=20, nullable=true, unique=false)
    private String categoria;
    @Transient
    private String categoriaOriginal;
    
    @Column(name="cpf", length=20, nullable=true, unique=false)
    private String cpf;
    @Transient
    private String cpfOriginal;
    
    @Column(name="telefone", length=20, nullable=true, unique=false)
    private String telefone;
    @Transient
    private String telefoneOriginal;
    
    @Column(name="email", length=200, nullable=true, unique=false)
    private String email;
    @Transient
    private String emailOriginal;
    
    @Column(name="brasileiro")
    private Boolean brasileiro;
    @Transient
    private Boolean brasileiroOriginal;
    
    @Column(name="cep", length=10, nullable=true, unique=false)
    private String cep;
    @Transient
    private String cepOriginal;
    
    @Column(name="endereco", length=200, nullable=true, unique=false)
    private String endereco;
    @Transient
    private String enderecoOriginal;
    
    @Column(name="bairro", length=50, nullable=true, unique=false)
    private String bairro;
    @Transient
    private String bairroOriginal;
    
    @Column(name="cidade", length=200, nullable=true, unique=false)
    private String cidade;
    @Transient
    private String cidadeOriginal;
    
    @Column(name="estado", length=2, nullable=true, unique=false)
    private String estado;
    @Transient
    private String estadoOriginal;
    
    @Column(name="distancia_prova", length=50, nullable=true, unique=false)
    private String distanciaProvaRequerida;
    @Transient
    private String distanciaProvaRequeridaOriginal;
    
    @Column(name="profissao", length=50, nullable=true, unique=false)
    private String profissao;
    @Transient
    private String profissaoOriginal;
    
    @Column(name="grau_escolaridade", length=50, nullable=true, unique=false)
    private String grauEscolaridade;
    @Transient
    private String grauEscolaridadeOriginal;
    
    @Column(name="contato_emergencia", length=50, nullable=true, unique=false)
    private String contatoEmergencia;
    @Transient
    private String contatoEmergenciaOriginal;
    
    @Column(name="nome_responsavel", length=200, nullable=true, unique=false)
    private String nomeCompletoResponsavel;
    @Transient
    private String nomeCompletoResponsavelOriginal;
    
    @Column(name="email_responsavel", length=200, nullable=true, unique=false)
    private String emailResponsavel;
    @Transient
    private String emailResponsavelOriginal;
    
    @Column(name="telefone_responsavel", length=20, nullable=true, unique=false)
    private String telefoneResponsavel;
    @Transient
    private String telefoneResponsavelOriginal;
    
    @Column(name="camisa_participacao", length=20, nullable=true, unique=false)
    private String camisaParticipacao;
    @Transient
    private String camisaParticipacaoOriginal;
    
    @Column(name="valor_kit")
    private BigDecimal valorKit;
    @Transient
    private BigDecimal valorKitOriginal;
    
    @Column(name="resumo_kit", length=200, nullable=true, unique=false)
    private String resumoItensKit;
    @Transient
    private String resumoItensKitOriginal;
    
    @Column(name="equipe", length=200, nullable=true, unique=false)
    private String equipe;
    @Transient
    private String equipeOriginal;
    
    @Column(name="data_inscricao", nullable=true, unique=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInscricao;
    @Transient
    private Date dataInscricaoOriginal;
    
    @Column(name="ponto_venda", length=200, nullable=true, unique=false)
    private String pontoVenda;
    @Transient
    private String pontoVendaOriginal;
    
    @Column(name="valor", nullable=true, unique=false)
    private BigDecimal valor;
    @Transient
    private BigDecimal valorOriginal;
    
    @Column(name="metodo_pagamento", length=50, nullable=true, unique=false)
    private String metodoPagamento;
    @Transient
    private String metodoPagamentoOriginal;
    
    @Column(name="codigo_desconto", length=50, nullable=true, unique=false)
    private String codigoDesconto;
    @Transient
    private String codigoDescontoOriginal;
    
    @Column(name="token", length=50, nullable=true, unique=false)
    private String token;
    @Transient
    private String tokenOriginal;
    
    @Column(name="chave_acesso", length=50, nullable=true, unique=false)
    private String chaveAcesso;
    @Transient
    private String chaveAcessoOriginal;
    
    @Column(name="tamanho_camiseta", length=20, nullable=true, unique=false)
    private String tamanhoCamiseta;
    @Transient
    private String tamanhoCamisetaOriginal;

    @Column(name="criado_em")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date criadoEm;
    
    @Column(name="modificado_em")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date modificadoEm;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (this.status != this.statusOriginal) {
            
        }
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEquipePatrocinador() {
        return equipePatrocinador;
    }

    public void setEquipePatrocinador(String equipePatrocinador) {
        this.equipePatrocinador = equipePatrocinador;
    }

    public String getNumeroPeito() {
        return numeroPeito;
    }

    public void setNumeroPeito(String numeroPeito) {
        this.numeroPeito = numeroPeito;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getBrasileiro() {
        return brasileiro;
    }

    public void setBrasileiro(Boolean brasileiro) {
        this.brasileiro = brasileiro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDistanciaProvaRequerida() {
        return distanciaProvaRequerida;
    }

    public void setDistanciaProvaRequerida(String distanciaProvaRequerida) {
        this.distanciaProvaRequerida = distanciaProvaRequerida;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getGrauEscolaridade() {
        return grauEscolaridade;
    }

    public void setGrauEscolaridade(String grauEscolaridade) {
        this.grauEscolaridade = grauEscolaridade;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getNomeCompletoResponsavel() {
        return nomeCompletoResponsavel;
    }

    public void setNomeCompletoResponsavel(String nomeCompletoResponsavel) {
        this.nomeCompletoResponsavel = nomeCompletoResponsavel;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getCamisaParticipacao() {
        return camisaParticipacao;
    }

    public void setCamisaParticipacao(String camisaParticipacao) {
        this.camisaParticipacao = camisaParticipacao;
    }

    public BigDecimal getValorKit() {
        return valorKit;
    }

    public void setValorKit(BigDecimal valorKit) {
        this.valorKit = valorKit;
    }

    public String getResumoItensKit() {
        return resumoItensKit;
    }

    public void setResumoItensKit(String resumoItensKit) {
        this.resumoItensKit = resumoItensKit;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public String getPontoVenda() {
        return pontoVenda;
    }

    public void setPontoVenda(String pontoVenda) {
        this.pontoVenda = pontoVenda;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getCodigoDesconto() {
        return codigoDesconto;
    }

    public void setCodigoDesconto(String codigoDesconto) {
        this.codigoDesconto = codigoDesconto;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    public void setTamanhoCamiseta(String tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Date getModificadoEm() {
        return modificadoEm;
    }

    public void setModificadoEm(Date modificadoEm) {
        this.modificadoEm = modificadoEm;
    }
    
    
    
    
}
