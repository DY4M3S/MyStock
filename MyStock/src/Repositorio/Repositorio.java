package Repositorio;

import ModeloClasse.Administrador;
import ModeloClasse.Cliente;
import ModeloClasse.Estoque;
import ModeloClasse.Funcionario;
import ModeloClasse.Produto;
import ModeloClasse.Vendas;
import java.util.ArrayList;
import java.util.List;    


public class Repositorio {
    public static List<Administrador> administrador = new ArrayList<>();
    public static List<Funcionario> funcionario = new ArrayList<>();
    public static List<Cliente> cliente = new ArrayList<>();
    public static List<Vendas> venda = new ArrayList<>();
    public static List<Produto> produto = new ArrayList<>();
    public static List<Estoque> estoque = new ArrayList<>();

   public static void init() {
        administrador.add(new Administrador(true,"adm@MyStock.com","adm123"));     
    }
}
