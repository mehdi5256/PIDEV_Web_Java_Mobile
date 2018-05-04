package com.mycompany.myapp;


import com.codename1.charts.util.ColorUtil;
import com.codename1.components.ImageViewer;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.io.Log;
import com.codename1.ui.Button;
import com.codename1.ui.CheckBox;
import com.codename1.ui.Component;
import com.codename1.ui.FontImage;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.mycompany.gui.Accueil;
import com.mycompany.gui.AffichageProduit;
import com.mycompany.gui.gui_Categorie;
import com.mycompany.gui.gui_Produit;
import java.io.IOException;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class MyApplication {

    private Form current;
    private Resources theme;
    public Form f;


    public void init(Object context) {
        theme = UIManager.initFirstTheme("/theme");

        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);

        // Pro only feature, uncomment if you have a pro subscription
        // Log.bindCrashProtection(true);
    }
    
    public void start() {
 f = new Form("Bienvenue Souk Lemdina",BoxLayout.y());
 Label l1 = new Label("Avec Souk_Lemdina,laissez l'Orient");
  Label l2 = new Label("s'inviter chez vous ! Nous vous");
 Label l3 = new Label(" proposons tous les produits ");
  Label l4 = new Label("du marché tunisien.");
  Button login = new Button(" login ",theme.getImage("cal_left_arrow.png"));




 ImageViewer img = new ImageViewer(theme.getImage("acceuil1.jpg"));
 img.setWidth(f.getWidth());
        img.setHeight(100);
          f.add(l1);
          f.add(l2);
          f.add(l3);
          f.add(l4);

        f.add(img);
        f.add(login);


         
 f.show();
     
     Label lNom = new Label("Souk Lemdina",theme.getImage("monlogo.png"));
     f.getToolbar().addComponentToSideMenu(lNom);
     
     f.getToolbar().addMaterialCommandToSideMenu("Gestion des produits", FontImage.MATERIAL_WEB  , new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent evt) {
//             Form f2 = new Form("Web Site", new FlowLayout(Component.CENTER, Component.CENTER));
//             Label l = new Label("Web Site");
//             f2.add(l);
//             f2.show();
//             f2.getToolbar().addCommandToLeftBar("Retour", theme.getImage("back-command.png"), new ActionListener() {
//
//                 @Override
//                 public void actionPerformed(ActionEvent evt) {
//               f.showBack();
//                     
//                 }
//             });
             AffichageProduit ap = new AffichageProduit();
             ap.getF().show();
             
             
             
             
         }
     });
      f.getToolbar().addMaterialCommandToSideMenu("Gestion des boutiques", FontImage.MATERIAL_WEB  , new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent evt) {
             Form f2 = new Form("Web Site", new FlowLayout(Component.CENTER, Component.CENTER));
             Label l = new Label("Amine");
             f2.add(l);
             f2.show();
             f2.getToolbar().addCommandToLeftBar("Retour", theme.getImage("back-command.png"), new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent evt) {
               f.showBack();
                     
                 }
             });
            
             
             
             
             
         }
     });
       f.getToolbar().addMaterialCommandToSideMenu("Gestion des actualités", FontImage.MATERIAL_WEB  , new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent evt) {
             Form f2 = new Form("Web Site", new FlowLayout(Component.CENTER, Component.CENTER));
             Label l = new Label("Akrem");
             f2.add(l);
             f2.show();
             f2.getToolbar().addCommandToLeftBar("Retour", theme.getImage("back-command.png"), new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent evt) {
               f.showBack();
                     
                 }
             });
            
             
             
             
             
         }
     });
        f.getToolbar().addMaterialCommandToSideMenu("Gestion des évenements", FontImage.MATERIAL_WEB  , new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent evt) {
             Form f2 = new Form("Web Site", new FlowLayout(Component.CENTER, Component.CENTER));
             Label l = new Label("Jawaher");
             f2.add(l);
             f2.show();
             f2.getToolbar().addCommandToLeftBar("Retour", theme.getImage("back-command.png"), new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent evt) {
               f.showBack();
                     
                 }
             });
             
             
             
             
         }
     });
         f.getToolbar().addMaterialCommandToSideMenu("Gestion livraision & SAV", FontImage.MATERIAL_WEB  , new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent evt) {
             Form f2 = new Form("Web Site", new FlowLayout(Component.CENTER, Component.CENTER));
             Label l = new Label("Lobna");
             f2.add(l);
             f2.show();
             f2.getToolbar().addCommandToLeftBar("Retour", theme.getImage("back-command.png"), new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent evt) {
               f.showBack();
                     
                 }
             });
            
             
             
             
             
         }
     });
     
     f.getToolbar().addMaterialCommandToSideMenu("Settings", FontImage.MATERIAL_SETTINGS, new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent evt) {
        Form f3 = new Form("Paramétres", new FlowLayout(Component.CENTER, Component.CENTER));
        Label l2 = new Label("Settings");
        f3.add(l2);
        f3.show();
        f3.getToolbar().addCommandToRightBar("Back", theme.getImage("back-command.png"), new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
           f.showBack();
                   
                
            }
        });
        
        
        
             
             
             
         }
     });
     
       
     f.getToolbar().addMaterialCommandToSideMenu("About", FontImage.MATERIAL_INFO, new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent evt) {
        
            Form f4 = new Form("A propos de nous", new FlowLayout(Component.CENTER, Component.CENTER));
        Label l2 = new Label("About");
        f4.add(l2);
        f4.show();
        f4.getToolbar().addCommandToOverflowMenu("Back", null, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
           f.showBack();
                   
                
            }
        });  
        f4.getToolbar().addCommandToOverflowMenu("Back", null, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
           f.showBack();
                   
                
            }
        });  
             
         }
     });
     
     
     f.show();
    }
       

    

    public void stop() {
        current = Display.getInstance().getCurrent();
        if(current instanceof Dialog) {
            ((Dialog)current).dispose();
            current = Display.getInstance().getCurrent();
        }
    }
    
    public void destroy() {
    }

    
     public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }
    
}
