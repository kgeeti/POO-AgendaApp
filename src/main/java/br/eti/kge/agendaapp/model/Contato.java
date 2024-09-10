package br.eti.kge.agendaapp.model;

import java.time.LocalDate;

/**
 * Classe que representa os dados do Contato
 *
 * @author kge
 */
public class Contato {

    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private String cidade;
    private String uf;
    private String cep;
    private LocalDate dataNascimento;

    public Contato() {
    }

    public Contato(String nome, String telefone, String email, String endereco, String cidade, String uf, String cep, LocalDate dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isEmailValid() {
        int indexArroba;

        // Determina se o atributo é nulo ou vazio.
        if (this.email == null) {
            return false;
        }

        indexArroba = this.email.indexOf("@");
        // Verifica se tem arroba e se não é o ultimo caractere
        if (indexArroba <= 0 || indexArroba >= this.email.length() - 1) {
            return false;
        }

        // Arroba existe!
        // Separa em login e dominio
        String login = this.email.substring(0, indexArroba);
        String dominio = this.email.substring(indexArroba + 1);

        // Verifica se a parte do domínio contém pelo menos um ponto
        int dotIndex = dominio.indexOf('.');
        if (dotIndex <= 0 || dotIndex >= dominio.length() - 1) {
            return false;
        }
        return true;
    }

}
