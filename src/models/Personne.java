package models;

//import java.util.Scanner;

public class Personne {

        private String nom;
        private String prenom;
        public final static int MAX_COPAINS = 10;
        private Personne[] copains;
        private int nbCopains; 

        public String toString() {
                return prenom + " " + nom.toUpperCase()+ " et ses copains ("+copains+")";
        }

        public Personne(String nom, String prenom) {
                this.nom = nom;
                this.prenom = prenom;
                this.copains = new Personne[MAX_COPAINS];
                this.nbCopains = 0;
        }

        public String getNom() {
                return nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public boolean TenterAjouterCopain(Personne nouveauCopain) {

                if (nbCopains > MAX_COPAINS) {
                        System.out.println(prenom + " " + nom.toUpperCase() + " ne peut plus ajouter de copains");
                        return false;
                }

                else if (nouveauCopain == copains[nbCopains]) {
                        System.out.println(prenom + " " + nom.toUpperCase() + " est déjà un copain");
                        return false;
                } else {
                        nouveauCopain = copains[nbCopains];
                        System.out.println(nouveauCopain + " " + nom.toUpperCase() + " a été ajouté comme copain de "+ prenom+" "+nom.toUpperCase());
                        return true;
                }

        }


        public boolean TenterSupprimerCopain(Personne ancienCopain) {
                for (int i = 0; i < nbCopains; i++) {
                        if (copains[i] == ancienCopain) {
                            for (int j = i; j < nbCopains - 1; j++) {
                                copains[j] = copains[j + 1];
                            }
                            copains[nbCopains - 1] = null;
                            nbCopains--;
                            System.out.println(ancienCopain+" "+nom.toUpperCase() + " a été supprimé des copains de " + nom.toUpperCase());
                            return true;
                        }
                    }
                    System.out.println(ancienCopain+" "+nom.toUpperCase() + " n'est pas un copain de " + nom.toUpperCase());
                    return false;
                }
        }

//
// ) ( ) ( ( (
// ( /( * ))\ ) ( ( /( )\ ) )\ ) ( )\ )
// ( ( )\())` ) /(()/(( )\ )\()|()/( ( (()/( )\ (()/(
// )\ )((_)\ ( )(_))(_))\ (((_|(_)\ /(_)) )\ /(_)|((_) /(_))
// ((_)((_)((_)(_(_()|_))((_) )\___ ((_|_))_ ((_) (_)) )\___(_))
// __ _____ _____ ___ ___ ___ ___ ___ ___ ___ ___ ___ _
// \ \ / / _ \_ _| _ \ __| / __/ _ \| \| __| |_ _/ __|_ _| | |
// \ V / (_) || | | / _| | (_| (_) | |) | _| | | (__ | | |_|
// \_/ \___/ |_| |_|_\___| \___\___/|___/|___| |___\___|___| (_)
//
