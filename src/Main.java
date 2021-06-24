//package sample;
import java.lang.reflect.Array;
import java.util.Scanner;


/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. 
 * Creator: https://github.com/DR34M-M4K3R */


public class Main {

//
//                    ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
//                    ░   ░░░░░░░░░░░░░░░░░░░░░░   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░   ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░   ░░
//                    ▒   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒   ▒▒
//                    ▒   ▒▒   ▒   ▒▒▒▒▒▒▒▒▒▒▒▒▒   ▒▒▒▒▒   ▒▒▒▒▒   ▒▒▒▒▒   ▒▒▒▒   ▒▒▒▒▒   ▒▒▒▒   ▒▒▒▒▒  ▒   ▒▒▒    ▒   ▒   ▒▒▒▒▒   ▒▒▒▒▒▒   ▒   ▒▒▒▒    ▒
//                    ▓   ▓▓   ▓▓   ▓▓▓▓▓▓▓▓   ▓   ▓▓▓  ▓▓▓   ▓▓▓   ▓▓▓   ▓▓▓  ▓▓▓   ▓▓   ▓▓   ▓▓   ▓▓  ▓▓   ▓▓▓   ▓▓  ▓▓   ▓▓  ▓▓▓   ▓▓▓   ▓▓   ▓▓▓   ▓▓
//                    ▓   ▓▓   ▓▓   ▓▓▓▓▓▓▓  ▓▓▓   ▓▓         ▓▓▓▓   ▓   ▓▓▓         ▓▓   ▓   ▓▓▓▓   ▓  ▓▓▓   ▓▓   ▓▓  ▓▓   ▓         ▓▓▓   ▓▓   ▓▓▓   ▓▓
//                    ▓   ▓▓   ▓▓   ▓▓▓▓▓▓▓  ▓▓▓   ▓▓  ▓▓▓▓▓▓▓▓▓▓▓▓     ▓▓▓▓  ▓▓▓▓▓▓▓▓▓   ▓▓   ▓▓   ▓▓   ▓   ▓▓▓   ▓▓  ▓▓   ▓  ▓▓▓▓▓▓▓▓▓▓   ▓▓   ▓▓▓   ▓▓
//                    █   █    ██   ████████   █   ████     ████████   ███████     ████   ████   █████   ██████    ██  ██   ███     ████    ██   ████   █
//                    ████████████████████████████████████████████████████████████████████████████████   ████████████████████████████████████████████████
//                    https://www.github.com/DR34M-M4K3R                                                     https://discord.com/users/725672294692945991
//


    // référence des dégats de chaque objet

    private static double degatgel = 1;
    private static double degatfeuille = 0.1;
    private static double degatmain = 2;
    private static double degatbriquet = 1;



    // l'inventaire
    private static boolean objetpris1 = false;
    private static boolean objetpris2 = false;
    private static boolean objetpris3 = false;
    private static int inventaire = 0;
    private static int limiteinventaire = 4;
    private static int placerestante = limiteinventaire - inventaire;
    private static String[] itemsinventaire = new String[limiteinventaire];
    private static String objet = "aucun objet";
    private static String objetdanslamain = "votre main";
    private static double degatcauses = degatmain;

    private static int limitebutin = 1;
    private static String[] itemsbutin = new String[limitebutin];


    //      association des dégats aux objets (basée sur l'inventaire.): associe à chaque objet un nombre de dégat causés à un objet/ennemi
    private static double[] listedegats = new double[100];


//       private static boolean continuer = false;             inutile ._.


    //      les directions

    private static boolean nord = false;
    private static boolean est = false;
    private static boolean ouest = false;


    //      variables diverses

    private static String reponse = " ";
    private static boolean sortir = false;
    private static boolean observer = false;
    private static double vieennemi;
    private static String output = " ";
    private static boolean voiture_ouverte = false;
    private static boolean butintrouve = false;



    //      ******* les objets *******

    private static boolean gel = false;
    private static boolean feuille = false;
    private static boolean briquet = false;
    private static boolean lunettes = false;
    private static boolean telephone  = false;




    //      *******  les interactions! *******

    private static boolean enceinte = false;
    private static boolean ordinateur = false;
    private static boolean voiture = false;
    private static boolean dedans = false;
    private static boolean dessus = false;
    private static boolean suicide = false;
    private static boolean frapper = false;
    private static boolean prendre = false;
    private static boolean fouiller = false;
    private static boolean redescendre = false;



    //      méthode d'criture lettre par lettre

