package br.eti.kge.agendaapp;

import br.eti.kge.agendaapp.menu.MenuOption;
import br.eti.kge.agendaapp.menu.MenuManager;
import br.eti.kge.agendaapp.model.Agenda;
import br.eti.kge.agendaapp.model.Contato;
import java.util.Scanner;

/**
 * Aplicação inicial objeto de estudo do componente Programação Orientada a Objetos
 * Prof. KGe
 * @author kge
 */
public class AgendaApp {

    public static MenuManager menuPrincipal;
    public static Agenda minhaAgenda;

    public static void main(String[] args) {
        
        minhaAgenda = new Agenda("KGe");
        
        char opcao;
        boolean continua = true;
        preparaMenu();

        while (continua) {

            opcao = menuPrincipal.showMenu();

            switch (opcao) {
                case '1':
                    System.out.println("Adicionar Contato");
                    adicionaContato();
                    break;
                case '2':
                    System.out.println("Alterar Contato");
                    break;
                case '3':
                    System.out.println("Remover Contato");
                    break;
                case 'X':
                    System.out.println("Sair do Sistema");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção não tratada. Verifique!");
            }

        }

    }

    private static void preparaMenu() {
        String cabecalho = "+-------------------------------+\n";
        cabecalho += "| Agenda Telefonica v1.0        |\n";
        cabecalho += "| Menu Principal                |\n";
        cabecalho += "+-------------------------------+\n\n";

        menuPrincipal = new MenuManager(cabecalho, "");

        menuPrincipal.addOpcao(new MenuOption('1', "Adicionar Contato"));
        menuPrincipal.addOpcao(new MenuOption('2', "Alterar Contato"));
        menuPrincipal.addOpcao(new MenuOption('3', "Remover Contato"));
        menuPrincipal.addOpcao(new MenuOption('X', "Sair do Sistema"));

    }

    public static void adicionaContato() {
        Scanner teclado = new Scanner(System.in);
        Contato contatoAux = new Contato();

        System.out.print("Informe nome: ");
        contatoAux.setNome(teclado.nextLine());

        System.out.print("Informe telefone: ");
        contatoAux.setTelefone(teclado.nextLine());

        System.out.print("Informe email: ");
        contatoAux.setEmail(teclado.nextLine());

        System.out.print("Informe endereco: ");
        contatoAux.setEndereco(teclado.nextLine());

        System.out.print("Informe cidade: ");
        contatoAux.setCidade(teclado.nextLine());

        System.out.print("Informe uf: ");
        contatoAux.setUf(teclado.nextLine());

        System.out.print("Informe cep: ");
        contatoAux.setCep(teclado.nextLine());

        //System.out.print("Informe dataNascimento: ");
        //contatoAux.setDataNascimento(teclado.nextLine());
        
        minhaAgenda.adicionaContato(contatoAux);
        
    }
    
    
}
