package app;

import models.Personne;

public class Application {
    
public static void main(String[] args) {
        Personne perso1 = new Personne("mao", "Thomas");
        Personne perso2 = new Personne("dinicher", "Anthony");
        Personne perso3 = new Personne("buchter", "Elia");

        perso1.TenterAjouterCopain(perso2);
        perso1.TenterAjouterCopain(perso3);
        perso2.TenterAjouterCopain(perso1);
        perso2.TenterAjouterCopain(perso3);
        perso3.TenterAjouterCopain(perso2);
        perso3.TenterAjouterCopain(perso1);
        System.out.println(perso1);
        System.out.println(perso2);
        System.out.println(perso3);
}

}
        //
        //              )        (                 ) (           (         (
        //           ( /(   *   ))\ )        (  ( /( )\ )        )\ )  (   )\ )
        //     (   ( )\())` )  /(()/((       )\ )\()|()/(  (    (()/(  )\ (()/(
        //     )\  )((_)\  ( )(_))(_))\    (((_|(_)\ /(_)) )\    /(_)|((_) /(_))
        //    ((_)((_)((_)(_(_()|_))((_)   )\___ ((_|_))_ ((_)  (_)) )\___(_))
        //    __   _____ _____ ___ ___    ___ ___  ___  ___   ___ ___ ___   _
        //    \ \ / / _ \_   _| _ \ __|  / __/ _ \|   \| __| |_ _/ __|_ _| | |
        //     \ V / (_) || | |   / _|  | (_| (_) | |) | _|   | | (__ | |  |_|
        //      \_/ \___/ |_| |_|_\___|  \___\___/|___/|___| |___\___|___| (_)
        //