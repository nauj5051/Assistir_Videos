
public class Visualizacao {
    private Alunos espectador;
    private Video filme;

    public Visualizacao(Alunos espectador, Video filme ){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }    
    public Alunos getEspectador() {
        return espectador;
    }
    public void setEspectador(Alunos espectador) {
        this.espectador = espectador;
    }public Video getFilme() {
        return filme;
    }public void setFilme(Video filme) {
        this.filme = filme;
    }
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porcentagem){
        int total = 0;
        if(porcentagem <= 20){
            total = 3;
        }
        else if(porcentagem <=50){
            total = 5;
        }
        else if(porcentagem <= 90){
            total = 8;
        }
        else{
            total =10;
        }
        this.filme.setAvaliacao(total);
    }
    @Override
    public String toString() {
        return "Visualizacao {espectador=" + espectador + ", filme=" + filme + "}";
    }
    
}
