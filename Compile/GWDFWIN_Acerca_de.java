/**
 * Code generated by WINDEV Mobile - DO NOT MODIFY!
 * WINDEV Mobile object: Fenêtre
 * Android class: WIN_Acerca_de
 * Date: 12/07/2021 14:54:03
 * Version of wdjava.dll: 23.0.98.0
 */


package com.mycompany.dreamglass.wdgen;


import com.mycompany.dreamglass.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFWIN_Acerca_de extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de WIN_Acerca_de
////////////////////////////////////////////////////////////////////////////

/**
 * BTN_Cerrar
 */
class GWDBTN_Cerrar extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de WIN_Acerca_de.BTN_Cerrar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2372370210111051959l);

super.setChecksum("575650298");

super.setNom("BTN_Cerrar");

super.setType(4);

super.setLibelle("Cerrar");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 180);

super.setTailleInitiale(300, 48);

super.setPlan(0);

super.setImageEtat(1);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(1);

super.setPresenceLibelle(true);

super.setImage("", 0, 2, 1, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4, 4, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4, 4, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4, 4, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("C:\\My Mobile Projects\\DreamGlass\\Templates\\WM\\210 Material Design Blue\\Material Design Blue_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Click BTN_Cerrar
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// close()
WDAPIFenetre.ferme();

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Cerrar mWD_BTN_Cerrar;

/**
 * STC_NoName1
 */
class GWDSTC_NoName1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de WIN_Acerca_de.STC_NoName1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2372370248765963137l);

super.setChecksum("575855365");

super.setNom("STC_NoName1");

super.setType(3);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Desing By Alan Parra");

super.setNote("", "");

super.setEtatInitial(0);

super.setPositionInitiale(8, 112);

super.setTailleInitiale(300, 53);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -16.000000, 0), 3, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 1, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSTC_NoName1 mWD_STC_NoName1;

/**
 * IMG_NoName1
 */
class GWDIMG_NoName1 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de WIN_Acerca_de.IMG_NoName1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2372371000388429734l);

super.setChecksum("579047617");

super.setNom("IMG_NoName1");

super.setType(30001);

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(58, 8);

super.setTailleInitiale(184, 96);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 4, 4, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_NoName1 mWD_IMG_NoName1;

/**
 * Traitement: Global declarations of WIN_Acerca_de
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
super.declarerGlobale(WD_tabParam);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre WIN_Acerca_de
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_BTN_Cerrar = new GWDBTN_Cerrar();
mWD_STC_NoName1 = new GWDSTC_NoName1();
mWD_IMG_NoName1 = new GWDIMG_NoName1();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre WIN_Acerca_de
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.setQuid(2372370072668134296l);

super.setChecksum("574360260");

super.setNom("WIN_Acerca_de");

super.setType(1);

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 240);

super.setTitre("Acerca de");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(3);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de WIN_Acerca_de
////////////////////////////////////////////////////////////////////////////
mWD_BTN_Cerrar.initialiserObjet();
super.ajouter("BTN_Cerrar", mWD_BTN_Cerrar);
mWD_STC_NoName1.initialiserObjet();
super.ajouter("STC_NoName1", mWD_STC_NoName1);
mWD_IMG_NoName1.initialiserObjet();
super.ajouter("IMG_NoName1", mWD_IMG_NoName1);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 0;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return false;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return false;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isThemeDark()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPDreamGlass.ms_Project.mWD_WIN_Acerca_de;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN BLUE#WM";
}
}