    public static void output(String output) {

        System.out.println("\n\n");

        for(int k = 0;k<output.length();k++){
            try {
                Thread.sleep(15);

            } catch (InterruptedException e) {

            }
            System.out.print(output.charAt(k));
        }
        System.out.print("\n\n");

    }



    //méthose d'analyse d'entrée de l'utilisateur
    public static void recherchemots() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        reponse = sc.nextLine();
        //ints de l'index de l'analyseur syntaxique

        int recherchegel = reponse.indexOf("gel");
        int recherchefeuille = reponse.indexOf("feuille");
        int recherchebriquet = reponse.indexOf("briquet");
        int recherchelunettes = reponse.indexOf("lunettes");
        int recherchetelephone = reponse.indexOf("téléphone");


        int recherchepartir = reponse.indexOf("partir");
        int recherchesortir = reponse.indexOf("sortir");
        int rechercheordi = reponse.indexOf("ordinateur");
        int rechercheenceinte = reponse.indexOf("enceinte");
        int rechercheinventaire = reponse.indexOf("inventaire");
        int rechercheobserver = reponse.indexOf("observer");
        int rechercheregarder = reponse.indexOf("regarder");
        int recherchevoiture = reponse.indexOf("voiture");
        int recherchededans = reponse.indexOf("dedans");
        int recherchedessus = reponse.indexOf("dessus");
        int recherchesuicide = reponse.indexOf("suicide");
        int recherchefrapper = reponse.indexOf("frapper");
        int rechercheequiper = reponse.indexOf("équiper");
        int rechercheprendre = reponse.indexOf("prendre");
        int rechercheinfo = reponse.indexOf("info");
        int recherchefouiller = reponse.indexOf("fouiller");
        int rechercheredescendre = reponse.indexOf("redescendre");


        enceinte = false;
        ordinateur = false;
        gel = false;
        feuille = false;
        voiture = false;
        dedans = false;
        dessus = false;
        suicide = false;
        frapper = false;
        prendre = false;
        fouiller = false;
        redescendre = false;


        if (recherchefouiller >= 0) {
            fouiller = true;

        }else

        if (rechercheprendre >= 0){
            prendre = true;

        }

        if (rechercheordi >= 0) {
            ordinateur = true;

        }else if (recherchesuicide >= 0) {
            suicide = true;

        }else if (recherchebriquet >= 0) {
            briquet = true;

        }else if (recherchelunettes >= 0) {
            lunettes = true;

        }else if (recherchetelephone >= 0) {
            telephone = true;

        }else if (rechercheinfo >= 0) {
            Main.output("vous avez "+objetdanslamain+" dans la main.");
            Main.output("Vous causez alors "+degatcauses+" dégats.");



        }else if (rechercheequiper >= 0) {
            int k = 0;
            boolean found = false;
            while(k<limiteinventaire) {
                try {
                    if (reponse.contains(itemsinventaire[k])) {
                        objetdanslamain = itemsinventaire[k];
                        degatcauses = listedegats[k];
                        Main.output("Vous avez équipé l'objet " + itemsinventaire[k]+" dans votre main.");
                        found = true;
                        break;
                    }
                }catch (NullPointerException e){
                    break;
                }
                k++;
            }
            if (!found){
                Main.output("Vous ne possédez pas cet objet.");
            }



        }else if (recherchefrapper >= 0) {
            frapper = true;

        }else if (rechercheenceinte >= 0) {
            enceinte = true;

        }else if (rechercheredescendre >= 0) {
            redescendre = true;

        }else if (recherchededans >= 0) {
            dedans = true;

        }else if (recherchedessus >= 0) {
            dessus = true;

        }else if (recherchegel >= 0 && !objetpris1) {
            gel = true;

        }else if (recherchevoiture >= 0){
            voiture = true;

        } else if (recherchesortir >= 0 || recherchepartir >= 0) {
            sortir = true;

        } else if (rechercheinventaire >= 0) {
            try {
                Main.afficherinventaire(inventaire);
            } catch (ArrayIndexOutOfBoundsException e) {

            }

        }else if (recherchefeuille >= 0 && !objetpris1){
            feuille = true;

        }else if (rechercheobserver >= 0  || rechercheregarder >= 0) {
            observer = true;

        }else{

            Main.output("  Hein?? Veuillez repeter.");


        }

    }



    public static void affichagebutin(String sourcedebutin, String ... args){
        Scanner sc = new Scanner(System.in);
        butintrouve = true;
        fouiller = false;
        output("Vous fouillez "+sourcedebutin);
        try {Thread.sleep(2000);}catch(InterruptedException e){}


        Main.output("Vous avez trouvé:");
        for (String arg : args) {
            System.out.println("\n -"+arg);
        }
        output("Quel objet voulez-vous prendre?");
        Main.recherchemots();

        if (briquet){
            mettreItemInventaire("briquet", degatbriquet);
            objetpris1 = true;

        }if (lunettes){
            mettreItemInventaire("briquet", 0.2);
            objetpris2 = true;

        }if (telephone){
            mettreItemInventaire("telephone", 0.2);
            objetpris3 = true;

        }

    }


    //methode d'analyse d'entree pour la direction a prendre
    public static void direction(){
        Main.output("Aller au Nord(n), a l'Est(e), ou a l'ouest(o)?");
        Scanner sc = new Scanner(System.in);
        while(true){
            String reponse = sc.nextLine();
            char i = reponse.charAt(0);
            if(i == 'n'){
                nord = true;
                break;
            }else if(i == 'e'){
                est = true;
                break;
            }else if(i == 'o'){
                ouest = true;
                break;
            }
        }
    }


