import java.util.Scanner;

class PokemonGame{
    public static void main(String[] args) {
        int choice=0;
        Pokemon p1 = new Pokemon();
        System.out.print("Enter your pokemon name: ");
        Scanner scan = new Scanner(System.in);
        String inputname = scan.nextLine();
        p1.namechange(inputname);

        while(true){
            System.out.println("--------------------------------------------------");
            System.out.println("What you want to do?");
            System.out.println("---Enter 2 to see "+p1.name+" stat");
            System.out.println("---Enter 1 for battle");
            System.out.println("---Enter 0 to close game");
            System.out.print("->>");
            choice = scan.nextInt();
            if(choice == 1){
                System.out.println("You've encoutered a Zigzagoon!");
                
            }
            else if(choice == 2){
                p1.statreport();
            }
            else if(choice == 0){
                break;
            }
            else{
                System.out.println("Unknown choice");
                System.out.println("--------------------------------------------------");
            }
            wait(1000);
        }
        System.out.println("Closing game...");
        scan.close();
    
    }   
    
    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
