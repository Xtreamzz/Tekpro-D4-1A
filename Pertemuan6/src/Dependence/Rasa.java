package Dependence;

class Rasa {
    private String rasa;
    
    Rasa(String rasa){
        this.rasa = rasa;
    }
    
    public void menggunakanWadah(Wadah wadah){
        String wadahIceCream = wadah.getWadah();
        System.out.println(wadahIceCream);
    }
    
    public String getRasa(){
        return this.rasa;
    }
}