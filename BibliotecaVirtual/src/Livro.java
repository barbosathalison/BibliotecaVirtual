import javax.swing.JOptionPane;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private int paginaMarcada;
    private int nota;
    private boolean aberto;

    // Contrutor
    public Livro(String titulo, String autor, int totalPaginas, boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
    }
    
    // Getters e Setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getTotalPaginas(){
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas){
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual(){
        return paginaAtual;
    }
    public void setPaginaAtual(int paginaAtual){
        this.paginaAtual = paginaAtual;
    }

    public int getPaginaMarcada(){
        return paginaMarcada;
    }
    public void setPaginaMarcada(int paginaMarcada){
        this.paginaMarcada = paginaMarcada;
    }

     public int getNota(){
        return nota;
    }
    public void setNota(int nota){
        this.nota = nota;
    }

    public boolean getAberto(){
        return aberto;
    }
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    //Metodos
    public void infos(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Numero de paginas: " + this.getTotalPaginas());
        System.out.println("Marca paginas: " + this.getPaginaMarcada());
        System.out.println("Nota do Leitor: " + this.getNota());
    }

    public void abrir(){
        this.setAberto(true);
    }

    public void fechar(){
        if(this.getAberto()){
            this.setPaginaMarcada(this.getPaginaAtual());
            this.setAberto(false);
        }
    }

    public void avancarPagina(){
        this.setPaginaAtual(this.getPaginaAtual() + 1);
    }

    public void boltarPagina(){
        this.setPaginaAtual(this.getPaginaAtual() - 1);
    }

    public void avancar10Paginas(){
        this.setPaginaAtual(this.getPaginaAtual() + 10);
    }

    public void voltar10Paginas(){
        this.setPaginaAtual(this.getPaginaAtual() - 10);
    }

    public void navegarAtePagina(){
        this.setPaginaAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da pagina")));
    }

    public void darNota(){
        this.setNota(Integer.parseInt(JOptionPane.showInputDialog("Qual a nota do livro? (1-5)")));
    }
    
    public void marcarPagina(){
        this.setPaginaMarcada(this.getPaginaAtual());
    }
}
