package sample;

import java.util.Scanner;


public class Main
{






    private static int objetpris = 0;
    private static int inventaire = 0;
    private static int limiteinventaire = 4;
    private static int placerestante = limiteinventaire - inventaire;
    private static String [] itemsinventaire = new String [limiteinventaire];
    private static String objet = "aucun objet";

    private static boolean continuer = false;
    private static boolean continuer1 = false;

    private static boolean nord = false;
    private static boolean est = false;
    private static boolean ouest = false;

    private static String reponse = " ";
    private static boolean ordinateur = false;
    private static boolean gel = false;
    private static boolean enceinte = false;
    private static boolean sortir = false;
    private static boolean observer = false;



    //méthose d'analyse d'entrée de l'utilisateur
    public static void recherchemots() {
        Scanner sc = new Scanner(System.in);
        reponse = sc.nextLine();
        //ints qui permettent la recherche dans l'input les mots "ordinateur", "enceinte", "gel" ...
        int recherchepartir = reponse.indexOf("partir");
        int recherchesortir = reponse.indexOf("sortir");
        int rechercheordi = reponse.indexOf("ordinateur");
        int rechercheenceinte = reponse.indexOf("enceinte");
        int recherchegel = reponse.indexOf("gel");
        int rechercheinventaire = reponse.indexOf("inventaire");
        int rechercheobserver = reponse.indexOf("observer");
        int rechercheregarder = reponse.indexOf("regarder");


        if (rechercheordi >= 0) {
            ordinateur = true;

        } else if (rechercheenceinte >= 0) {
            enceinte = true;

        } else if (recherchegel >= 0 && objetpris == 0) {
            gel = true;

        } else if (recherchesortir >= 0 || recherchepartir >= 0) {
            sortir = true;

        } else if (rechercheinventaire >= 0) {
            try {
                Main.afficherinventaire(inventaire);
            } catch (ArrayIndexOutOfBoundsException e) {

            }

        }else if (rechercheobserver >= 0  || rechercheregarder >= 0) {
            observer = true;

        }else{

            System.out.println("\n \n  Hein?? Veuillez repeter.");


        }

    }






    //methode d'analyse d'entree pour la direction a prendre
    public static void direction(){
        System.out.println("Aller au Nord(n), a l'Est(e), ou a l'ouest(o)?");
        Scanner sc = new Scanner(System.in);
        boolean continuer1 = false;
        while(continuer1 == false){
            String reponse = sc.nextLine();
            char i = reponse.charAt(0);
            if(i == 'n'){
                nord = true;
                continuer1 = true;
            }else if(i == 'e'){
                est = true;
                continuer1 = true;
            }else if(i == 'o'){
                ouest = true;
                continuer1 = true;
            }
        }
    }


//methode d'affichage des items de l'inventaire

    public static String afficherinventaire(int inventaire){
        System.out.println("\n \n Vous avez " +inventaire+ " objets dans votre inventaire:");


        System.out.println("-" +itemsinventaire[inventaire -1]);
        return("bip");

    }


//methode d'addition d'un objet dans l'inventaire

    public static String mettreItemInventaire(String objet, int placerestante){


        Scanner sc = new Scanner(System.in);
        System.out.println(" Il vous reste " + placerestante + " places libres dans votre inventaire. Voulez-vous ranger cet objet dans votre inventaire ?");
        String reponseobjet = sc.nextLine();
        if (reponseobjet.equalsIgnoreCase("oui")){
            itemsinventaire[inventaire] = objet;
            inventaire ++;
            System.out.println("Vous avez mis l'objet "+ objet +" dans votre inventaire. Tapez \"inventaire\" pour gerer votre inventaire.");
        }else if(reponseobjet.equalsIgnoreCase("non")){
            System.out.println("\n \n Ok");
            objetpris = 0;


        }
        return ("azertyuiop");
    }


