
public class Pokemon{
    public String name;
    private int hp=10;
    private int atk=5;
    private int def=2;
    private int exp=10;
    private int lvl=1;
    public int expdrop = lvl*7;

    public Pokemon(){
        System.out.print("Enter your pokemon name: ");
        Scanner pkmnname = new Scanner(System.in);
        name = pkmnname.nextLine();
        pkmnname.close();
    }
    public void namechange(String inputname){
        name = inputname;
    }
    public void expup(int winexp){
        exp += winexp;
        if(exp >= explvlup){
            lvlup();   
        }
    }

    public void damage(int attackpower){
        if(def < attackpower){
            hp -= (attackpower-def);
        }
    }

    public void lvlup(){
        lvl += (exp/explvlup);
        exp = exp % explvlup;
        hp+=3;
        atk+=2;
        def+=1;
        explvlup *= 1.2;
    }

    public void statreport(){
        System.out.println("--------------------------------------------------");
        System.out.println("Name    : "+name);
        System.out.println("Hp      : "+hp);
        System.out.println("Atk     : "+atk);
        System.out.println("Def     : "+def);
        System.out.println("--------------------------------------------------");
    }
}