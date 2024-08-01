package com.thor.iphone.model;

public class IPhone implements AparelhoTelefonico, NavegadorIinternet, RepodutorMusical {
    
    @Override
    public void selecionarMusica(String Musica) {
        System.out.println("Selecionando a musica: " + Musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }


}