    //*************************         main          ************************************************************************************
    public static void main(String[] args){
/*
       try{
           Fenetresaisie.Fenetre.label.setText("hello!");
       }catch (NullPointerException e){

       }
*/
        Audio song = new Audio();
        int i = 0; int j = 0;
        boolean musique = false;

        

        System.out.println("Bonjour, votre aventure va commencer,ceci est une version non definitive. Bonne aventure ! ^^");

        System.out.println("\n Votre aventure commence donc confinement, \n jour 61 dans votre nouvelle maison,ou le calme reigne, et vous pensez a tout \n ce que vous pourrez faire une fois le déconfinement atteint.Et oui, a peine emenage, vous ne pouvez meme pas profiter de l exterieur mais vous comptez vous faire un e autorisation de \n sortie...");

        System.out.println("\n Vous pouvez utiliser des commandes simples,\n (\"partir\", \"sortir\", \"Prendre tel objet\"...)");



        //question1 : debut
        while(continuer == false) {

            System.out.println("\n \n \n");
            if (objetpris == 0) {

                System.out.println("Vous voyez:\n ordinateur \n gel hydroalcolique \n enceinte bluetooth");
            } else {
                System.out.println("Vous voyez:\n ordinateur \n enceinte bluetooth");

            }



            Main.recherchemots();

            if(ordinateur == true){
                j++;
                if (j == 1) {
                    System.out.println("\n \n Votre ordinateur n'a plus de batterie");
                    ordinateur = false;
                }else if (j >= 3){
                    System.out.println("OOH! je vous dis que l'ordinateur n'a plus de batterie!!!");
                    j++;
                }else if (j >= 2 && i >= 3){
                    System.out.println("BON SANG MAIS VOUS ALLEZ ME SAOULER ENCORE LONGTEMPS!? \n VOUS M'ENERVEZ AVEC CETTE ENCEINTE DE MES DEUX, ET LA VOUS ME REPROCHEZ QUE L'ORDINATEUR EST INUTILE!!? \n SI C'EST COMME CA, AU REVOIR!!!!!");

                    try{
                        Thread.sleep(4000);

                    }catch(InterruptedException e){

                    }
                    System.out.println("\n\n\n\n\n\n ... \n\n\n");
                    try{
                        Thread.sleep(2000);

                    }catch(InterruptedException e){

                    }
                    System.out.println("Il semblerais que le narrateur soit parti.");


                    try{
                        Thread.sleep(2000);

                    }catch(InterruptedException e){

                    }
                    System.out.println("Bon... je vais donc le remplacer... (tiens! j'aime bien cette musique!)");





                }
            }

            if(enceinte == true){
                i++;
                System.out.println(i);
                if(musique == false){
                    song.start();
                    musique = true;
                    System.out.println("\n \n  Vous mettez de la musique. L'ambiance s'ameliore.Vous vous rendez compte que vous etiez stresse(e)\n mais...pourquoi? Quelque chose vous angoisse mais vous \n ne savez pas quoi...Surement un mauvais presentiment...");

                }else{
                    if (i == 2){
                        System.out.println("\n \n Vous avez deja mis de la musique. Je pense sincerement qu'il vous faut un sonotone.");
                    }else if (i == 3){
                        System.out.println("\n \n JE SUIS DEJA BIEN GENTIL DE METTRE DE LA MUSIQUE, ALORS NE ME SAOULEZ PAS AVEC\n VOS CHOIX DIFFICILES! VOUS VOULIEZ DE LA MUSIQUE,\n EH BEN LA VOILA VOTRE MUSIQUE!!!");

                    }

                }


                enceinte = false;
            }

            if(gel == true){
                objet = "gel";
                objetpris =1;

                Main.mettreItemInventaire(objet, placerestante);
                gel = false;

            }

            if(sortir == true) {
                System.out.println("\n \n Vous sortez pour vous changer les idees.L'air frais vous fera du bien. \n Ou voulez-vous aller?");
                continuer = true;
                sortir = false;
            }
        }



        Scanner sc = new Scanner(System.in);
        ouest = false;
        est = false;
        nord = false;
        continuer = false;
        while(true){
            System.out.println("Vous n'avez encore rien explore.");

            Main.direction();

            //si le Nord est choisi
            //         System.out.println("***debug!!*** salut, nord=" +nord+ " ouest=" +ouest+ " est=" +est);
            if(nord == true){
                System.out.println("\n \n Vous allez vers le Nord...Vous voyez un batiment au loin, y aller?");
                reponse = sc.nextLine();
                if (reponse.equalsIgnoreCase("oui")){
                    System.out.println("\n \n Vous decidez d'y aller. Apres tout, ce n'est qu'un grand immeuble. Pourquoi se mefier?");
                    break;

                }else if (reponse.equalsIgnoreCase("non")){
                    System.out.println("Vous vous sentez mal. Vous decider de rentrer, ou de prendre un autre chemin.\n Mais...Vous avez un mauvais presentiment\n Vous rebroussez chemin. Vous etes de nouveau devant chez vous.");
                    //retour au choix de la direction

                }else {
                    System.out.println("Je n'ai pas compris.");
                }




                //si l'ouest est choisi
                //  System.out.println("***debug!!*** salut, nord=" +nord+ " ouest=" +ouest+ " est=" +est);
            }else if(ouest == true){
                System.out.println("\n \n Vous allez vers l'ouest...Vous voyez un batiment au loin, y aller?");
                reponse = sc.nextLine();
                if (reponse.equalsIgnoreCase("oui")){
                    System.out.println("\n \n Vous decidez d'y aller. Vous vous sentez libre d'explorer cette nouvelle ville.");
                    break;


                }else if (reponse.equalsIgnoreCase("non")){
                    System.out.println("Vous vous sentez mal. Vous decider de rentrer, ou de prendre un autre chemin.\n Mais...Vous avez un mauvais presentiment\n Vous rebroussez chemin. Vous etes de nouveau devant chez vous.");
                    //retour au choix de la direction

                }else{
                    System.out.println("Je n'ai pas compris.Vous décidez de ne pas y aller.");
                }




                //si l'est est choisi
                // System.out.println("***debug!!*** salut, nord=" +nord+ " ouest=" +ouest+ " est=" +est);
            }else if(est == true){
                System.out.println("\n \n Vous allez vers l'est...Vous voyez un batiment au loin, y aller?");
                reponse = sc.nextLine();
                if (reponse.equalsIgnoreCase("oui")){
                    System.out.println("\n \n Vous decidez d'y aller. Vous vous sentez libre d'explorer cette nouvelle ville.");
                    break;


                }else if (reponse.equalsIgnoreCase("non")){
                    System.out.println("Vous vous sentez mal. Vous decider de rentrer, ou de prendre un autre chemin.\n Mais...Vous avez un mauvais presentiment\n Vous rebroussez chemin. Vous etes de nouveau devant chez vous.");
                    //retour au choix de la direction

                }else{
                    System.out.println("Je n'ai pas compris.Vous décidez de ne pas y aller. Vous rentrez chez vous.");

                }

            }



        }

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){

        }
        song.stop();

