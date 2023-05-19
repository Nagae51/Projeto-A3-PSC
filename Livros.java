    /*Por favor rapazeada leiam meus comentarios*/
public class Livros {
    
        private int id;
        private String nome;
        private int quantidadeDisponivel;
        private String autor;
        private double preco;
        private int lancamento;
        private String genero;
        
      /*Aqui tão os atibutos sendo definidos, quem quiser mexer pfv mexa, mas comenta dps e deixa 
        no git commit tbm*/
    public Livros(int id, String nome, int quantidadeDisponivel,String autor, double preco, int lancamento, String genero){
        this.id = id;
        this.nome = nome;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.autor = autor;
        this.preco = preco;
        this.lancamento = lancamento;
        this.genero = genero;
    }
   /*Aqui eu fiz os getters, tem que codar os setters eu sugiro codar intercalado tipo o setter do id
    embaixo do getter dele.*/
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }
    public String getAutor(){
        return autor;
    }
    public double getPreco(){
        return preco;
    }
    public int getLancamento(){
        return lancamento;
    }
    public String getGenero(){
        return genero;
    }
    /*isso aqui é um teste pessoal, agr não sei o pq do 
    Livros livro = newLivros, se vc souber Debs comenta ai.*/
    public static void main(String[] args) {
        Livros livro = new Livros(1, "O Senhor dos Anéis", 10, "J.R.R. Tolkien", 59.90, 1954, "Fantasia");
        System.out.println("ID: " + livro.getId());
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Quantidade disponível: " + livro.getQuantidadeDisponivel());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Preço: " + livro.getPreco());
        System.out.println("Lançamento: " + livro.getLancamento());
        System.out.println("Gênero: " + livro.getGenero());
    }
}
    

 


    

