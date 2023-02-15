
import java.util.Scanner;
public class GamingStation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String XboxController;
        String PlayerController;
        PlaystationGame playstationGame1 = new PlaystationGame("Uncharted 4  ", 2016, 18) {
            @Override
            public void R1() {
                System.out.println("Run in " + gameName);
            }
            @Override
            public void R2() {
                System.out.println("jump in " + gameName);
            }
            @Override
            public void L1() {
                System.out.println("aim in " + gameName);
            }
            @Override
            public void L2() {
                System.out.println("shoot in " + gameName);
            }
        };
        PlaystationGame playstationGame2 = new PlaystationGame("CoD: Vanguard ", 2021, 18) {
            @Override
            public void R1() {
                System.out.println("Run in " + gameName);
            }
            @Override
            public void R2() {
                System.out.println("jump in " + gameName);
            }
            @Override
            public void L1() {
                System.out.println("aim in " + gameName);
            }
            @Override
            public void L2() {
                System.out.println("shoot in " + gameName);
            }
        };
        XboxGame xboxGame1 = new XboxGame("Halo 5: Guardians  ", 2015,18){
            @Override
            public void Rb() {
                System.out.println("Run in " + gameName);
            }
            @Override
            public void Rt() {
                System.out.println("jump in " + gameName);
            }
            @Override
            public void Lb() {
                System.out.println("aim in " + gameName);
            }
            @Override
            public void Lt() {
                System.out.println("shoot in " + gameName);
            }
        };
        XboxGame xboxGame2 = new XboxGame("Gears 5 ", 2019,18){
            @Override
            public void Rb() {
                System.out.println("Run in " + gameName);
            }
            @Override
            public void Rt() {
                System.out.println("jump in " + gameName);
            }
            @Override
            public void Lb() {
                System.out.println("aim in " + gameName);
            }
            @Override
            public void Lt() {
                System.out.println("shoot in " + gameName);
            }
        };
        System.out.println("List of PlayStation Games : ");
        System.out.println("1 - " + playstationGame1.gameName + "(" + playstationGame1.releaseYear + ") " + "(+" + playstationGame1.ageRestriction + ")");
        System.out.println("2 - " + playstationGame2.gameName + "(" + playstationGame2.releaseYear + ") " + "(+" + playstationGame2.ageRestriction + ")");
        System.out.println("List of Xbox Games : ");
        System.out.println("3 - " + xboxGame1.gameName + "(" + xboxGame1.releaseYear + ") " + "(+" + xboxGame1.ageRestriction + ")");
        System.out.println("4 - " + xboxGame2.gameName + "(" + xboxGame2.releaseYear + ") " + "(+" + xboxGame2.ageRestriction + ")");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Enter the game  number you wish to play : ");
        int op = sc.nextInt();
        if (op == 1){
            System.out.println("1- R1   " +  "2- R2   " + "3- L1   " + "4- L2    " + "5 - exit" );
            for (int i = 0; i < 5;i--) {
                System.out.print("Enter the button number you wish to press : ");
                int but = sc.nextInt();
                if (but == 1) {
                    playstationGame1.R1();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 2) {
                    playstationGame1.R2();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 3) {
                    playstationGame1.L1();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 4) {
                    playstationGame1.L2();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 5) {
                    System.out.println("Thank you for playing "+ playstationGame1.gameName + "(" + playstationGame1.releaseYear + ") " + "(+" + playstationGame1.ageRestriction + ")");
                    System.out.println("--------------------------------------------------------");
                    break;
                }
                else {
                    System.out.println("Wrong button ");
                    System.out.println("--------------------------------------------------------");
                }
            }
        }
        else if (op == 2){
            System.out.println("1- R1   " +  "2- R2   " + "3- L1   " + "4- L2    " + "5 - exit" );
            for (int i = 0; i < 5;i--) {
                System.out.print("Enter the button number you wish to press : ");
                int but = sc.nextInt();
                if (but == 1) {
                    playstationGame1.R1();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 2) {
                    playstationGame1.R2();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 3) {
                    playstationGame1.L1();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 4) {
                    playstationGame1.L2();
                    System.out.println("--------------------------------------------------------");
                }
                else if (but == 5) {
                    System.out.println("Thank you for playing " + playstationGame2.gameName + "(" + playstationGame2.releaseYear + ") " + "(+" + playstationGame2.ageRestriction + ")");
                    System.out.println("--------------------------------------------------------");
                    break;
                }
                else {
                    System.out.println("Wrong button ");
                    System.out.println("--------------------------------------------------------");
                }
            }
        }
        else if (op == 3){
            System.out.println("1- Rb   " +  "2- Rt   " + "3- Lb   " + "4- Lt    " + "5 - exit" );
            for (int i = 0; i < 5;i--){
                System.out.print("Enter the button number you wish to press : ");
                int butx = sc.nextInt();
                if (butx == 1) {
                    xboxGame1.Rb();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 2) {
                    xboxGame1.Rt();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 3) {
                    xboxGame1.Lb();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 4) {
                    xboxGame1.Lt();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 5) {
                    System.out.println("Thank you for playing " + xboxGame1.gameName + "(" + xboxGame1.releaseYear + ") " + "(+" + xboxGame1.ageRestriction + ")");
                    System.out.println("--------------------------------------------------------");
                    break;
                }
                else {
                    System.out.println("Wrong button ");
                    System.out.println("--------------------------------------------------------");
                }
            }
        }
        else if (op == 4){
            System.out.println("1- Rb   " +  "2- Rt   " + "3- Lb   " + "4- Lt    " + "5 - exit" );
            for (int i = 0; i < 5;i--){
                System.out.print("Enter the button number you wish to press : ");
                int butx = sc.nextInt();
                if (butx == 1) {
                    xboxGame1.Rb();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 2) {
                    xboxGame1.Rt();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 3) {
                    xboxGame1.Lb();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 4) {
                    xboxGame1.Lt();
                    System.out.println("--------------------------------------------------------");
                }
                else if (butx == 5) {
                    System.out.println("Thank you for playing " + xboxGame2.gameName + "(" + xboxGame2.releaseYear + ") " + "(+" + xboxGame2.ageRestriction + ")");
                    System.out.println("--------------------------------------------------------");
                    break;
                }
                else {
                    System.out.println("Wrong button ");
                    System.out.println("--------------------------------------------------------");
                }
            }
        }
    }
}