        choc chocsong = new choc();
        chocsong.start();

/*
        try{
            Thread.sleep(500);

        }catch(InterruptedException e){

        }
         */

        String bannierec = "\n" +
                "░█████╗░\n" +
                "██╔══██╗\n" +
                "██║░░╚═╝\n" +
                "██║░░██╗\n" +
                "╚█████╔╝\n" +
                "░╚════╝░";

        String banniereo = "\n" +
                "        ░█████╗░\n" +
                "        ██╔══██╗\n" +
                "        ██║░░██║\n" +
                "        ██║░░██║\n" +
                "        ╚█████╔╝\n" +
                "        ░╚════╝░";
        String bannierer = "\n" +
                "                ██████╗░\n" +
                "                ██╔══██╗                               .ed\"\"\"\" \"\"\"$$$$be.\n" +
                "                ██████╔╝                             -\"           ^\"\"**$$$e.\n" +
                "                ██╔══██╗                           .\"                   '$$$c\n" +
                "                ██║░░██║                          /                      \"4$$b\n" +
                "                ╚═╝░░╚═╝                         d  3                      $$$$";

        String banniereo2 = "\n" +
                "                        ░█████╗░                 $  *                   .$$$$$$\n" +
                "                        ██╔══██╗                .$  ^c           $$$$$e$$$$$$$$.\n" +
                "                        ██║░░██║                d$L  4.         4$$$$$$$$$$$$$$b\n" +
                "                        ██║░░██║                $$$$b ^ceeeee.  4$$ECL.F*$$$$$$$\n" +
                "                        ╚█████╔╝                $$$$P d$$$$F $ $$$$$$$$$- $$$$$$\n" +
                "                        ░╚════╝░                3$$$F \"$$$$b   $\"$$$$$$$  $$$$*\"";

        String bannieren = "\n" +
                "                                ███╗░░██╗        $$P\"  \"$$b   .$ $$$$$...e$$\n" +
                "                                ████╗░██║         *c    ..    $$ 3$$$$$$$$$$eF\n" +
                "                                ██╔██╗██║           %ce\"\"    $$$  $$$$$$$$$$*\n" +
                "                                ██║╚████║            *$e.    *** d$$$$$\"L$$\n" +
                "                                ██║░╚███║             $$$      4J$$$$$% $$$\n" +
                "                                ╚═╝░░╚══╝            $\"'$=e....$*$$**$cz$$\"";

