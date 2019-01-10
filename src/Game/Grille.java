package Game;

        import java.util.*;

public class Grille {

    // Attributs
    private int nbLig;
    private int nbCol;
    private char[][] grille;
    ArrayList<String> stockage;

    // Constructeur
    public Grille(int n, int p, ArrayList<String> stockage){
        nbLig = n;
        nbCol = p;
        grille = new char[nbLig][nbCol];


        grilleInit();

        affectGrille(stockage);



        System.out.println();
    }

   private void grilleInit(){
       for(int i=0; i<nbLig; i++){
           for(int j=0; j<nbCol; j++){

               grille[i][j] = ' ';

           }
       }
   }

   private void affectGrille(ArrayList<String> stockage){

       for (int it = 2;  it < (stockage.size() - 2); it++) {


           String valeur = stockage.get(it);
           System.out.println("la valeur est: " + valeur);

           if (valeur.equals("O")) {
               System.out.println("O detected");
               grille[Integer.parseInt(stockage.get(it + 1)) -1][Integer.parseInt(stockage.get(it + 2)) -1] = 'O';

           } else if (valeur.equals("I")) {
               System.out.println("I detected");
               grille[Integer.parseInt(stockage.get(it + 1))][Integer.parseInt(stockage.get(it + 2))] = 'I';
           } else if (valeur.equals("T")) {
               System.out.println("T detected");


               grille[Integer.parseInt(stockage.get(it + 1)) - 1][Integer.parseInt(stockage.get(it + 2)) - 1] = 'T';
           }
           else{
               System.out.println("elsed");
           }
       }
   }

   public void updateGrille(int oldX, int oldY, int newX, int newY){
        this.grille[oldX][oldY] = '_';
        this.grille[newX][newY] = 'T';
   }

   public char getGrille(int x, int y){
        return grille[x][y];
   }

   public int getNbLig(){
        return this.nbLig;
   }
    public int getNbCol(){
        return this.nbCol;
    }

    public void afficher(){
        System.out.println();

    }

    public void updateTondeusePos(int posX, int posY){

    }
}