//methode d'affichage des items de l'inventaire

    public static String afficherinventaire(int inventaire){
        Main.output(" Vous avez " +inventaire+ " objets dans votre inventaire:");

        for (int g = -1;g < inventaire -1; g ++ )
            Main.output("-" +itemsinventaire[g +1]);
        return("bip");

    }


//methode d'addition d'un objet dans l'inventaire

    public static String mettreItemInventaire(String objet, double degatobjet){
        objetpris1 = true;
        while(true) {
            Scanner sc = new Scanner(System.in);
            Main.output(" Il vous reste " + (limiteinventaire - inventaire) + " places libres dans votre inventaire. Voulez-vous ranger cet objet dans votre inventaire ?");
            String reponseobjet = sc.nextLine();
            if (reponseobjet.equalsIgnoreCase("oui")) {
                itemsinventaire[inventaire] = objet;
                listedegats[inventaire] = degatobjet;
                inventaire++;
                Main.output("Vous avez mis l'objet " + objet + " dans votre inventaire. Tapez \"inventaire\" pour voir votre inventaire.");
                break;

            } else if (reponseobjet.equalsIgnoreCase("non")) {
                Main.output(" Ok");
                objetpris1 = false;
                break;

            }else{
                Main.output("je n'ai pas compris.");
            }
        }
        prendre = false;
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
        sample.Audio song = new sample.Audio();
        int i = 0; int j = 0;
        boolean musique = false;



        System.out.println("Bonjour, votre aventure va commencer,ceci est une version non definitive. Bonne aventure ! ^^");

        System.out.println("\n Votre aventure commence donc confinement, \n jour 61 dans votre nouvelle maison,ou le calme reigne, et vous pensez a tout \n ce que vous pourrez faire une fois le déconfinement atteint.Et oui, a peine emenage, vous ne pouvez meme pas profiter de l exterieur mais vous comptez vous faire un e autorisation de \n sortie...");

        System.out.println("\n Vous pouvez utiliser des commandes simples,\n (\"partir\", \"sortir\", \"Prendre tel objet\"...)");



        //question1 : debut
        while(true) {

            System.out.println("\n \n \n");
            if (!objetpris1) {

                Main.output("Vous voyez:\n ordinateur \n gel hydroalcolique \n enceinte bluetooth");
            } else {
                Main.output("Vous voyez:\n ordinateur \n enceinte bluetooth");

            }



            Main.recherchemots();

            if(ordinateur){
                j++;
                if (j == 1) {
                    Main.output(" Votre ordinateur n'a plus de batterie");
                    ordinateur = false;
                }else if (j >= 3){
                    Main.output("OOH! je vous dis que l'ordinateur n'a plus de batterie!!!");
                    j++;
                }else if (j >= 2 && i >= 3){
                    Main.output("BON SANG MAIS VOUS ALLEZ ME SAOULER ENCORE LONGTEMPS!? \n VOUS M'ENERVEZ AVEC CETTE ENCEINTE DE MES DEUX, ET LA VOUS ME REPROCHEZ QUE L'ORDINATEUR EST INUTILE!!? \n SI C'EST COMME CA, AU REVOIR!!!!!");

                    try{
                        Thread.sleep(4000);

                    }catch(InterruptedException e){

                    }
                    Main.output("\n\n\n\n\n\n ... \n\n\n\n");
                    try{
                        Thread.sleep(2000);

                    }catch(InterruptedException e){

                    }
                    Main.output("Il semblerais que le narrateur soit parti.");


                    try{
                        Thread.sleep(2000);

                    }catch(InterruptedException e){

                    }
                    Main.output("Bon... je vais donc le remplacer... (tiens! j'aime bien cette musique!)");


                }
            }else if(suicide){
                Main.output("Vous ouvrez la fenêtre, puis vous sautez. Vous mourez sur le coup. Vous êtes maintenant un fantôme.");
                suicide = false;


            }else if(enceinte){
                i++;
                System.out.println(i);
                if(!musique){
                    song.start();
                    musique = true;
                    Main.output("  Vous mettez de la musique. L'ambiance s'ameliore.Vous vous rendez compte que vous etiez stresse(e)\n mais...pourquoi? Quelque chose vous angoisse mais vous \n ne savez pas quoi...Surement un mauvais presentiment...");

                }else{
                    if (i == 2){
                        Main.output(" Vous avez deja mis de la musique. Je pense sincerement qu'il vous faut un sonotone.");
                    }else if (i == 3){
                        Main.output(" JE SUIS DEJA BIEN GENTIL DE METTRE DE LA MUSIQUE, ALORS NE ME SAOULEZ PAS AVEC\n VOS CHOIX DIFFICILES! VOUS VOULIEZ DE LA MUSIQUE,\n EH BEN LA VOILA VOTRE MUSIQUE!!!");

                    }

                }

                enceinte = false;


            }else if(prendre && gel){
                objetpris1 = true;

                Main.mettreItemInventaire("gel", degatgel);
                gel = false;
                prendre = false;


            }else if(sortir) {
                Main.output(" Vous sortez pour vous changer les idees.L'air frais vous fera du bien. \n Ou voulez-vous aller?");
                sortir = false;
                break;
            }
        }



        Scanner sc = new Scanner(System.in);
        ouest = false;
        est = false;
        nord = false;
        while(true){
            Main.output("Vous n'avez encore rien explore.");

            Main.direction();

            //si le Nord est choisi
            //         System.out.println("***debug!!*** salut, nord=" +nord+ " ouest=" +ouest+ " est=" +est);
            if(nord){
                Main.output(" Vous allez vers le Nord...Vous voyez un batiment au loin, y aller?");
                reponse = sc.nextLine();
                if (reponse.equalsIgnoreCase("oui")){
                    Main.output(" Vous decidez d'y aller. Apres tout, ce n'est qu'un grand immeuble. Pourquoi se mefier?");
                    break;

                }else if (reponse.equalsIgnoreCase("non")){
                    Main.output("Vous vous sentez mal. Vous decider de rentrer, ou de prendre un autre chemin.\n Mais...Vous avez un mauvais presentiment\n Vous rebroussez chemin. Vous etes de nouveau devant chez vous.");
                    //retour au choix de la direction

                }else {
                    Main.output("Je n'ai pas compris.");
                }




                //si l'ouest est choisi
                //  Main.output("***debug!!*** salut, nord=" +nord+ " ouest=" +ouest+ " est=" +est);
            }else if(ouest){
                Main.output(" Vous allez vers l'ouest...Vous voyez un batiment au loin, y aller?");
                reponse = sc.nextLine();
                if (reponse.equalsIgnoreCase("oui")){
                    Main.output(" Vous decidez d'y aller. Vous vous sentez libre d'explorer cette nouvelle ville.");
                    break;


                }else if (reponse.equalsIgnoreCase("non")){
                    Main.output("Vous vous sentez mal. Vous decider de rentrer, ou de prendre un autre chemin.\n Mais...Vous avez un mauvais presentiment\n Vous rebroussez chemin. Vous etes de nouveau devant chez vous.");
                    //retour au choix de la direction

                }else{
                    Main.output("Je n'ai pas compris.Vous décidez de ne pas y aller.");
                }




                //si l'est est choisi
                // Main.output("***debug!!*** salut, nord=" +nord+ " ouest=" +ouest+ " est=" +est);
            }else if(est){
                Main.output(" Vous allez vers l'est...Vous voyez un batiment au loin, y aller?");
                reponse = sc.nextLine();
                if (reponse.equalsIgnoreCase("oui")){
                    Main.output(" Vous decidez d'y aller. Vous vous sentez libre d'explorer cette nouvelle ville.");
                    break;


                }else if (reponse.equalsIgnoreCase("non")){
                    Main.output("Vous vous sentez mal. Vous decider de rentrer, ou de prendre un autre chemin.\n Mais...Vous avez un mauvais presentiment\n Vous rebroussez chemin. Vous etes de nouveau devant chez vous.");
                    //retour au choix de la direction

                }else{
                    Main.output("Je n'ai pas compris.Vous décidez de ne pas y aller. Vous rentrez chez vous.");

                }

            }

        }


        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){

        }
        song.stop();

        sample.choc chocsong = new sample.choc();
        chocsong.start();



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
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for (int k=0;k < toutestnoir.length(); k++) {
            try {
                Thread.sleep(200);

            } catch (InterruptedException e) {

            }
            System.out.print(toutestnoir.charAt(k));
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");




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
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

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
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

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







        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");



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


            Main.output("Entrez votre nom.");

            nomdujoueur = sc.nextLine();
            Main.output("Votre nom est-il bien " + nomdujoueur + "?");
            reponse = sc.nextLine();
            if(reponse.equalsIgnoreCase("oui")){
                break;
            }else if (reponse.equalsIgnoreCase("non")){
                Main.output("Ok,");

            }else{
                Main.output("Je n'ai pas compris. Oui, ou Non?");
            }

        }

        Main.output("Vous vous réveillez au milieu d'une route. Toutes les voitures sont abandonnées, comme si il y avait eu une catastrophe. \nVous avez mal à la tête, et vous voyez flou. L'air que vous respirez est etrangement lourd et humide. \n Tout est sombre, cela n'arrange pas votre vue... TAPEZ \"OBSERVER\" ou \"REGARDER\" pour regarder autour de vous.");