        String bannierea = "\n" +
                "                                        ░█████╗░     $  *=%4.$ L L$ P3$$$F\n" +
                "                                        ██╔══██╗     $   \"%*ebJLzb$e$$$$$b\n" +
                "                                        ███████║      %..      4$$$$$$$$$$\n" +
                "                                        ██╔══██║       $$$e   z$$$$$$$$$$ \n" +
                "                                        ██║░░██║        \"*$c  \"$$$$$$$P\"\n" +
                "                                        ╚═╝░░╚═╝          \"\"\"*$$$$$$$\"";

        String bannierez = "\n" +
                "                                                ███████╗\n" +
                "                                                ╚════██║\n" +
                "                                                ░░███╔═╝\n" +
                "                                                ██╔══╝░░\n" +
                "                                                ███████╗\n" +
                "                                                ╚══════╝";

        String bannieree = "\n" +
                "                                                        ███████╗\n" +
                "                                                        ██╔════╝\n" +
                "                                                        █████╗░░\n" +
                "                                                        ██╔══╝░░\n" +
                "                                                        ███████╗\n" +
                "                                                        ╚══════╝";

        String unchoc = "UN CHOC...";
        String toutestnoir = "TOUT EST NOIR";
        String cestlafin = "C'EST LA FIN";
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for (int k=0;k < toutestnoir.length(); k++) {
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {

            }
            System.out.print(toutestnoir.charAt(k));
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");




        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){

        }



        for (int k=0;k < unchoc.length(); k++) {
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {

            }
            System.out.print(unchoc.charAt(k));
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){

        }


        for (int k=0;k < cestlafin.length(); k++) {
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {

            }
            System.out.print(cestlafin.charAt(k));
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){

        }

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){

        }

        System.out.println("***debug!!*** salut, nord=" +nord+ " ouest=" +ouest+ " est=" +est);


        String[] banniere = new String[8];
        banniere[0] = bannierec;
        banniere[1] = banniereo;
        banniere[2] = bannierer;
        banniere[3] = banniereo2;
        banniere[4] = bannieren;
        banniere[5] = bannierea;
        banniere[6] = bannierez;
        banniere[7] = bannieree;



        for (int l=0;l < 8; l++){

            for (int k=0;k < banniere[l].length(); k++) {

                try {
                    Thread.sleep(1);

                } catch (InterruptedException e) {

                }

                System.out.print(banniere[l].charAt(k));
            }
        }






            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");



/*
        System.out.println("\n" +
                "░█████╗░░█████╗░██████╗░░█████╗░███╗░░██╗░█████╗░███████╗███████╗\n" +
                "██╔══██╗██╔══██╗██╔══██╗██╔══██╗████╗░██║██╔══██╗╚════██║██╔════╝\n" +
                "██║░░╚═╝██║░░██║██████╔╝██║░░██║██╔██╗██║███████║░░███╔═╝█████╗░░\n" +
                "██║░░██╗██║░░██║██╔══██╗██║░░██║██║╚████║██╔══██║██╔══╝░░██╔══╝░░\n" +
                "╚█████╔╝╚█████╔╝██║░░██║╚█████╔╝██║░╚███║██║░░██║███████╗███████╗\n" +
                "░╚════╝░░╚════╝░╚═╝░░╚═╝░╚════╝░╚═╝░░╚══╝╚═╝░░╚═╝╚══════╝╚══════╝");

*/
        String nomdujoueur;
        while(true){


            System.out.println("Entrez votre nom.");

            nomdujoueur = sc.nextLine();
            System.out.println("Votre nom est-il bien " + nomdujoueur + "?");
            reponse = sc.nextLine();
            if(reponse.equalsIgnoreCase("oui")){
               break;
            }else if (reponse.equalsIgnoreCase("non")){
                System.out.println("Ok,");

            }else{
                System.out.println("Je n'ai pas compris. Oui, ou Non?");
            }

        }

        System.out.println("ça marche !" + nomdujoueur);

        String str1 ="Vous vous réveillez au milieu d'une route. Vous avez mal à la tête, et vous voyez flou. L'air que vous respirez est etrangement lourd et humide. \n Tout est sombre, cela n'arrange pas votre vue... TAPEZ \"OBSERVER\" ou \"REGARDER\" pour regarder autour de vous.";



        for (int k=0;k < str1.length(); k++) {
            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {

            }
            System.out.print(str1.charAt(k));
        }

        System.out.println("\n");
        Main.recherchemots();

        if(observer == true){
            System.out.println("Vous voyez: ");

        }



    }

}