public class Musica {
    private String titulo;
    private int avaliacao;
    public  Musica (String titulo){
        this.titulo = titulo;

    }
    public int getAvaliacao(){
        return avaliacao;
        
    }
    public int compareTo(Musica m){
        return this.getTitulo().compareTo(.getTitulo());
    }
    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }
    public String getTitulo(){
        return titulo;

    }
    
}
