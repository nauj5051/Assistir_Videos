public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected Float experiencia;

    public Pessoa (String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = (float) 0;
    }
    
    public Float getExperiencia() {
        return experiencia;
    }public void setExperiencia(Float experiencia) {
        this.experiencia = experiencia;
    }public int getIdade() {
        return idade;
    }public void setIdade(int idade) {
        this.idade = idade;
    }public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }public String getSexo() {
        return sexo;
    }public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void ganharExp(){

    }
}