/*

        for (int k=0;k < str1.length(); k++) {
            try {
                Thread.sleep(20);

            } catch (InterruptedException e) {

            }
            System.out.print(str1.charAt(k));
        }
*/


        objetpris1 = false;
        Main.recherchemots();
        while(true){
            System.out.println("\n");


            if(observer) {


                //question 2: entrée dans l'histoire.

                System.out.println("\n \n \n");

                if (objetpris1) {

                    Main.output("Vous voyez:\n une voiture \n");
                } else {
                    Main.output("Vous voyez:\n une feuille de papier \n une voiture");

                }


                Main.recherchemots();


                if (prendre && feuille){
                    Main.output("Vous vous dirigez pour ramasser cette feuille de papier.\n Il est ecrit quelque chose dessus. Mais vous n'arrivez pas à lire ce qu il y a marque dessus.");
                    objetpris1 = true;

                    Main.mettreItemInventaire("feuille", degatfeuille);
                    feuille = false;
                    prendre = false;

                }else if (voiture){
                    while(true) {
                        Main.output("Vous vous dirigez vers ce véhicule abandonné." +
                                "Vous pouvez:" +
                                "\nmonter DEDANS" +
                                "\nmonter DESSUS\n");

                        Main.recherchemots();
                        vieennemi = 5;
                        if (dedans){
                            try {Thread.sleep(1000);}catch(InterruptedException e){}
                            Main.output("La voiture est fermée à clef. la porte semble faible...");
                            dedans = false;

                        }else if (dessus){
                            Main.output("Vous montez sur la voiture...");
                            try {Thread.sleep(1000);}catch(InterruptedException e){}
                            while(true) {
                                if (voiture_ouverte){
                                    Main.output("Le brouillard vous empêche de voir très loin... vous pouvez:" +
                                            "\n -redescendre" +
                                            "\n -frapper le pare-brise" +
                                            "\n -fouiller la voiture");

                                }else{
                                    Main.output("Le brouillard vous empêche de voir très loin... vous pouvez:" +
                                            "\n -redescendre" +
                                            "\n -frapper le pare-brise");
                                }

                                Main.recherchemots();
                                if (frapper){
                                    Main.output("Vous frappez le pare brise avec "+ objetdanslamain);
                                    try {Thread.sleep(700);}catch(InterruptedException e){}
                                    vieennemi = vieennemi - degatcauses;
                                    if (vieennemi <= 0){
                                        Main.output("\nLe pare-brise est cassé. Vous avez accès à l'intérieur de la voiture");
                                        voiture_ouverte = true;
                                    }else if (vieennemi <= 5){
                                        Main.output("\nLe pare-brise se fissure.");

                                    }
                                    frapper = false;
                                }else if (redescendre){
                                    Main.output(" Vous redescendez de la voiture...");
                                    try {Thread.sleep(1000);}catch(InterruptedException e){}
                                    redescendre = false;
                                    break;

                                }else if (voiture_ouverte && fouiller && voiture){
                                    output("Vous fouillez toute la voiture...");
                                    affichagebutin("la voiture", "briquet", "lunettes", "téléphone");
//                                    butintrouve = true;
//                                    fouiller = false;

                                }/*else if (butintrouve && prendre && briquet && !objetpris1){
                                    objetpris1 = true;

                                    Main.mettreItemInventaire("briquet", degatbriquet);
                                    briquet = false;
                                    prendre = false;



                                }*/
                            }
                        }
                    }
                }
            }
        }
    }

}
