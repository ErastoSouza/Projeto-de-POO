import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendario{
    protected String nomeComp;
    protected String local;
    protected int mes;
    protected int dia;
    protected String hora;

    ArrayList <Integer> listaMes = new ArrayList<Integer>();
    ArrayList <Integer> listaDia = new ArrayList<Integer>();
    ArrayList <String> listalocal = new ArrayList<String>();

   
    public String getNomeComp() {
        return nomeComp;
    }
    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia=dia;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    /*  public Calendario(String nomeComp, String local, String mes, int dia, String hora) {
        this.nomeComp = nomeComp;
        this.local = local;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }*/

    public void cadastrarPartida(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o mês da sua partida?");
        mes= scanner.nextInt();
        listaMes.add(mes);
        System.out.println("Qual é o dia da sua partida?");
        dia= scanner.nextInt();
        listaDia.add(dia);
        scanner.nextLine();
        System.out.println("Onde será o jogo?");
        local= scanner.nextLine();
        listalocal.add(local);
        
scanner.close();
    }

    public void mostrarCalendario(){
        for (int cont : listaMes) {
                System.out.print(listaMes);
                System.out.print(listaDia);
                System.out.print(listalocal);
     }

    }
}
    
    
   