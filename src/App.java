public class App {
    public static void main(String[] args) throws Exception {
        Video novoVideo1 = new Video("videobom");
        Video novoVideo2 = new Video("videruim");
        Video novoVideo3 = new Video("video+-");
 
        System.out.println(novoVideo1.toString());
        System.out.println(novoVideo2.toString());
        System.out.println(novoVideo3.toString());
        Alunos pessoas[] = new Alunos[3];
        pessoas[0] = new Alunos("omen", 15, "masculino", "nat");
        pessoas[1] = new Alunos("sky", 19, "feminino", "lobinho");

        Visualizacao ver = new Visualizacao(pessoas[0], novoVideo3);
        Visualizacao ver1 = new Visualizacao(pessoas[0], novoVideo3);
        Visualizacao ver2= new Visualizacao(pessoas[0], novoVideo3);


        System.out.println(ver.toString());
        System.out.println(ver1.toString());
        System.out.println(ver2.toString());

    }
}