interface XboxController {
    abstract void Rb();
    abstract void Rt();
    abstract void Lb();
    abstract void Lt();
}
interface PlaystaionController {
    abstract void R1();
    abstract void R2();
    abstract void L1();
    abstract void L2();
}
abstract class ConsoleGame {
    protected String gameName;
    protected int releaseYear;
    protected int ageRestriction;

    public ConsoleGame(String gameName, int releaseYear, int ageRestriction){
        this.gameName = gameName;
        this.releaseYear = releaseYear;
        this.ageRestriction = ageRestriction;
    }
    abstract void run();
    abstract void jump();
    abstract void aim();
    abstract void shoot();

}
class PlaystationGame extends ConsoleGame implements PlaystaionController {
    public PlaystationGame(String gameName, int releaseYear, int ageRestriction) {
        super(gameName, releaseYear, ageRestriction);
    }
    @Override
    public void run() {}
    @Override
    public void jump() {}
    @Override
    public void aim() {}
    @Override
    public void shoot() {}
    @Override
    public void L1() {}
    @Override
    public void L2() {}
    @Override
    public void R1() {}
    @Override
    public void R2() {}
}
class XboxGame extends ConsoleGame implements XboxController {
    public XboxGame(String gameName, int releaseYear, int ageRestriction) {
        super(gameName, releaseYear, ageRestriction);
    }
    @Override
    public void run() {}
    @Override
    public void jump() {}
    @Override
    public void aim() {}
    @Override
    public void shoot() {}
    @Override
    public void Rb() {}
    @Override
    public void Rt() {}
    @Override
    public void Lb(){}
    @Override
    public void Lt(){}
}

